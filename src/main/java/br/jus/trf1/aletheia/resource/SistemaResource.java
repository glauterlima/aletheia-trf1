package br.jus.trf1.aletheia.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.jus.trf1.aletheia.event.RecursoCriadoEvent;
import br.jus.trf1.aletheia.model.Sistema;
import br.jus.trf1.aletheia.repository.SistemaRepository;
import br.jus.trf1.aletheia.service.SistemaService;

@RestController
@RequestMapping("/sistemas")
public class SistemaResource {
	
	@Autowired
	private SistemaRepository sistemaRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@Autowired
	private SistemaService sistemaService;
	
	@GetMapping
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_SISTEMA') and #oauth2.hasScope('read')")
	public List<Sistema> listar() {
		return sistemaRepository.findAll();
	}
	
	@PostMapping
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_SISTEMA') and #oauth2.hasScope('write')")
	public ResponseEntity<Sistema> criar(@Valid @RequestBody Sistema sistema, HttpServletResponse response){
		Sistema sistemaSalvo = sistemaRepository.save(sistema);	
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, sistemaSalvo.getCodigo()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(sistemaSalvo); 
	}
	
	@GetMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_SISTEMA') and #oauth2.hasScope('read')")
	public ResponseEntity<Sistema> buscarPeloCodigo(@PathVariable Long codigo){
		Sistema sistema = sistemaRepository.findOne(codigo);
		return sistema != null ? ResponseEntity.ok(sistema) : ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_REMOVER_SISTEMA') and #oauth2.hasScope('write')")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo){
		sistemaRepository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_SISTEMA') and #oauth2.hasScope('write')")
	public ResponseEntity<Sistema> atualizar(@PathVariable Long codigo, @Valid @RequestBody Sistema sistema) {
	
		Sistema sistemaSalvo = sistemaService.atualizar(codigo, sistema);
		return ResponseEntity.ok(sistemaSalvo);
		
	}

}
