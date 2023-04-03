package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.senati.entity.Corredor;
import pe.senati.repository.CorredorRepository;

@Service
public class CorredorServiceImpl implements CorredorService
{
	@Autowired
	private CorredorRepository repository;
	
	public CorredorServiceImpl() {		
	}
	
	@Override
	@Transactional
	public void insert(Corredor corredor) {
		repository.save(corredor);
	}

	@Override
	@Transactional
	public void update(Corredor corredor) {
		repository.save(corredor);
	}

	@Override
	@Transactional
	public void delete(Integer corredorId) {
		repository.deleteById(corredorId);
	}

	@Override
	@Transactional(readOnly=true)
	public Corredor findById(Integer corredorId) {
		return repository.findById(corredorId).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public Collection<Corredor> findAll() {
		return repository.findAll();
	}
}
