package com.myfinnce.hub.Entity;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "tb_despesa")
public class EntidadeDespesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_despesa;

    private String nome;
    private String descricao;
    private BigDecimal valor;
    private boolean recorrente;
    private LocalDate data;

}
