package com.natanqn.Club.model.reserva;

import com.natanqn.Club.model.Horario;
import com.natanqn.Club.model.cliente.Cliente;
import com.natanqn.Club.model.quadra.Quadra;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "reservas")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Quadra quadra;
    private LocalDate data;
    private List<Horario> horariosList;

    public Reserva() {
    }

    public Reserva(Cliente cliente, Quadra quadra, LocalDate data, List<Horario> horariosList) {
        this.cliente = cliente;
        this.quadra = quadra;
        this.data = data;
        this.horariosList = horariosList;
    }

    public Long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Quadra getQuadra() {
        return quadra;
    }

    public LocalDate getData() {
        return data;
    }

    public List<Horario> getHorariosList() {
        return horariosList;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", quadra=" + quadra +
                ", data=" + data +
                ", horariosList=" + horariosList +
                '}';
    }
}
