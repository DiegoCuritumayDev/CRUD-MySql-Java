package pe.senati.service;

import java.util.Collection;

import pe.senati.entity.Equipo;

public interface EquipoService 
{
	public abstract void insert(Equipo equipo);
	public abstract void update(Equipo equipo);
	public abstract void delete(Integer equipoId);
	public abstract Equipo findById(Integer equipoId);
	public abstract Collection<Equipo> findAll();
}
