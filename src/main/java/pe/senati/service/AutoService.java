package pe.senati.service;

import java.util.Collection;

import pe.senati.entity.Auto;

public interface AutoService 
{
	public abstract void insert(Auto auto);
	public abstract void update(Auto auto);
	public abstract void delete(Integer autoId);
	public abstract Auto findById(Integer autoId);
	public abstract Collection<Auto> findAll();
}
