package com.finan.orcamento.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;


import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "orcamento")
public class OrcamentoModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "quantidade_itens")
    private int qtdItens;

    @NotNull
    @Column(name = "valor_orcamento")
    private BigDecimal valorOrcamento;

    @Column(name = "desconto_orcamento")
    private BigDecimal descontoOrcamento;

    public OrcamentoModel(){}

    public OrcamentoModel(int qtdItens, BigDecimal valorOrcamento, BigDecimal descontoOrcamento) {
        this.qtdItens = qtdItens;
        this.valorOrcamento = valorOrcamento;
        this.descontoOrcamento = descontoOrcamento;
    }

    public int getQtdItens() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return qtdItens;
    }

    public void setQtdItens(int qtdItens) {
        this.qtdItens = qtdItens;
    }

    public BigDecimal getValorOrcamento() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return valorOrcamento;
    }

    public void setValorOrcamento(BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    public BigDecimal getDescontoOrcamento() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return descontoOrcamento;
    }

    public void setDescontoOrcamento(BigDecimal descontoOrcamento) {
        this.descontoOrcamento = descontoOrcamento;
    }
 }
