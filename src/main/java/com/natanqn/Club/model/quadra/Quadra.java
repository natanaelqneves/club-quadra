package com.natanqn.Club.model.quadra;

import com.natanqn.Club.model.enums.Categoria;
import jakarta.persistence.*;

@Entity
@Table(name = "quadras")
public class Quadra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated
    private Categoria categoria;
    private Long valorPorHora;
    private Boolean estaAtiva;

    public Quadra() {
    }

    public Quadra(Categoria categoria, Long valorPorHora) {
        this.categoria = categoria;
        this.valorPorHora = valorPorHora;
        this.estaAtiva = Boolean.TRUE;
    }

    public Long getId() {
        return id;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Long getValorPorHora() {
        return valorPorHora;
    }

    public Boolean getEstaAtiva() {
        return estaAtiva;
    }

    @Override
    public String toString() {
        return "Quadra{" +
                "id=" + id +
                ", categoria=" + categoria +
                ", valorPorHora=" + valorPorHora +
                ", estaAtiva=" + estaAtiva +
                '}';
    }
}
