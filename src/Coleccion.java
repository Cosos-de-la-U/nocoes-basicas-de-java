import Model.FuncionarioComparator;
import Model.Funcionário;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Coleccion {
    public static void main(String[] args) {

        //These two are the same
        //List<Funcionário> funcionárioLista = new ArrayList<Funcionário>();
        List<Funcionário> funcionárioLista = new ArrayList<>();

        funcionárioLista.add(new Funcionário("João", "Felix",20));
        funcionárioLista.add(new Funcionário("Ronaldinho", "Soccer",25));
        funcionárioLista.add(new Funcionário("Ana", "Romarei",15));
        for (Funcionário funcionário: funcionárioLista ){
            System.out.println("Nome: " + funcionário.getNome());
            System.out.println("Sobrenome: " + funcionário.getSobrenome());
            System.out.println("Idade: " + funcionário.getIdade());
            System.out.println();
        }

        Collections.sort(funcionárioLista,new FuncionarioComparator());

        System.out.println("Applying sort");
        for (Funcionário funcionário: funcionárioLista ){
            System.out.println("Nome: " + funcionário.getNome());
            System.out.println("Sobrenome: " + funcionário.getSobrenome());
            System.out.println("Idade: " + funcionário.getIdade());
            System.out.println();
        }
        // It's easy to sort when is one DataType
        // This is how we sort it:


    }
}
