/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iamriven;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Juan Antonio
 */
@Embeddable
public class EquipamientomejoradoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @Column(name = "idequipo")
    private int idequipo;

    public EquipamientomejoradoPK() {
    }

    public EquipamientomejoradoPK(int id, int idequipo) {
        this.id = id;
        this.idequipo = idequipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdequipo() {
        return idequipo;
    }

    public void setIdequipo(int idequipo) {
        this.idequipo = idequipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) idequipo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EquipamientomejoradoPK)) {
            return false;
        }
        EquipamientomejoradoPK other = (EquipamientomejoradoPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.idequipo != other.idequipo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.iamriven.EquipamientomejoradoPK[ id=" + id + ", idequipo=" + idequipo + " ]";
    }
    
}
