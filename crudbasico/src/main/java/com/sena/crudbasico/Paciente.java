package com.sena.crudbasico;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPaciente")
    private Long idPaciente;

    @Column(name = "Nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "Apellido", nullable = false, length = 100)
    private String apellido;

    @Column(name = "FechaNacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    @Column(name = "Sexo", columnDefinition = "CHAR(1)")
    private String sexo;

    @Column(name = "Telefono", length = 20)
    private String telefono;

    @Column(name = "Direccion", length = 200)
    private String direccion;
}