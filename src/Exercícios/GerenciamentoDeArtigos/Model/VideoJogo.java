package Exercícios.GerenciamentoDeArtigos.Model;

import Exercícios.GerenciamentoDeArtigos.Enums.Comparacion;
import Exercícios.GerenciamentoDeArtigos.Repository.Entregável;

public class VideoJogo implements Entregável {
    private String título;
    private int horasDeJogo;
    private boolean entregue;
    private String gẽnero;
    private String empresa;

    public VideoJogo(String título, int horasDeJogo, String gẽnero, String empresa) {
        this.título = título;
        this.horasDeJogo = horasDeJogo;
        this.entregue = false;
        this.gẽnero = gẽnero;
        this.empresa = empresa;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public int getHorasDeJogo() {
        return horasDeJogo;
    }

    public void setHorasDeJogo(int horasDeJogo) {
        this.horasDeJogo = horasDeJogo;
    }

    public boolean isEntregue() {
        return entregue;
    }

    public void setEntregue(boolean entregue) {
        this.entregue = entregue;
    }

    public String getGẽnero() {
        return gẽnero;
    }

    public void setGẽnero(String gẽnero) {
        this.gẽnero = gẽnero;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public void entregar() {
        entregue = true;
    }

    @Override
    public void retornar() {
        entregue = false;
    }

    @Override
    public boolean verifiqueSeOItemFoiEntregue() {
        return entregue;
    }

    @Override
    public int compareTo(Object object) {
        int valor = Comparacion.IGUAL.valor;

        VideoJogo videoJogo = (VideoJogo) object;
        if(horasDeJogo > videoJogo.getHorasDeJogo()){
            valor = Comparacion.MAIOR.valor;
        }else if (horasDeJogo < videoJogo.getHorasDeJogo()){
            valor = Comparacion.MENOR.valor;
        }
        return valor;
    }

    @Override
    public String toString() {
        return "VideoJogo{" +
                "título='" + título + '\'' +
                ", horasDeJogo=" + horasDeJogo +
                ", entregue=" + entregue +
                ", gẽnero='" + gẽnero + '\'' +
                ", empresa=" + empresa +
                '}';
    }

    public boolean equals(VideoJogo videoJogo){
        return título.equalsIgnoreCase(videoJogo.getTítulo()) && gẽnero.equalsIgnoreCase(videoJogo.getGẽnero()) && empresa.equalsIgnoreCase(videoJogo.getEmpresa());
    }
}
