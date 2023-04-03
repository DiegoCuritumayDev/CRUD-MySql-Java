package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.senati.entity.Auto;
import pe.senati.repository.AutoRepository;

@Service
public class AutoServiceImpl implements AutoService
{
	@Autowired
	private AutoRepository repository;
	
	public AutoServiceImpl() {
	}

	@Override
	@Transactional
	public void insert(Auto auto) {
		repository.save(auto);
	}

	@Override
	@Transactional
	public void update(Auto auto) {
		repository.save(auto);
	}

	@Override
	@Transactional
	public void delete(Integer autoId) {
		repository.deleteById(autoId);
	}

	@Override
	@Transactional(readOnly=true)
	public Auto findById(Integer autoId) {
		return repository.findById(autoId).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public Collection<Auto> findAll() {
		return repository.findAll();
	}
}
