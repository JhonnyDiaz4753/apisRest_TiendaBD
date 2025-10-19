package com.service;



import com.model.DireccionEnvio;
import com.repository.DireccionEnvioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DireccionEnvioService {

    @Autowired
    private DireccionEnvioRepository direccionEnvioRepository;

    public List<DireccionEnvio> listar() {
        return direccionEnvioRepository.findAll();
    }

    public DireccionEnvio guardar(DireccionEnvio direccion) {
        return direccionEnvioRepository.save(direccion);
    }

    public void eliminar(Long id) {
        direccionEnvioRepository.deleteById(id);
    }
}
