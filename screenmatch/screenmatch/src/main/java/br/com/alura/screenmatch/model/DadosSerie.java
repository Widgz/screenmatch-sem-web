package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//JsonIgnoreProperties ignora os elementos que não foram descritos no record
@JsonIgnoreProperties(ignoreUnknown = true)

//JsonAlias busca o(s) iten(s) tal qual na API, pode-se adicionar mais de um
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao) {
}
