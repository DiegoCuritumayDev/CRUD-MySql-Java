package pe.senati.service;

import java.util.Collection;

import pe.senati.entity.Corredor;

public interface CorredorService 
{
	//se define los servicios para el controlador
	public abstract void insert(Corredor corredor);
	public abstract void update(Corredor corredor);
	public abstract void delete(Integer corredorId);
	public abstract Corredor findById(Integer corredorId);
	public abstract Collection<Corredor> findAll();
}
