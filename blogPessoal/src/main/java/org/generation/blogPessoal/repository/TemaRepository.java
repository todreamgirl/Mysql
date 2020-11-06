package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.TemaModel;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface TemaRepository extends JpaRepositoryImplementation<TemaModel, Long> {
	public List<TemaModel> findAllByDescricaoContainingIgnoreCase(String descricao);
	
}
