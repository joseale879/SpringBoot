package com.sena.crudbasico;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Citas")
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdCita")
    private Long idCita;

    @ManyToOne
    @JoinColumn(name = "IdPaciente", nullable = false)
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "IdMedico", nullable = false)
    private Medico medico;

    @Column(name = "FechaCita", nullable = false)
    private LocalDateTime fechaCita;

    @Column(name = "Motivo", length = 200)
    private String motivo;
}