package com.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "productos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String descripcion;

    private Double precio;

    private String imagenUrl;

    private String genero; // Hombres, Mujeres, Niños

    private String categoria; // Ej: Pantalones, Camisas, Zapatos

    private Integer stock;
}
