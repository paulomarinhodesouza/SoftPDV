package com.br.softpdv.DAO;

import com.br.softpdv.Data.Vendas;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;


public class VendasDAO {
    public static void cadastrar(Vendas v){
        EntityManager em = SoftPDVJPA.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(v);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            throw e;
        }
        finally{
            SoftPDVJPA.closeEtityManager();
        }
    }
    
    public static List<Vendas> listarVendas(){
        EntityManager em = SoftPDVJPA.getEntityManager();
        try{
            em.getTransaction().begin();
            Query consulta = em.createQuery("SELECT venda FROM Vendas venda");
            List<Vendas> lista = consulta.getResultList();
            em.getTransaction().commit();
            return lista;
        }catch(Exception e){
            return null;
        }finally{
            SoftPDVJPA.closeEtityManager();
        }
    }
}
