package com.myfinnce.hub.Entity;
import com.myfinnce.hub.Entity.Enum.FormaPagamento;
import jakarta.persistence.*;
import org.hibernate.annotations.Check;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "tb_despesa")
public class EntidadeDespesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDespesa;

    @Column(nullable = false, length = 30)
    private String nome;

    @Column(length = 60)
    private String descricao;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FormaPagamento formaPagamento;

    @Check(constraints = "valor > 0")
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal valor;

    @Column(nullable = false)
    private boolean recorrente;

    @Column(nullable = false)
    private LocalDate data;

    public EntidadeDespesa() {
    }

    public EntidadeDespesa(Long idDespesa, String nome, String descricao, FormaPagamento formaPagamento, BigDecimal valor, boolean recorrente, LocalDate data) {
        this.idDespesa = idDespesa;
        this.nome = nome;
        this.descricao = descricao;
        this.formaPagamento = formaPagamento;
        this.valor = valor;
        this.recorrente = recorrente;
        this.data = data;
    }

    public Long getIdDespesa() {
        return idDespesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public boolean isRecorrente() {
        return recorrente;
    }

    public void setRecorrente(boolean recorrente) {
        this.recorrente = recorrente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
