package com.sena.crudbasico;


import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Ingresos")
public class Ingreso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdIngreso")
    private Long idIngreso;

    @ManyToOne
    @JoinColumn(name = "IdPaciente", nullable = false)
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "IdHabitacion", nullable = false)
    private Habitacion habitacion;

    @Column(name = "FechaIngreso", nullable = false)
    private LocalDateTime fechaIngreso;

    @Column(name = "FechaSalida")
    private LocalDateTime fechaSalida;
}