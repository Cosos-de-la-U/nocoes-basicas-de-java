package Model;

import java.util.Objects;

public class Funcionário {
    private String nome;
    private String sobrenome;
    private int idade;

    public Funcionário(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionário that)) return false;
        return getIdade() == that.getIdade() && getNome().equals(that.getNome()) && getSobrenome().equals(that.getSobrenome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getSobrenome(), getIdade());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
