package br.edu.ifpe.oxefood_api.api.cliente;


import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
