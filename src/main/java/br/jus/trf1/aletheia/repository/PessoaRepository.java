package br.jus.trf1.aletheia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.jus.trf1.aletheia.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}