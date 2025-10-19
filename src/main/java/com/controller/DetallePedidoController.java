package com.controller;



import com.model.DetallePedido;
import com.service.DetallePedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detallepedido")
@CrossOrigin(origins = "*")
public class DetallePedidoController {

    @Autowired
    private DetallePedidoService detallePedidoService;

    @GetMapping
    public List<DetallePedido> listar() {
        return detallePedidoService.listar();
    }

    @PostMapping
    public DetallePedido crear(@RequestBody DetallePedido detalle) {
        return detallePedidoService.guardar(detalle);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        detallePedidoService.eliminar(id);
    }
}
