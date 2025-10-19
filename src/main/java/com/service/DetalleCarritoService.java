package com.service;


import com.model.DetalleCarrito;
import com.repository.DetalleCarritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleCarritoService {

    @Autowired
    private DetalleCarritoRepository detalleCarritoRepository;

    public List<DetalleCarrito> listar() {
        return detalleCarritoRepository.findAll();
    }

    public DetalleCarrito guardar(DetalleCarrito detalle) {
        return detalleCarritoRepository.save(detalle);
    }

    public void eliminar(Long id) {
        detalleCarritoRepository.deleteById(id);
    }
}
