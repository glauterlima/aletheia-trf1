package br.jus.trf1.aletheia.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.jus.trf1.aletheia.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	
	public Page<Pessoa> findByNomeContaining(String nome, Pageable pageable);

}