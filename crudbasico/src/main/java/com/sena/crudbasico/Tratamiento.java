package com.sena.crudbasico;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Tratamientos")
public class Tratamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTratamiento")
    private Long idTratamiento;

    @ManyToOne
    @JoinColumn(name = "IdPaciente", nullable = false)
    private Paciente paciente;

    @Column(name = "Descripcion", nullable = false, length = 200)
    private String descripcion;

    @Column(name = "Fecha", nullable = false)
    private LocalDate fecha;
}