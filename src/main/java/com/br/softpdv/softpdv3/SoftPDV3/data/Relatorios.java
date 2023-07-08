package com.br.softpdv.softpdv3.SoftPDV3.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="relatorio")
public class Relatorios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int idRelarios;
    @Column
    private double margemLucro;
    @Column
    private double lucroLiquido;
    @Column
    private double vlCusto;
    @Column
    private double vlTotalGeral;
    @Column
    private double totalDinheiro;
    @Column
    private double totalDebito;
    @Column
    private double totalPix;
    @Column
    private double totalCredito;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdRelarios() {
        return idRelarios;
    }

    public void setIdRelarios(int idRelarios) {
        this.idRelarios = idRelarios;
    }

    public double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }

    public double getLucroLiquido() {
        return lucroLiquido;
    }

    public void setLucroLiquido(double lucroLiquido) {
        this.lucroLiquido = lucroLiquido;
    }

    public double getVlCusto() {
        return vlCusto;
    }

    public void setVlCusto(double vlCusto) {
        this.vlCusto = vlCusto;
    }

    public double getVlTotalGeral() {
        return vlTotalGeral;
    }

    public void setVlTotalGeral(double vlTotalGeral) {
        this.vlTotalGeral = vlTotalGeral;
    }

    public double getTotalDinheiro() {
        return totalDinheiro;
    }

    public void setTotalDinheiro(double totalDinheiro) {
        this.totalDinheiro = totalDinheiro;
    }

    public double getTotalDebito() {
        return totalDebito;
    }

    public void setTotalDebito(double totalDebito) {
        this.totalDebito = totalDebito;
    }

    public double getTotalPix() {
        return totalPix;
    }

    public void setTotalPix(double totalPix) {
        this.totalPix = totalPix;
    }

    public double getTotalCredito() {
        return totalCredito;
    }

    public void setTotalCredito(double totalCredito) {
        this.totalCredito = totalCredito;
    }

    
    
}
