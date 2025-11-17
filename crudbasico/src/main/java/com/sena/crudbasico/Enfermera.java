package com.sena.crudbasico;


import jakarta.persistence.*;

@Entity
@Table(name = "Enfermeras")
public class Enfermera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEnfermera")
    private Long idEnfermera;

    @Column(name = "Nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "Apellido", nullable = false, length = 100)
    private String apellido;

    @Column(name = "Turno", nullable = false, length = 50)
    private String turno;
}
