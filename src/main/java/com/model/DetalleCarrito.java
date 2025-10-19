package com.model;



import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "detalle_carrito")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DetalleCarrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "carrito_id")
    private Carrito carrito;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;
}
