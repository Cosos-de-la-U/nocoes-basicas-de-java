package Exercícios.GerenciamentoDeArtigos.Repository;

public interface Entregável {
    public void entregar();

    public void retornar();

    public boolean verifiqueSeOItemFoiEntregue();

    //Feito à mão
    public int compareTo(Object object);
}
