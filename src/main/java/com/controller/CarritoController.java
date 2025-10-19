package com.controller;



import com.model.Carrito;
import com.service.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carrito")
@CrossOrigin(origins = "*")
public class CarritoController {

    @Autowired
    private CarritoService carritoService;

    @GetMapping
    public List<Carrito> listar() {
        return carritoService.listar();
    }

    @GetMapping("/{id}")
    public Carrito obtenerPorId(@PathVariable Long id) {
        return carritoService.buscarPorId(id);
    }

    @PostMapping
    public Carrito crear(@RequestBody Carrito carrito) {
        return carritoService.guardar(carrito);
    }

    @PutMapping("/{id}")
    public Carrito actualizar(@PathVariable Long id, @RequestBody Carrito carrito) {
        carrito.setId(id);
        return carritoService.guardar(carrito);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        carritoService.eliminar(id);
    }
}
