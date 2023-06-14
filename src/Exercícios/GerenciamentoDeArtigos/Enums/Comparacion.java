package Exercícios.GerenciamentoDeArtigos.Enums;

public enum Comparacion {
    MAIOR(1),
    MENOR(-1),
    IGUAL(0);

    public final int valor;

    private Comparacion(int valor){
        this.valor = valor;
    }
}
