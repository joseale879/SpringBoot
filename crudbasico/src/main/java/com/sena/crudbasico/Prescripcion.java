package com.sena.crudbasico;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Prescripciones")
public class Prescripcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPrescripcion")
    private Long idPrescripcion;

    @ManyToOne
    @JoinColumn(name = "IdPaciente", nullable = false)
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "IdMedicamento", nullable = false)
    private Medicamento medicamento;

    @ManyToOne
    @JoinColumn(name = "IdMedico", nullable = false)
    private Medico medico;

    @Column(name = "Dosis", nullable = false, length = 50)
    private String dosis;

    @Column(name = "Frecuencia", nullable = false, length = 50)
    private String frecuencia;

    @Column(name = "Fecha", nullable = false)
    private LocalDate fecha;
}