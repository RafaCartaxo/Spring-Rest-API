package jr.api.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController /*Arquitetura*/
@RequestMapping(value = "/usuario")
public class IndexController {

	
	@GetMapping(value = "/", produces = "application/json") /*Serviço*/
	public ResponseEntity init (@RequestParam (value = "nome", required = true, defaultValue = "Nome não informado!") String nome) {
		
		System.out.println("Parâmetro sendo recebido " + nome);
		
		return new ResponseEntity("REST Spring Boot, nome: " + nome, HttpStatus.OK);
	}
	
}
