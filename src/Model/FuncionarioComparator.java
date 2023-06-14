package Model;

import java.util.Comparator;

public class FuncionarioComparator implements Comparator<Funcionário> {

    @Override
    public int compare(Funcionário o1, Funcionário o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}
