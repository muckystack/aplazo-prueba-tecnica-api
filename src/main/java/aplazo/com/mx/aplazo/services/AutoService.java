package aplazo.com.mx.aplazo.services;

import aplazo.com.mx.aplazo.models.Clientes;
import aplazo.com.mx.aplazo.repositories.IClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutoService {
    private IClientesRepository clientes;
    @Autowired

    public AutoService(IClientesRepository clientes) {
        this.clientes = clientes;
    }

    // Metodo encargado de crear clientes
    public void crearCliente(Clientes clientes) {
        this.clientes.save(clientes);
    }

    //Metodo para listar los clientes
    public List<Clientes> listarClientes() {
        return this.clientes.findAll();
    }

    //Metodo para buscar un cliente
    Optional<Clientes> buscarCliente(Long id) {
        return this.clientes.findById(id);
    }
}
