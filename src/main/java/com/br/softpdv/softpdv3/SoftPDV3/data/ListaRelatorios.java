package com.br.softpdv.softpdv3.SoftPDV3.data;

import com.br.softpdv.softpdv3.SoftPDV3.DAO.RelatoriosDAO;
import java.util.List;


public class ListaRelatorios {
    private final List<Relatorios> lista = RelatoriosDAO.listarProdutos();
    
    public List<Relatorios> listar(){
        return lista;
    }
    
    public void adicionar(Relatorios relatorio){
        RelatoriosDAO.cadastrar(relatorio);
    }
    
    public Relatorios buscarProdutoCodigo(int idRelatorios){
        for (Relatorios r : lista){
            if (r.getIdRelarios() == idRelatorios){                
                return r;
            }
        }
        return null;
    }
}
