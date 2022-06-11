package com.algaworks.algalog.exceptionhandler;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Problema {
	
	private Integer status;
	private LocalDateTime dataHora;
	private String tiutlo;
	
	private List<Campo> campos;
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public String getTiutlo() {
		return tiutlo;
	}
	public void setTiutlo(String tiutlo) {
		this.tiutlo = tiutlo;
	}
	public List<Campo> getCampos() {
		return campos;
	}
	public void setCampos(List<Campo> campos) {
		this.campos = campos;
	}

}
