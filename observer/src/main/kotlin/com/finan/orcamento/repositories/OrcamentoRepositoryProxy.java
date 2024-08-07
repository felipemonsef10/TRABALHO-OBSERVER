package com.finan.orcamento.repositories;

import com.finan.orcamento.model.OrcamentoModel;
import com.finan.orcamento.model.OrcamentoProxy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrcamentoRepositoryProxy extends JpaRepository<OrcamentoProxy, Long> {

}
