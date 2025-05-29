package br.com.alura.screenmatch.model;
//enum: limitar as categorias possiveis a uma constante
public enum Categoria {
    //constanteDeclarada("nome no json")
    ACAO("Action"),
    ROMANCE("Romance"),
    COMEDIA("Comedy"),
    DRAMA("Drama"),
    CRIME("Crime");

    //declarar atributo como categoria do OMDB para correlacionar categoria com o Json
    private String categoriaOmdb;
    Categoria(String categoriaOmdb){
        this.categoriaOmdb = categoriaOmdb;
    }

    //percorre a linha das constantes declarada, convertendo o que está no Omdb com o declarado
    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }
}
