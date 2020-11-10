package com.example.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import com.sun.istack.NotNull;

@Entity
@Table(name="categoria")
public class CategoriaModel {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column
		private Long Id;
		
		@Column
		@NotNull
		private String nome;
		
		@Column 
		@NotNull
		private int preco;

		public Long getId() {
			return Id;
		}

		public void setId(Long id) {
			Id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getPreco() {
			return preco;
		}

		public void setPreco(int preco) {
			this.preco = preco;
		}

		
		
}
