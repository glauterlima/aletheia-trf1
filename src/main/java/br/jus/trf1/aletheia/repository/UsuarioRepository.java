package br.jus.trf1.aletheia.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.jus.trf1.aletheia.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Optional<Usuario> findByEmail(String email);
	
}