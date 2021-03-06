/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.web.builders;

import java.util.Date;

import br.edu.ifpe.negocio.Fatura;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "bFatura")
@RequestScoped

/**
 *
 * @author esdra
 */
public class BuilderFatura {

    private String nomeDoCliente;
    private int CPFDoCliente;
    private String nomeDoPlano;
    private double valor;
    private double valorMulta;
    private double valorJurosPorDia;
    private Date vencimento;
    private Date DataPagamento;
    private Boolean Status;

    public BuilderFatura(String nomeDoCliente, int CPFDoCliente, String nomeDoPlano, double valor, double valorMulta, double valorJurosPorDia, Date vencimento, Date DataPagamento, Boolean Status) {
        this.nomeDoCliente = nomeDoCliente;
        this.CPFDoCliente = CPFDoCliente;
        this.nomeDoPlano = nomeDoPlano;
        this.valor = valor;
        this.valorMulta = valorMulta;
        this.valorJurosPorDia = valorJurosPorDia;
        this.vencimento = vencimento;
        this.DataPagamento = DataPagamento;
        this.Status = Status;
    }

    public BuilderFatura() {

    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public int getCPFDoCliente() {
        return CPFDoCliente;
    }

    public void setCPFDoCliente(int CPFDoCliente) {
        this.CPFDoCliente = CPFDoCliente;
    }

    public String getNomeDoPlano() {
        return nomeDoPlano;
    }

    public void setNomeDoPlano(String nomeDoPlano) {
        this.nomeDoPlano = nomeDoPlano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public double getValorJurosPorDia() {
        return valorJurosPorDia;
    }

    public void setValorJurosPorDia(double valorJurosPorDia) {
        this.valorJurosPorDia = valorJurosPorDia;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public Date getDataPagamento() {
        return DataPagamento;
    }

    public void setDataPagamento(Date DataPagamento) {
        this.DataPagamento = DataPagamento;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    public Fatura builderFatura() {
        return new Fatura(nomeDoCliente, CPFDoCliente, nomeDoPlano, valor, valorMulta, valorJurosPorDia, vencimento, DataPagamento, Status);
    }
}
