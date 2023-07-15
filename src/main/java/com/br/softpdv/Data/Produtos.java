package com.br.softpdv.Data;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="produto")
public class Produtos {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column   
    private String codigo;
    @Column  
    private String codigoAdicional;
    @Column  
    private String descricao;
    @Column  
    private String secao;
    @Column  
    private String quantidade;
    @Column  
    private String vlCusto;
    @Column  
    private String vlVenda;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
  
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoAdicional() {
        return codigoAdicional;
    }

    public void setCodigoAdicional(String codigoAdicional) {
        this.codigoAdicional = codigoAdicional;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getVlCusto() {
        return vlCusto;
    }

    public void setVlCusto(String vlCusto) {
        this.vlCusto = vlCusto;
    }

    public String getVlVenda() {
        return vlVenda;
    }

    public void setVlVenda(String vlVenda) {
        this.vlVenda = vlVenda;
    }


}
