package pe.senati.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="corredores")
public class Corredor implements Serializable
{
	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer corredorId;
	
	@Column
	private String nombre;
	
	@Column
	private Character sexo;
	
	@DateTimeFormat(pattern="yyyy-MM-dd",iso=ISO.DATE)
	private LocalDate fnacimiento;
	
	@Column
	private Double sueldo;
	
	@Column
	private String celular;
	
	@Column(unique=true,nullable=false)
	private String email;

	@DateTimeFormat(pattern="yyyy-MM-dd",iso=ISO.DATE)
	private LocalDate fcontrato;
	
	@OneToOne
	@JoinColumn(name="auto_id",unique=true,nullable=false)
	private Auto auto;
	
	@OneToOne(mappedBy="corredor")
	private Conyuge conyuge;
	
	@ManyToOne
	@JoinColumn(name="equipo_id",nullable=false)
	private Equipo equipo;
	
	@ManyToOne
	@JoinColumn(name="copa_id",nullable=false)
	private Copa copa;
	
	public Corredor() {
	}

	public Corredor(Integer corredorId, String nombre, Character sexo, LocalDate fnacimiento, String puesto,
			Double sueldo, String celular, String email, LocalDate fcontrato) {
		this.corredorId = corredorId;
		this.nombre = nombre;
		this.sexo = sexo;
		this.fnacimiento = fnacimiento;
		this.sueldo = sueldo;
		this.celular = celular;
		this.email = email;
		this.fcontrato = fcontrato;
	}

	public Corredor(String nombre, Character sexo, LocalDate fnacimiento, Double sueldo, String celular,
			String email, LocalDate fcontrato) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.fnacimiento = fnacimiento;
		this.sueldo = sueldo;
		this.celular = celular;
		this.email = email;
		this.fcontrato = fcontrato;
	}

	public Integer getCorredorId() {
		return corredorId;
	}

	public void setCorredorId(Integer corredorId) {
		this.corredorId = corredorId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public LocalDate getFnacimiento() {
		return fnacimiento;
	}

	public void setFnacimiento(LocalDate fnacimiento) {
		this.fnacimiento = fnacimiento;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getFcontrato() {
		return fcontrato;
	}

	public void setFcontrato(LocalDate fcontrato) {
		this.fcontrato = fcontrato;
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public Conyuge getConyuge() {
		return conyuge;
	}

	public void setConyuge(Conyuge conyuge) {
		this.conyuge = conyuge;
	}

	public Copa getCopa() {
		return copa;
	}

	public void setCopa(Copa copa) {
		this.copa = copa;
	}
}
