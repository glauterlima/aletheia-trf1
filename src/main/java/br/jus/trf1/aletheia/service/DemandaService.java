package br.jus.trf1.aletheia.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jus.trf1.aletheia.model.Demanda;
import br.jus.trf1.aletheia.model.Pessoa;
import br.jus.trf1.aletheia.repository.DemandaRepository;
import br.jus.trf1.aletheia.repository.PessoaRepository;
import br.jus.trf1.aletheia.service.exception.PessoaInexistenteOuInativaException;

@Service
public class DemandaService {
	
	@Autowired
	private DemandaRepository demandaRepository;
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Demanda salvar(Demanda demanda) {
		validarPessoa(demanda);
		
		return demandaRepository.save(demanda);
	}
	
	public Demanda atualizar(Long codigo, Demanda demanda) {
		
		Demanda demandaSalva = buscarDemandaExistente(codigo);
		if (!demanda.getPessoa().equals(demandaSalva.getPessoa())) {
			validarPessoa(demanda);
		}
			BeanUtils.copyProperties(demanda, demandaSalva, "codigo");
			return demandaRepository.save(demandaSalva);

	}
	
	private void validarPessoa(Demanda demanda) {
		Pessoa pessoa = null;
		if (demanda.getPessoa().getCodigo() != null) {
			pessoa = pessoaRepository.findOne(demanda.getPessoa().getCodigo());
		}

		if (pessoa == null || pessoa.isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}
	}
	
	private Demanda buscarDemandaExistente(Long codigo) {
		Demanda demandaSalva = demandaRepository.findOne(codigo);
		if (demandaSalva == null) {
			throw new IllegalArgumentException();
		}
		return demandaSalva;
	}
	
}
