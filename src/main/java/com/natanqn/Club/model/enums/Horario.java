package com.natanqn.Club.model.enums;


import jakarta.persistence.*;

@Entity
@Table(name = "horarios")
public enum Horario {

    SETE("07h00"),
    OITO("08h00"),
    NOVE("09h00"),
    DEZ("10h00"),
    ONZE("11h00"),
    DOZE("12h00"),
    TREZE("13h00"),
    QUATORZE("14h00"),
    QUINZE("15h00"),
    DEZESSEIS("16h00"),
    DEZESETE("17h00"),
    DEZOITO("18h00"),
    DEZENOVE("19h00"),
    VINTE("20h00"),
    VINTE_E_UM("21h00"),
    VINTE_E_DOIS("22h00"),
    VINTE_E_TREZ("23h00"),;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String horario;

    Horario(String horario) {
        this.horario = horario;
    }
}
