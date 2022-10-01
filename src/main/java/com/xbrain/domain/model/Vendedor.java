package com.xbrain.domain.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
@Entity
public class Vendedor {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vendedorId;

    private String vendedorNome;

    private BigDecimal  vendasTotal;

    private BigDecimal vendasMediaDiaria;

    @JsonIgnore
    @OneToMany(mappedBy = "vendedor")
    private List<Venda> vendas = new ArrayList<>();

}
