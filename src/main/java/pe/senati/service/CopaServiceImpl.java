package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.senati.entity.Copa;
import pe.senati.repository.CopaRepository;

@Service
public class CopaServiceImpl implements CopaService
{
	@Autowired
	private CopaRepository repository;
	
	public CopaServiceImpl() {
	}

	@Override
	@Transactional
	public void insert(Copa copa) {
		repository.save(copa);
	}

	@Override
	@Transactional
	public void update(Copa copa) {
		repository.save(copa);
	}

	@Override
	@Transactional
	public void delete(Integer copaId) {
		repository.deleteById(copaId);
	}

	@Override
	@Transactional(readOnly=true)
	public Copa findById(Integer copaId) {
		return repository.findById(copaId).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public Collection<Copa> findAll() {
		return repository.findAll();
	}
}
