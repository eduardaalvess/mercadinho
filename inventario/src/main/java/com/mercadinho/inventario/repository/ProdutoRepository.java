package com.mercadinho.inventario.repository;

import com.mercadinho.inventario.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}

