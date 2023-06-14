package Exercícios.GerenciamentoDeArtigos.Model;

import Exercícios.GerenciamentoDeArtigos.Enums.Comparacion;
import Exercícios.GerenciamentoDeArtigos.Repository.Entregável;

public class Serie implements Entregável {
    private String título;
    private int numeroDeTemporadas;
    private boolean éEntregue;
    private String gẽnero;
    private String criador;

    public Serie(String título, int numeroDeTemporadas, String gẽnero, String criador) {
        this.título = título;
        this.numeroDeTemporadas = numeroDeTemporadas;
        //Esta definido como false, porque ainda não foi entregue
        this.éEntregue = false;
        this.gẽnero = gẽnero;
        this.criador = criador;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public boolean iséEntregue() {
        return éEntregue;
    }

    public void setéEntregue(boolean éEntregue) {
        this.éEntregue = éEntregue;
    }

    public String getGẽnero() {
        return gẽnero;
    }

    public void setGẽnero(String gẽnero) {
        this.gẽnero = gẽnero;
    }

    public String getCriador() {
        return criador;
    }

    public void setCriador(String criador) {
        this.criador = criador;
    }

    @Override
    public void entregar() {
        éEntregue = true;
    }

    @Override
    public void retornar() {
        éEntregue = false;
    }

    @Override
    public boolean verifiqueSeOItemFoiEntregue() {
        return éEntregue;
    }

    @Override
    public int compareTo(Object object) {
        int estado = Comparacion.IGUAL.valor;

        //Fazemos um casting de objetos para usar o metodo get
        Serie serie = (Serie) object;
        if (numeroDeTemporadas > serie.getNumeroDeTemporadas()) {
            estado = Comparacion.MAIOR.valor;
        } else if (numeroDeTemporadas < serie.getNumeroDeTemporadas()) {
            estado = Comparacion.MENOR.valor;
        }
        return estado;
    }

    @Override
    public String toString() {
        return "Serie{" + "título='" + título + '\'' + ", numeroDeTemporadas=" + numeroDeTemporadas + ", éEntregue=" + éEntregue + ", gẽnero='" + gẽnero + '\'' + ", criador='" + criador + '\'' + '}';
    }

    public boolean equals(Serie serie) {
        //Cool approach:
        if (this == serie){
            return true;
        }
        if(serie == null){
            return false;
        }
        return título.equalsIgnoreCase(serie.getTítulo()) && criador.equalsIgnoreCase(serie.getCriador());

        //Naive approach:
//        if (título.equalsIgnoreCase(serie.getTítulo()) && criador.equalsIgnoreCase(serie.getCriador())) {
//            return true;
//        }
//        return false;
    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Serie serie)) return false;
//        return getNumeroDeTemporadas() == serie.getNumeroDeTemporadas() && iséEntregue() == serie.iséEntregue() && Objects.equals(getTítulo(), serie.getTítulo()) && Objects.equals(getGẽnero(), serie.getGẽnero()) && Objects.equals(getCriador(), serie.getCriador());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getTítulo(), getNumeroDeTemporadas(), iséEntregue(), getGẽnero(), getCriador());
//    }
}
