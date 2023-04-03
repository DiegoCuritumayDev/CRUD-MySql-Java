package pe.senati.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="equipo")
public class Equipo implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer equipoId;
	
	@Column
	private String nombreDep;
	
	@Column
	private String telefono;
	
	@OneToMany(mappedBy="equipo")
	private Collection<Corredor> itemsCorredor=new ArrayList<>();
	
	public Equipo() {
	}

	public Equipo(Integer equipoId, String nombreDep, String telefono) {
		this.equipoId = equipoId;
		this.nombreDep = nombreDep;
		this.telefono = telefono;
	}

	public Integer getEquipoId() {
		return equipoId;
	}

	public void setEquipoId(Integer equipoId) {
		this.equipoId = equipoId;
	}

	public String getNombreDep() {
		return nombreDep;
	}

	public void setNombreDep(String nombreDep) {
		this.nombreDep = nombreDep;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Collection<Corredor> getItemsCorredor() {
		return itemsCorredor;
	}

	public void setItemsCorredor(Collection<Corredor> itemsCorredor) {
		this.itemsCorredor = itemsCorredor;
	}
}
