package com.pedrogennaro.devsuperiorevent.entities;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_bloco")
public class Bloco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Date inicio;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Date fim;

	@ManyToOne
	@JoinColumn(name = "atividade_id")
	private Atividade atividade;

	public Bloco() {
		
	}

	public Bloco(Integer id, Date inicio, Date fim, Atividade atividade) {
		super();
		this.id = id;
		this.inicio = inicio;
		this.fim = fim;
		this.atividade = atividade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

	public Atividade getAtividade() {
		return atividade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bloco other = (Bloco) obj;
		return Objects.equals(id, other.id);
	}
	
}
