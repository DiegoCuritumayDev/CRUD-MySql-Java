package pe.senati.service;

import java.util.Collection;

import pe.senati.entity.Conyuge;

public interface ConyugeService 
{
	public abstract void insert(Conyuge conyuge);
	public abstract void update(Conyuge conyuge);
	public abstract void delete(Integer conyugeId);
	public abstract Conyuge findById(Integer conyugeId);
	public abstract Collection<Conyuge> findAll();
}
