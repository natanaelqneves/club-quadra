package com.natanqn.Club.repository;

import com.natanqn.Club.model.reserva.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
}
