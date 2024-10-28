package aplazo.com.mx.aplazo.repositories;

import aplazo.com.mx.aplazo.models.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IClientesRepository extends JpaRepository<Clientes, Long> {
    List<Clientes> findByNombre(String nombre);
    List<Clientes> findByFechaNacimiento(String fechaNacimiento);
}
