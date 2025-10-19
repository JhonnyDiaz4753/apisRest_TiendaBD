package com.service;



import com.model.Carrito;
import com.repository.CarritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarritoService {

    @Autowired
    private CarritoRepository carritoRepository;

    public List<Carrito> listar() {
        return carritoRepository.findAll();
    }

    public Carrito guardar(Carrito carrito) {
        return carritoRepository.save(carrito);
    }

    public Carrito buscarPorId(Long id) {
        return carritoRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        carritoRepository.deleteById(id);
    }
}

