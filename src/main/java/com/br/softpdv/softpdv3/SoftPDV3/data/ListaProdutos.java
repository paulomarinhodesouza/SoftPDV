package com.br.softpdv.softpdv3.SoftPDV3.data;

import com.br.softpdv.softpdv3.SoftPDV3.DAO.ProdutosDAO;
import java.util.List;


public class ListaProdutos {
    private final List<Produtos> lista = ProdutosDAO.listarProdutos();
    
    public List<Produtos> listar(){
        return lista;
    }
    
    public void adicionar(Produtos produtos){
        ProdutosDAO.cadastrar(produtos);
    }
    
    public Produtos buscarProdutoCodigo(String codigo, String codigoAdicional){
        for (Produtos p : lista){
            if (p.getCodigo().equals(codigo) || p.getCodigoAdicional().equals(codigoAdicional)){                
                return p;
            }
        }
        return null;
    }
}
