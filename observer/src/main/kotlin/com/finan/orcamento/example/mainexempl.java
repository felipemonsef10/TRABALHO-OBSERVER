package com.finan.orcamento.example;

import com.finan.orcamento.model.OrcamentoModel;
import com.finan.orcamento.model.OrcamentoProxy;

public class mainexempl {
    public static void main(String[] args) {
        //Sem proxy
        OrcamentoModel orcamentoModel = new OrcamentoModel();
        System.out.println("Valor orçamento: " + orcamentoModel.getValorOrcamento());
        System.out.println("Desconto orçamento: " + orcamentoModel.getDescontoOrcamento());
        System.out.println("Quantidade de itens: " + orcamentoModel.getQtdItens());

        //Com proxy
        OrcamentoProxy proxy = new OrcamentoProxy(orcamentoModel);
        System.out.println("Valor orçamento: " + proxy.getValorOrcamento());
        System.out.println("Desconto orçamento: " + proxy.getDescontoOrcamento());
        System.out.println("Quantidade de itens: " + proxy.getQtdItens());
    }
}
