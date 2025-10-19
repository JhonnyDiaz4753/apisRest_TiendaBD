package com.model;



import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "direcciones_envio")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DireccionEnvio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String direccion;
    private String ciudad;
    private String departamento;
    private String codigoPostal;
    private String telefono;
}
