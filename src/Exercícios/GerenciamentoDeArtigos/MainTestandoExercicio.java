package Exercícios.GerenciamentoDeArtigos;

import Exercícios.GerenciamentoDeArtigos.Enums.Comparacion;
import Exercícios.GerenciamentoDeArtigos.Model.Serie;
import Exercícios.GerenciamentoDeArtigos.Model.VideoJogo;

import java.util.ArrayList;
import java.util.List;

public class MainTestandoExercicio {
    public static void main(String[] args) {
        List<Serie> serieList = new ArrayList<>();
        serieList.add(new Serie("Friends", 9, "SITCON", "Some guys"));
        serieList.add(new Serie("Vinland Saga", 2, "IDK", "A guy"));
        serieList.add(new Serie("HIMYM", 8, "SITCON", "FOX"));
        serieList.add(new Serie("SEINFELD", 11, "SITCON", "NBC"));

        List<VideoJogo> videoJogoList = new ArrayList<>();
        videoJogoList.add(new VideoJogo("TFT", 500000000, "Auto battler", "Riot"));
        videoJogoList.add(new VideoJogo("Chess", 99999999, "Strategy", "IDK"));
        videoJogoList.add(new VideoJogo("Minecraft", 1, "Cubes", "Microsoft"));

        //Nós entregamos itens da lista de série
        //We can do a classic for like this
        //for (int i = 0; i < serieList.size(); i++){
        //    serieList.get(i).entregar();
        //}

        //But it's easier to use a lambda function:
        //Y aqui entregamos las vainas po
        serieList.forEach(serie -> {
            serie.entregar();
        });

        //Entregamos mas bainas
        videoJogoList.forEach(videoJogo -> {
            videoJogo.entregar();
        });

        //Contamos quantos foram entregues
        int entregue = 0;
        //Contamos os entregues e os devolvemos
        for(Serie serie: serieList){
            if(serie.verifiqueSeOItemFoiEntregue()){
                entregue++;
                serie.retornar();
            }
        }
        //Nós imprimimos no console
        System.out.println("Serie entregue: " + entregue);

        //Nós fazemos a mesma coisa
        for(VideoJogo videoJogo: videoJogoList){
            if (videoJogo.verifiqueSeOItemFoiEntregue()){
                entregue++;
                videoJogo.retornar();
            }
        }

        //obter un item de lista para comparar
        Serie serieMaior = serieList.get(0);
        Serie serieMenor = serieList.get(0);
        for(Serie serie: serieList){
            if(serie.compareTo(serieMaior) == Comparacion.MAIOR.valor){
                serieMaior = serie;
            }
            if(serie.compareTo(serieMenor) == Comparacion.MENOR.valor){
                serieMenor = serie;
            }
        }
        System.out.println("Serie maior: " + serieMaior.getTítulo());
        System.out.println("Serie menor: " + serieMenor.getTítulo());

        //obter un item de lista para comparar
        VideoJogo videoJogoMaior = videoJogoList.get(0);
        VideoJogo videoJogoMenor = videoJogoList.get(0);
        for(VideoJogo videoJogo: videoJogoList){
            if(videoJogo.compareTo(videoJogoMaior) == Comparacion.MAIOR.valor){
                videoJogoMaior = videoJogo;
            }
            if(videoJogo.compareTo(videoJogoMenor) == Comparacion.MENOR.valor){
                videoJogoMenor = videoJogo;
            }
        }
        System.out.println("Videojogo maior: " + videoJogoMaior.getTítulo());
        System.out.println("Videojogo menor: " + videoJogoMenor.getTítulo());
    }
}
