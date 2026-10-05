package com.myfinnce.hub.Entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Check;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "tb_receita")
public class EntidadeReceita {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long receitaId;
    @Column(nullable = false, length = 30 )
    private String nome;
    @Column(nullable = false, precision = 10, scale = 2)
    @Check(constraints = "valor > 0")
    private BigDecimal valor;
    @Column(nullable = false)
    private LocalDate data;
    @Column(nullable = false)
    private boolean recorrente;

    public EntidadeReceita() {
    }

    public EntidadeReceita(Long receitaId, String nome, BigDecimal valor, LocalDate data, boolean recorrente) {
        this.receitaId = receitaId;
        this.nome = nome;
        this.valor = valor;
        this.data = data;
        this.recorrente = recorrente;
    }

    public Long getReceitaId() {
        return receitaId;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public boolean isRecorrente() {
        return recorrente;
    }

    public void setRecorrente(boolean recorrente) {
        this.recorrente = recorrente;
    }
}
