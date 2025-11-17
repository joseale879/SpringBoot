package com.sena.crudbasico;


import jakarta.persistence.*;

@Entity
@Table(name = "Especialidades")
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEspecialidad")
    private Long idEspecialidad;

    @Column(name = "Nombre", nullable = false, length = 100, unique = true)
    private String nombre;
}
