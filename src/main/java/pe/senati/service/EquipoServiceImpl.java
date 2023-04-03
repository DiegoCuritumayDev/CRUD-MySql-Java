package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.senati.entity.Equipo;
import pe.senati.repository.EquipoRepository;

@Service
public class EquipoServiceImpl implements EquipoService
{
	@Autowired
	private EquipoRepository repository;
	
	public EquipoServiceImpl() {
	}

	@Override
	@Transactional
	public void insert(Equipo equipo) {
		repository.save(equipo);
	}

	@Override
	@Transactional
	public void update(Equipo equipo) {
		repository.save(equipo);
	}

	@Override
	@Transactional
	public void delete(Integer equipoId) {
		repository.deleteById(equipoId);
	}

	@Override
	@Transactional(readOnly=true)
	public Equipo findById(Integer equipoId) {
		return repository.findById(equipoId).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public Collection<Equipo> findAll() {
		return repository.findAll();
	}
}
