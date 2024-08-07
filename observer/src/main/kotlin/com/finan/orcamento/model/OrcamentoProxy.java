package com.finan.orcamento.model;

import java.math.BigDecimal;

public class OrcamentoProxy extends OrcamentoModel{
    private BigDecimal valorOrcamento;
    private BigDecimal descontoOrcamento;
    private int qtdItens;
    private OrcamentoModel orcamentoModel;

    public OrcamentoProxy(OrcamentoModel orcamentoModel) {
        this.orcamentoModel = orcamentoModel;
    }

    @Override
    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    @Override
    public void setValorOrcamento(BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    @Override
    public BigDecimal getDescontoOrcamento() {
        return descontoOrcamento;
    }

    @Override
    public void setDescontoOrcamento(BigDecimal descontoOrcamento) {
        this.descontoOrcamento = descontoOrcamento;
    }

    @Override
    public int getQtdItens() {
        return qtdItens;
    }

    @Override
    public void setQtdItens(int qtdItens) {
        this.qtdItens = qtdItens;
    }
}
