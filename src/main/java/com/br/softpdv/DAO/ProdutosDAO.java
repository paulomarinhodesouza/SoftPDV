package com.br.softpdv.DAO;

import com.br.softpdv.Data.Produtos;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;


public class ProdutosDAO {
    public static void cadastrar(Produtos p){
        EntityManager em = SoftPDVJPA.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            
        }catch(Exception e){
            em.getTransaction().rollback();
            throw e;
        }
        finally{
            SoftPDVJPA.closeEtityManager();
        }
    }
    
    public static List<Produtos> listarProdutos(){
        EntityManager em = SoftPDVJPA.getEntityManager();
        try{
            em.getTransaction().begin();
            Query consulta = em.createQuery("SELECT produto FROM Produtos produto");
            List<Produtos> lista = consulta.getResultList();
            em.getTransaction().commit();
            return lista;
        }catch(Exception e){
            return null;
        }finally{
            SoftPDVJPA.closeEtityManager();
        }
    }
    
    public static void atualizarPreco(Produtos p, String vlVenda){
        EntityManager em = SoftPDVJPA.getEntityManager();
        try{
            p = em.find(Produtos.class, p.getId());
            em.getTransaction().begin();
            p.setVlVenda(vlVenda);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            throw e;
        }finally{
            SoftPDVJPA.closeEtityManager();
        }    
    }
    
    public static void atualizarQuantidade(Produtos p, String quantidade){
        EntityManager em = SoftPDVJPA.getEntityManager();
        try{
            p = em.find(Produtos.class, p.getId());
            em.getTransaction().begin();
            p.setQuantidade(quantidade);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            throw e;
        }finally{
            SoftPDVJPA.closeEtityManager();
        }    
    }
    
}
