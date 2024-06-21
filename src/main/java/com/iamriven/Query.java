package com.iamriven;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class Query {

    public static List<Equipamiento> recuperarEquipamiento() {

        EntityManager em = EntityManagerUtil.getEntityManager();
        List<Equipamiento> lista_joyeria = new ArrayList<>();
        try {
            em.getTransaction().begin();

            TypedQuery<Equipamiento> query = em.createQuery("SELECT u FROM Equipamiento u", Equipamiento.class);
            lista_joyeria = query.getResultList();

            em.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            em.close();
        }

        return lista_joyeria;

    }

    public static Integer recuperarID(String nombre) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        Integer resultado = 0;
        try {
            em.getTransaction().begin();

            TypedQuery<Integer> consulta = em.createQuery(
                    "SELECT u.idequipo FROM Equipamiento u WHERE u.nombre = :nombre", Integer.class);
            consulta.setParameter("nombre", nombre);

            resultado = consulta.getSingleResult();

            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            em.close();
        }
        return resultado;
    }

}
