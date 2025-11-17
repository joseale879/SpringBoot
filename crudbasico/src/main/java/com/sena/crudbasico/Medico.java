package com.sena.crudbasico;


import jakarta.persistence.*;

@Entity
@Table(name = "Medicos")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdMedico")
    private Long idMedico;

    @Column(name = "Nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "Apellido", nullable = false, length = 100)
    private String apellido;

    @ManyToOne
    @JoinColumn(name = "IdEspecialidad", nullable = false)
    private Especialidad especialidad;
}
