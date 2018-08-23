package br.jus.trf1.aletheia.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.jus.trf1.aletheia.model.Sistema;
import br.jus.trf1.aletheia.repository.SistemaRepository;

@Service
public class SistemaService {
	
	@Autowired
	private SistemaRepository sistemaRepository;
	
	public Sistema atualizar(Long codigo, Sistema sistema) {
		
		Sistema sistemaSalvo = sistemaRepository.findOne(codigo);
		if (sistemaSalvo == null){
			throw new EmptyResultDataAccessException(1);
		}
			BeanUtils.copyProperties(sistema, sistemaSalvo, "codigo");
			return sistemaRepository.save(sistemaSalvo);

	}
}
