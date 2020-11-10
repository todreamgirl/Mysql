package com.reciclo.ecosustentaveis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.reciclo.ecosustentaveis.model.categoriaTable;

@Repository
public interface categoriaRepository extends JpaRepository<categoriaTable, Long> {

}