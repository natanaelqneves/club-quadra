package com.natanqn.Club.model.reserva;

import com.natanqn.Club.model.Horario;
import com.natanqn.Club.model.cliente.Cliente;
import com.natanqn.Club.model.quadra.Quadra;

import java.time.LocalDate;
import java.util.List;

public class DadosReserva {

    private Long id;
    private Cliente cliente;
    private Quadra quadra;
    private LocalDate data;
    private List<Horario> horariosList;

    public DadosReserva() {
    }

    public DadosReserva(Cliente cliente, Quadra quadra, LocalDate data, List<Horario> horariosList) {
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
        return "DadosReserva{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", quadra=" + quadra +
                ", data=" + data +
                ", horariosList=" + horariosList +
                '}';
    }
}
