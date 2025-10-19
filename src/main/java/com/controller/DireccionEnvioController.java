package com.controller;


import com.model.DireccionEnvio;
import com.service.DireccionEnvioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/direcciones")
@CrossOrigin(origins = "*")
public class DireccionEnvioController {

    @Autowired
    private DireccionEnvioService direccionEnvioService;

    @GetMapping
    public List<DireccionEnvio> listar() {
        return direccionEnvioService.listar();
    }

    @PostMapping
    public DireccionEnvio crear(@RequestBody DireccionEnvio direccion) {
        return direccionEnvioService.guardar(direccion);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        direccionEnvioService.eliminar(id);
    }
}
