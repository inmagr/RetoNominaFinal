/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.severoochoa.SpringBootReto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author inmag
 */

@Entity
@Table(name="nomina")
public class Nomina {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idnomina;

    public Long getIdnomina() {
        return idnomina;
    }

    public void setIdnomina(Long idnomina) {
        this.idnomina = idnomina;
    }

    public Long getIdtrab() {
        return idtrab;
    }

    public void setIdtrab(Long idtrab) {
        this.idtrab = idtrab;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getGrupoprofesional() {
        return grupoprofesional;
    }

    public void setGrupoprofesional(int grupoprofesional) {
        this.grupoprofesional = grupoprofesional;
    }

    public int getGrupocotizacion() {
        return grupocotizacion;
    }

    public void setGrupocotizacion(int grupocotizacion) {
        this.grupocotizacion = grupocotizacion;
    }

    public int getNivelcotizacion() {
        return nivelcotizacion;
    }

    public void setNivelcotizacion(int nivelcotizacion) {
        this.nivelcotizacion = nivelcotizacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(double salariobase) {
        this.salariobase = salariobase;
    }

    public double getGratificaciones() {
        return gratificaciones;
    }

    public void setGratificaciones(double gratificaciones) {
        this.gratificaciones = gratificaciones;
    }

    public double getPagasextra() {
        return pagasextra;
    }

    public void setPagasextra(double pagasextra) {
        this.pagasextra = pagasextra;
    }

    public double getPagasextrapro() {
        return pagasextrapro;
    }

    public void setPagasextrapro(double pagasextrapro) {
        this.pagasextrapro = pagasextrapro;
    }

    public double getTotaldevengado() {
        return totaldevengado;
    }

    public void setTotaldevengado(double totaldevengado) {
        this.totaldevengado = totaldevengado;
    }

    public double getCctrab() {
        return cctrab;
    }

    public void setCctrab(double cctrab) {
        this.cctrab = cctrab;
    }

    public double getDestrab() {
        return destrab;
    }

    public void setDestrab(double destrab) {
        this.destrab = destrab;
    }

    public double getFptrab() {
        return fptrab;
    }

    public void setFptrab(double fptrab) {
        this.fptrab = fptrab;
    }

    public double getHorasextrafm() {
        return horasextrafm;
    }

    public void setHorasextrafm(double horasextrafm) {
        this.horasextrafm = horasextrafm;
    }

    public double getHorasextra() {
        return horasextra;
    }

    public void setHorasextra(double horasextra) {
        this.horasextra = horasextra;
    }

    public double getIrpf() {
        return irpf;
    }

    public void setIrpf(double irpf) {
        this.irpf = irpf;
    }

    public double getTotaldeducir() {
        return totaldeducir;
    }

    public void setTotaldeducir(double totaldeducir) {
        this.totaldeducir = totaldeducir;
    }

    public double getTotalliquido() {
        return totalliquido;
    }

    public void setTotalliquido(double totalliquido) {
        this.totalliquido = totalliquido;
    }

    public double getAtep() {
        return atep;
    }

    public void setAtep(double atep) {
        this.atep = atep;
    }

    public double getDesemp() {
        return desemp;
    }

    public void setDesemp(double desemp) {
        this.desemp = desemp;
    }

    public double getFpemp() {
        return fpemp;
    }

    public void setFpemp(double fpemp) {
        this.fpemp = fpemp;
    }

    public double getFogasa() {
        return fogasa;
    }

    public void setFogasa(double fogasa) {
        this.fogasa = fogasa;
    }

    public double getTotalaporemp() {
        return totalaporemp;
    }

    public void setTotalaporemp(double totalaporemp) {
        this.totalaporemp = totalaporemp;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public double getHetrab() {
        return hetrab;
    }

    public void setHetrab(double hetrab) {
        this.hetrab = hetrab;
    }

    public double getHetrabfm() {
        return hetrabfm;
    }

    public void setHetrabfm(double hetrabfm) {
        this.hetrabfm = hetrabfm;
    }

    public double getHeempfm() {
        return heempfm;
    }

    public void setHeempfm(double heempfm) {
        this.heempfm = heempfm;
    }

    public double getHeemp() {
        return heemp;
    }

    public void setHeemp(double heemp) {
        this.heemp = heemp;
    }

    public double getCcEmp() {
        return ccemp;
    }

    public void setCcEmp(double ccEmp) {
        this.ccemp = ccEmp;
    }
    
   
    @Column(name="idtrab")
    private Long idtrab;
    
    @Column(name="domicilio")
    private String domicilio;
    
    @Column(name="grupoprofesional")
    private int grupoprofesional;
    
    @Column(name="grupocotizacion")
    private int grupocotizacion;
    
    @Column(name="nivelcotizacion")
    private int nivelcotizacion;
    
    @Column(name="categoria")
    private String categoria;
    
    @Column(name="convenio")
    private String convenio;
    
    @Column(name="salariobase")
    private double salariobase;
    
    @Column(name="gratificaciones")
    private double gratificaciones;
    
    @Column(name="pagasextra")
    private double pagasextra;
    
    @Column(name="pagasextrapro")
    private double pagasextrapro;
    
    @Column(name="totaldevengado")
    private double totaldevengado;
    
    /*@Column(name="porcentajecctrab")
    private double porcentajecctrab;*/

    @Column(name="cctrab")
    private double cctrab;
    
    @Column(name="destrab")
    private double destrab;
    
    /*@Column(name="porcentajefptrab")
    private double porcentajefptrab;*/
    
    @Column(name="fptrab")
    private double fptrab;
    
    /*@Column(name="porcentajehefm")
    private double porcentajehefm;*/
    
    @Column(name="horasextrafm")
    private double horasextrafm;
    
     @Column(name="horasextra")
    private double horasextra;
    
    /*@Column(name="porcentajeirpf")
    private double porcentajeirpf;*/
    
    @Column(name="irpf")
    private double irpf;
    
    @Column(name="totaldeducir")
    private double totaldeducir;
    
    @Column(name="totalliquido")
    private double totalliquido;
    
    /*@Column(name="remuneracionemp")
    private double remuneracionemp;*/
    
   /* @Column(name="prorratapagaextra")
    private double prorratapagaextra;
    
    @Column(name="baseinctemp")
    private double baseinctemp;
    
    @Column(name="devengadossemp") 
    private double devengadossemp;
    
    @Column(name="porcentajeempss")
    private double porcentajeempss;
    
    @Column(name="ssemp")
    private double ssemp;
    
    @Column(name="basecp")
    private double basecp;
    
    @Column(name="porcentajedesemp")
    private double porcentajedesemp;*/
    
    @Column(name="atep")
    private double atep;
        
    @Column(name="desemp")
    private double desemp;
    
    /*@Column(name="porcentajefpemp")
    private double porcentajefpemp;*/
    
    @Column(name="fpemp")
    private double fpemp;
    
   /* @Column(name="porcentajefogasa")
    private double porcentajefogasa;*/
    
    @Column(name="fogasa")
    private double fogasa;
    
    /*@Column(name="porcentajecothe")
    private double porcentajecothe;
    
    @Column(name="cothe")
    private double cothe;*/
    
    @Column(name="totalaporemp")
    private double totalaporemp;
    
    /*@Column(name="baseretenirpf")
    private double baseretenirpf;*/
    
    @Column(name="fechainicio")
    private String fechainicio;
    
    @Column(name="fechafin")
    private String fechafin;
    
    @Column(name="hetrab") //añadir a la bd
    private double hetrab;
    
    @Column(name="hetrabfm") //añadir a la bd
    private double hetrabfm;
    
    @Column(name="heempfm") //añadir a la bd
    private double heempfm;
    
    @Column(name="heemp") //añadir a la bd
    private double heemp;
    
    @Column(name="ccemp") //añadir a la bd
    private double ccemp;
    
    @Column(name="dieta") //añadir a la bd
    private double dieta;

    public double getDieta() {
        return dieta;
    }

    public void setDieta(double dieta) {
        this.dieta = dieta;
    }
    
}
