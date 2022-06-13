package com.algaworks.algalog.api.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algalog.api.model.OcorrenciaModel;
import com.algaworks.algalog.domain.model.Ocorrencia;

@Component
public class OcorrenciaAssembler {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public OcorrenciaModel toModel(Ocorrencia ocorrencia) {
		return modelMapper.map(ocorrencia, OcorrenciaModel.class);
	}

}
