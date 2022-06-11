package com.algaworks.algalog.exceptionhandler;

import com.algaworks.algalog.exceptionhandler.Campo;

public class Campo {
	
		private String nome;
		private String mensagem;
		
		public Campo(String nome2, String mensagem2) {
			this.nome = nome2;
			this.mensagem = mensagem2;
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getMensagem() {
			return mensagem;
		}
		public void setMensagem(String mensagem) {
			this.mensagem = mensagem;
		}
}
