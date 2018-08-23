package br.jus.trf1.aletheia.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.jus.trf1.aletheia.model.Lote;
import br.jus.trf1.aletheia.repository.LoteRepository;

@Service
public class LoteService {
	
	@Autowired
	private LoteRepository loteRepository;
	
	public Lote atualizar(Long codigo, Lote lote) {
		
		Lote loteSalvo = loteRepository.findOne(codigo);
		if (loteSalvo == null){
			throw new EmptyResultDataAccessException(1);
		}
			BeanUtils.copyProperties(lote, loteSalvo, "codigo");
			return loteRepository.save(loteSalvo);

	}
}
