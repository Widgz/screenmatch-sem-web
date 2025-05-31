package br.com.alura.screenmatch;

import br.com.alura.screenmatch.principal.Principal;
import br.com.alura.screenmatch.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {
	//para salvar info no banco de dados, utiliza-se injeção de dependência
	//significa que a responsabilidade de instanciar o objeto é do framework, no caso, spring
	//assim, usamos o @Autowired
	@Autowired
	private SerieRepository repositorio;

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Aqui, coloca-se o principal, que nós gerenciamos, para receber o repositorio
		Principal principal = new Principal(repositorio);
		principal.exibeMenu();
	}
}