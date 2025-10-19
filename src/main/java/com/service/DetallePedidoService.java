package com.service;



import com.model.DetallePedido;
import com.repository.DetallePedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetallePedidoService {

    @Autowired
    private DetallePedidoRepository detallePedidoRepository;

    public List<DetallePedido> listar() {
        return detallePedidoRepository.findAll();
    }

    public DetallePedido guardar(DetallePedido detalle) {
        return detallePedidoRepository.save(detalle);
    }

    public void eliminar(Long id) {
        detallePedidoRepository.deleteById(id);
    }
}
