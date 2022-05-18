/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.severoochoa.SpringBootReto;


import java.io.ByteArrayOutputStream;



import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.StringReader;
import java.util.Optional;


import javax.xml.parsers.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.w3c.dom.*;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;


/**
 *
 * @author inmag
 */
@Service
public class NominaService {
    @Autowired
    EmpresaRepository repositorioEmpresa;
    
    @Autowired
    TrabajadorRepository repositorioTrabajador;
    
    public void getFileContent(HttpServletRequest request) throws IOException{
        String fileContent= "";
        try {
           InputStream input = request.getInputStream();

           byte[] data = new byte [1024];
           ByteArrayOutputStream buffer = new ByteArrayOutputStream();
           int nRead; 
           while ((nRead = input.read(data, 0, data.length)) != -1){
               buffer.write(data, 0, nRead);
           }
           buffer.flush();
           fileContent = new String(buffer.toByteArray());
           
        }catch (IOException ex){
            System.err.println("Error 1! " + ex.getMessage());
        }
       
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder;
    Document doc;
    try {
      builder = factory.newDocumentBuilder();
      doc = (Document) builder.parse(new InputSource(new StringReader(fileContent)));
      doc.getDocumentElement().normalize();
      System.out.println("Root : " + doc.getDocumentElement().getNodeName());
      System.out.println("\nSalarios in the xml: ");
      NodeList nameList = doc.getElementsByTagName("salarios");
      for (int i = 0; i < nameList.getLength(); i++) {
        //Element el = (Element) nameList.item(i);
        //System.out.println(el.getNodeName() + "element : " + el.getTextContent());
        Node node = nameList.item(i);
        if (node.getNodeType() == Node.ELEMENT_NODE){
            Element element = (Element)node;
            String anyo = element.getAttribute("anyo");
            String salario = element.getElementsByTagName("salario").item(0).getTextContent();
            System.out.println(salario);
        }
        
        
    }
    } catch (SAXException | IOException | ParserConfigurationException e) {
        System.err.println("Error! " + e.getMessage());
        }
    }
    
    public Empresa getEmpresaById(Long idemp){
        Optional<Empresa> empresa = repositorioEmpresa.findByIdemp(idemp);
        if (empresa.isPresent()){
            return empresa.get();
        } else {
            return null;
        }
    }
    
     public Trabajador getTrabajadorById(Long idtrab){
        Optional<Trabajador> trabajador = repositorioTrabajador.findByIdtrab(idtrab);
        if (trabajador.isPresent()){
            return trabajador.get();
        } else {
            return null;
        }
    }
}
    

