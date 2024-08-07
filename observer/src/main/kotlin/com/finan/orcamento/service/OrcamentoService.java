package com.finan.orcamento.service;

import com.finan.orcamento.model.OrcamentoModel;
import com.finan.orcamento.model.OrcamentoProxy;
import com.finan.orcamento.repositories.OrcamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrcamentoService {
    @Autowired
    private OrcamentoRepository orcamentoRepository;

    public List<OrcamentoModel> buscarOrcamento() {
        return orcamentoRepository.findAll();
    }

    public OrcamentoModel buscaId(Long id) {
        Optional<OrcamentoModel> obj=orcamentoRepository.findById(id);
        if (obj.isPresent()) {
            return obj.get();
        } else {
            throw new RuntimeException("Orcamento não encontrado!");
        }
    }

    public OrcamentoModel cadastrarOrcamento(OrcamentoModel orcamentoModel) {
        return orcamentoRepository.save(orcamentoModel);
    }

    public OrcamentoModel atualizaOrcamento(OrcamentoModel orcamentoModel, Long id) {
        OrcamentoModel newOrcamentoModel = buscaId(id);
        newOrcamentoModel.setValorOrcamento(orcamentoModel.getValorOrcamento());
        // calculaDesconto(orcamentoModel);
        return orcamentoRepository.save(newOrcamentoModel);
    }

    public void deletaOrcamento(Long id) {
        orcamentoRepository.deleteById(id);
    }
}
