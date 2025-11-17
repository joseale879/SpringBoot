package com.sena.crudbasico;


import jakarta.persistence.*;

@Entity
@Table(name = "Medicamentos")
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdMedicamento")
    private Long idMedicamento;

    @Column(name = "Nombre", nullable = false, length = 100, unique = true)
    private String nombre;

    @Column(name = "Descripcion", length = 200)
    private String descripcion;
}
