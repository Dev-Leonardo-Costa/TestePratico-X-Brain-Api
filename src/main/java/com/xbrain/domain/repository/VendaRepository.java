package com.xbrain.domain.repository;

import com.xbrain.domain.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {
//    Optional<Venda> vendaByVendedorId(Long id);
}
