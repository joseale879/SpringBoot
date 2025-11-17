package com.sena.crudbasico;


import jakarta.persistence.*;

@Entity
@Table(name = "Habitaciones")
public class Habitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdHabitacion")
    private Long idHabitacion;

    @Column(name = "NumeroHabitacion", nullable = false, length = 10, unique = true)
    private String numeroHabitacion;

    @Column(name = "Tipo", nullable = false, length = 50)
    private String tipo;

    @Column(name = "Estado", nullable = false, length = 20)
    private String estado;
}