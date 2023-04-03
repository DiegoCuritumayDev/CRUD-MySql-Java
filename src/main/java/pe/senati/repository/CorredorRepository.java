package pe.senati.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.senati.entity.Corredor;

public interface CorredorRepository extends JpaRepository<Corredor,Integer> {
	
}
