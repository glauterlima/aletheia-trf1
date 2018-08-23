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
import br.jus.trf1.aletheia.model.Lote;
import br.jus.trf1.aletheia.repository.LoteRepository;
import br.jus.trf1.aletheia.service.LoteService;

@RestController
@RequestMapping("/lotes")
public class LoteResource {
	
	@Autowired
	private LoteRepository loteRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@Autowired
	private LoteService loteService;
	
	@GetMapping
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_LOTE') and #oauth2.hasScope('read')")
	public List<Lote> listar() {
		return loteRepository.findAll();
	}
	
	@PostMapping
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_LOTE') and #oauth2.hasScope('write')")
	public ResponseEntity<Lote> criar(@Valid @RequestBody Lote lote, HttpServletResponse response){
		Lote loteSalvo = loteRepository.save(lote);	
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, loteSalvo.getCodigo()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(loteSalvo); 
	}
	
	@GetMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_LOTE') and #oauth2.hasScope('read')")
	public ResponseEntity<Lote> buscarPeloCodigo(@PathVariable Long codigo){
		Lote lote = loteRepository.findOne(codigo);
		return lote != null ? ResponseEntity.ok(lote) : ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_REMOVER_LOTE') and #oauth2.hasScope('write')")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo){
		loteRepository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_LOTE') and #oauth2.hasScope('write')")
	public ResponseEntity<Lote> atualizar(@PathVariable Long codigo, @Valid @RequestBody Lote lote) {
	
		Lote loteSalvo = loteService.atualizar(codigo, lote);
		return ResponseEntity.ok(loteSalvo);
		
	}

}