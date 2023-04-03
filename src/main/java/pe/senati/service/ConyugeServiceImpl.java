package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.senati.entity.Conyuge;
import pe.senati.repository.ConyugeRepository;

@Service
public class ConyugeServiceImpl implements ConyugeService
{
	@Autowired
	private ConyugeRepository repository;
	
	public ConyugeServiceImpl() {
	}

	@Override
	@Transactional
	public void insert(Conyuge conyuge) {
		repository.save(conyuge);
	}

	@Override
	@Transactional
	public void update(Conyuge conyuge) {
		repository.save(conyuge);
	}

	@Override
	@Transactional
	public void delete(Integer conyugeId) {
		repository.deleteById(conyugeId);
	}

	@Override
	@Transactional(readOnly=true)
	public Conyuge findById(Integer conyugeId) {
		return repository.findById(conyugeId).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public Collection<Conyuge> findAll() {
		return repository.findAll();
	}
}
