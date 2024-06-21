/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iamriven;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Juan Antonio
 */
@Entity
@Table(name = "equipamiento")
@NamedQueries({
    @NamedQuery(name = "Equipamiento.findAll", query = "SELECT e FROM Equipamiento e"),
    @NamedQuery(name = "Equipamiento.findByIdequipo", query = "SELECT e FROM Equipamiento e WHERE e.idequipo = :idequipo"),
    @NamedQuery(name = "Equipamiento.findByNombre", query = "SELECT e FROM Equipamiento e WHERE e.nombre = :nombre")})
public class Equipamiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idequipo")
    private Integer idequipo;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "equipamiento")
    private Collection<Equipamientomejorado> equipamientomejoradoCollection;

    public Equipamiento() {
    }

    public Equipamiento(Integer idequipo) {
        this.idequipo = idequipo;
    }

    public Equipamiento(Integer idequipo, String nombre) {
        this.idequipo = idequipo;
        this.nombre = nombre;
    }

    public Integer getIdequipo() {
        return idequipo;
    }

    public void setIdequipo(Integer idequipo) {
        this.idequipo = idequipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Equipamientomejorado> getEquipamientomejoradoCollection() {
        return equipamientomejoradoCollection;
    }

    public void setEquipamientomejoradoCollection(Collection<Equipamientomejorado> equipamientomejoradoCollection) {
        this.equipamientomejoradoCollection = equipamientomejoradoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idequipo != null ? idequipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipamiento)) {
            return false;
        }
        Equipamiento other = (Equipamiento) object;
        if ((this.idequipo == null && other.idequipo != null) || (this.idequipo != null && !this.idequipo.equals(other.idequipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.iamriven.Equipamiento[ idequipo=" + idequipo + " ]";
    }
    
}
