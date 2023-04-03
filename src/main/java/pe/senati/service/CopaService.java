package pe.senati.service;

import java.util.Collection;

import pe.senati.entity.Copa;

public interface CopaService 
{
	public abstract void insert(Copa copa);
	public abstract void update(Copa copa);
	public abstract void delete(Integer copaId);
	public abstract Copa findById(Integer copaId);
	public abstract Collection<Copa> findAll();
}
