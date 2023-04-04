package pe.senati.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="conyuges")
public class Conyuge implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer conyugeId;
	
	@Column
	private String nombreAp;
	
	@Column(unique=true,nullable=false)
	private Long dni;
	
	@Column
	private String celular;
	
	@OneToOne
	@JoinColumn(name="corredor_id",
		unique=true,nullable=false)
	private Corredor corredor;
	
	public Conyuge() {
	}

	public Conyuge(Integer conyugeId, 
			String nombreAp, Long dni, 
			String celular) {
		this.conyugeId = conyugeId;
		this.nombreAp = nombreAp;
		this.dni = dni;
		this.celular = celular;
	}

	public Integer getConyugeId() {
		return conyugeId;
	}

	public void setConyugeId(Integer conyugeId) {
		this.conyugeId = conyugeId;
	}

	public String getNombreAp() {
		return nombreAp;
	}

	public void setNombreAp(String nombreAp) {
		this.nombreAp = nombreAp;
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Corredor getCorredor() {
		return corredor;
	}

	public void setCorredor(Corredor corredor) {
		this.corredor = corredor;
	}
}
