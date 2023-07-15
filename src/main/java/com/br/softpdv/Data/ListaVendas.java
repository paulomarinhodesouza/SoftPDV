package com.br.softpdv.Data;

import com.br.softpdv.DAO.VendasDAO;
import java.util.List;


public class ListaVendas {
    private List<Vendas> lista = VendasDAO.listarVendas();
    
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
