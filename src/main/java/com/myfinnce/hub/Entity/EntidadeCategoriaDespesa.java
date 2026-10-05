package com.myfinnce.hub.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_categoria_despesa")
public class EntidadeCategoriaDespesa {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long categoriaId;

    @Column(nullable = false, length = 30)
    private String nome;

    public EntidadeCategoriaDespesa() {
    }

    public EntidadeCategoriaDespesa(Long categoriaId, String nome) {
        this.categoriaId = categoriaId;
        this.nome = nome;
    }

    public Long getCategoriaId() {
        return categoriaId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
