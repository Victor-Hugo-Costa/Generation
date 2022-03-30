package org.generation.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // Transforma em tabela
@Table(name="tb_produto") // Nomeia a tabela



public class ProdutoModel {
	
	@Id // Responsável por definir o ID como chave primária
	@GeneratedValue(strategy= GenerationType.IDENTITY) // Responsável pelo auto-incremetação do ID
	private Long id; // Define a váriavel ID
	
	@NotNull // Garante a obrigatoriedade da inclusão de dados
	private String nome; // Define a váriavel titulo
	
	@NotNull// Garante a obrigatoriedade da inclusão de dados
	@Size(min=4, max=100)
	private String descricao; // Define a váriavel titulo
	
	@NotNull
	private Double valor;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private CategoriaModel categoria;
	
	// GET e SET

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public CategoriaModel getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaModel categoria) {
		this.categoria = categoria;
	}
	
}
