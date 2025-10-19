package com.controller;



import com.model.DetalleCarrito;
import com.service.DetalleCarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detallecarrito")
@CrossOrigin(origins = "*")
public class DetalleCarritoController {

    @Autowired
    private DetalleCarritoService detalleCarritoService;

    @GetMapping
    public List<DetalleCarrito> listar() {
        return detalleCarritoService.listar();
    }

    @PostMapping
    public DetalleCarrito crear(@RequestBody DetalleCarrito detalle) {
        return detalleCarritoService.guardar(detalle);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        detalleCarritoService.eliminar(id);
    }
}
