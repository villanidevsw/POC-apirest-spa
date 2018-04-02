package com.villadev.apispa.dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Carro implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cor;
	private Integer portas;
	private Double motor;
	private Integer potencia;
	
	@ManyToOne
	@JoinColumn(name="marca_id")
	private Marca marca;	
	
	@ManyToOne
	@JoinColumn(name="categoria_id")
	private Categoria categoria;
	
	public Carro() {
		
	}	

	private  Carro(Builder builder) {
		
		this.nome = builder.nome;
		this.cor = builder.cor;
		this.portas = builder.portas;
		this.motor = builder.motor;
		this.potencia = builder.potencia;
		this.marca = builder.marca;
		this.categoria = builder.categoria;
	}

	public Long getId() {
		return id;
	}

	/*public void setId(Long id) {
		this.id = id;
	}*/

	public String getNome() {
		return nome;
	}

	/*public void setNome(String nome) {
		this.nome = nome;
	}*/

	public String getCor() {
		return cor;
	}

	/*public void setCor(String cor) {
		this.cor = cor;
	}*/

	public Integer getPortas() {
		return portas;
	}

	/*public void setPortas(Integer portas) {
		this.portas = portas;
	}*/

	public Double getMotor() {
		return motor;
	}

	/*public void setMotor(Double motor) {
		this.motor = motor;
	}*/

	public Integer getPotencia() {
		return potencia;
	}

	/*public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}*/

	public Marca getMarca() {
		return marca;
	}

	/*public void setMarca(Marca marca) {
		this.marca = marca;
	}*/

	public Categoria getCategoria() {
		return categoria;
	}

	/*public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	public static class Builder {
		private String nome;
		private String cor;
		private Integer portas;
		private Double motor;
		private Integer potencia;
		private Marca marca;	
		private Categoria categoria;
		
		public Builder (String nome,Marca marca,Categoria categoria) {
			this.nome = nome;
			this.marca = marca;
			this.categoria = categoria;
			
		}		
			
		public Builder cor (String cor) {
			this.cor =  cor;
			return this;
		}
		
		public Builder portas (Integer portas) {
			this.portas =  portas;
			return this;
		}
		
		public Builder motor (Double motor) {
			this.motor =  motor;
			return this;
		}
		
		public Builder potencia (Integer portas) {
			this.portas =  portas;
			return this;
		}
		
		public Carro build () {
			return new Carro(this);
		}
	}
	
}
