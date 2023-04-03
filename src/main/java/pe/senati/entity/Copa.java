package pe.senati.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="copas")
public class Copa implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer copaId;
	
	@Column
	private String nombreCo;
	
	@Column
	private Double vpremio;
	
	@DateTimeFormat(pattern="yyyy-MM-dd",iso=ISO.DATE)
	private LocalDate fapertura;
	
	@DateTimeFormat(pattern="yyyy-MM-dd",iso=ISO.DATE)
	private LocalDate fclausura;
	
	@OneToMany(mappedBy="copa")
	private Collection<Corredor> itemsCorredores=new ArrayList<>();
	
	public Copa() {
	}
	
	public Copa(Integer copaId, String nombreCo, Double vpremio, LocalDate fapertura, LocalDate fclausura) {
		this.copaId = copaId;
		this.nombreCo = nombreCo;
		this.vpremio = vpremio;
		this.fapertura = fapertura;
		this.fclausura = fclausura;
	}

	public Integer getCopaId() {
		return copaId;
	}

	public void setCopaId(Integer copaId) {
		this.copaId = copaId;
	}

	public String getNombreCo() {
		return nombreCo;
	}

	public void setNombreCo(String nombreCo) {
		this.nombreCo = nombreCo;
	}

	public Double getVpremio() {
		return vpremio;
	}

	public void setVpremio(Double vpremio) {
		this.vpremio = vpremio;
	}

	public LocalDate getFapertura() {
		return fapertura;
	}

	public void setFapertura(LocalDate fapertura) {
		this.fapertura = fapertura;
	}

	public LocalDate getFclausura() {
		return fclausura;
	}

	public void setFclausura(LocalDate fclausura) {
		this.fclausura = fclausura;
	}

	public Collection<Corredor> getItemsCorredores() {
		return itemsCorredores;
	}

	public void setItemsCorredores(Collection<Corredor> itemsCorredores) {
		this.itemsCorredores = itemsCorredores;
	}
}
