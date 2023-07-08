package com.br.softpdv.softpdv3.SoftPDV3.DAO;


import com.br.softpdv.softpdv3.SoftPDV3.data.Relatorios;
import com.br.softpdv.softpdv3.SoftPDV3.data.Vendas;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;


public class RelatoriosDAO {
    public static void cadastrar(Relatorios r){
        EntityManager em = SoftPDVJPA.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(r);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            throw e;
        }
        finally{
            SoftPDVJPA.closeEtityManager();
        }
    }
    
    public static List<Relatorios> listarProdutos(){
        EntityManager em = SoftPDVJPA.getEntityManager();
        try{
            em.getTransaction().begin();
            Query consulta = em.createQuery("SELECT relatorio FROM Relatorios relatorio");
            List<Relatorios> lista = consulta.getResultList();
            em.getTransaction().commit();
            return lista;
        }catch(Exception e){
            return null;
        }finally{
            SoftPDVJPA.closeEtityManager();
        }
    }
}
