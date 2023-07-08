package com.br.softpdv.softpdv3.SoftPDV3.data;

import com.br.softpdv.softpdv3.SoftPDV3.DAO.VendasDAO;
import java.util.List;


public class ListaVendas {
    private List<Vendas> lista = VendasDAO.listarProdutos();
    
    public List<Vendas> listar(){
        return lista;
    }
    
    public void adicionar(Vendas venda){
        VendasDAO.cadastrar(venda);
    }
    
    public Vendas buscarVendas(int idVendas){
        for (Vendas v : lista){
            if(idVendas == lista.indexOf(v)){
                return v;
            }  
        }
        return null;
    }
}
