/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iamriven;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Juan Antonio
 */
@Entity
@Table(name = "equipamientomejorado")
@NamedQueries({
    @NamedQuery(name = "Equipamientomejorado.findAll", query = "SELECT e FROM Equipamientomejorado e"),
    @NamedQuery(name = "Equipamientomejorado.findById", query = "SELECT e FROM Equipamientomejorado e WHERE e.equipamientomejoradoPK.id = :id"),
    @NamedQuery(name = "Equipamientomejorado.findByIdequipo", query = "SELECT e FROM Equipamientomejorado e WHERE e.equipamientomejoradoPK.idequipo = :idequipo"),
    @NamedQuery(name = "Equipamientomejorado.findByNivel", query = "SELECT e FROM Equipamientomejorado e WHERE e.nivel = :nivel"),
    @NamedQuery(name = "Equipamientomejorado.findByPeso", query = "SELECT e FROM Equipamientomejorado e WHERE e.peso = :peso"),
    @NamedQuery(name = "Equipamientomejorado.findByAp", query = "SELECT e FROM Equipamientomejorado e WHERE e.ap = :ap"),
    @NamedQuery(name = "Equipamientomejorado.findByDp", query = "SELECT e FROM Equipamientomejorado e WHERE e.dp = :dp"),
    @NamedQuery(name = "Equipamientomejorado.findByAccuraccy", query = "SELECT e FROM Equipamientomejorado e WHERE e.accuraccy = :accuraccy"),
    @NamedQuery(name = "Equipamientomejorado.findByEvasion", query = "SELECT e FROM Equipamientomejorado e WHERE e.evasion = :evasion"),
    @NamedQuery(name = "Equipamientomejorado.findByDamageReduction", query = "SELECT e FROM Equipamientomejorado e WHERE e.damageReduction = :damageReduction"),
    @NamedQuery(name = "Equipamientomejorado.findByCronStones", query = "SELECT e FROM Equipamientomejorado e WHERE e.cronStones = :cronStones")})
public class Equipamientomejorado implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EquipamientomejoradoPK equipamientomejoradoPK;
    @Basic(optional = false)
    @Column(name = "nivel")
    private int nivel;
    @Basic(optional = false)
    @Column(name = "peso")
    private double peso;
    @Basic(optional = false)
    @Column(name = "ap")
    private int ap;
    @Basic(optional = false)
    @Column(name = "dp")
    private int dp;
    @Basic(optional = false)
    @Column(name = "accuraccy")
    private int accuraccy;
    @Basic(optional = false)
    @Column(name = "evasion")
    private int evasion;
    @Basic(optional = false)
    @Column(name = "damage_reduction")
    private int damageReduction;
    @Basic(optional = false)
    @Column(name = "cron_stones")
    private int cronStones;
    @JoinColumn(name = "idequipo", referencedColumnName = "idequipo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Equipamiento equipamiento;

    public Equipamientomejorado() {
    }

    public Equipamientomejorado(EquipamientomejoradoPK equipamientomejoradoPK) {
        this.equipamientomejoradoPK = equipamientomejoradoPK;
    }

    public Equipamientomejorado(EquipamientomejoradoPK equipamientomejoradoPK, int nivel, double peso, int ap, int dp, int accuraccy, int evasion, int damageReduction, int cronStones) {
        this.equipamientomejoradoPK = equipamientomejoradoPK;
        this.nivel = nivel;
        this.peso = peso;
        this.ap = ap;
        this.dp = dp;
        this.accuraccy = accuraccy;
        this.evasion = evasion;
        this.damageReduction = damageReduction;
        this.cronStones = cronStones;
    }

    public Equipamientomejorado(int id, int idequipo) {
        this.equipamientomejoradoPK = new EquipamientomejoradoPK(id, idequipo);
    }

    public EquipamientomejoradoPK getEquipamientomejoradoPK() {
        return equipamientomejoradoPK;
    }

    public void setEquipamientomejoradoPK(EquipamientomejoradoPK equipamientomejoradoPK) {
        this.equipamientomejoradoPK = equipamientomejoradoPK;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public int getDp() {
        return dp;
    }

    public void setDp(int dp) {
        this.dp = dp;
    }

    public int getAccuraccy() {
        return accuraccy;
    }

    public void setAccuraccy(int accuraccy) {
        this.accuraccy = accuraccy;
    }

    public int getEvasion() {
        return evasion;
    }

    public void setEvasion(int evasion) {
        this.evasion = evasion;
    }

    public int getDamageReduction() {
        return damageReduction;
    }

    public void setDamageReduction(int damageReduction) {
        this.damageReduction = damageReduction;
    }

    public int getCronStones() {
        return cronStones;
    }

    public void setCronStones(int cronStones) {
        this.cronStones = cronStones;
    }

    public Equipamiento getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(Equipamiento equipamiento) {
        this.equipamiento = equipamiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (equipamientomejoradoPK != null ? equipamientomejoradoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipamientomejorado)) {
            return false;
        }
        Equipamientomejorado other = (Equipamientomejorado) object;
        if ((this.equipamientomejoradoPK == null && other.equipamientomejoradoPK != null) || (this.equipamientomejoradoPK != null && !this.equipamientomejoradoPK.equals(other.equipamientomejoradoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.iamriven.Equipamientomejorado[ equipamientomejoradoPK=" + equipamientomejoradoPK + " ]";
    }
    
}
