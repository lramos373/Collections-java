package Exercicio.Proposto4;

import java.util.Comparator;
import java.util.Objects;

public class LinguagemFavorita implements Comparable <LinguagemFavorita> {
    private String nome;
    private Integer anoDeCriação;
    private String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriação, String ide) {
        this.nome = nome;
        this.anoDeCriação = anoDeCriação;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoDeCriação() {
        return anoDeCriação;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriação='" + anoDeCriação + '\'' +
                ", ide='" + ide + '\'' +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return nome.equals(that.nome) && anoDeCriação.equals(that.anoDeCriação) && ide.equals(that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriação, ide);
    }


    @Override
    public int compareTo(LinguagemFavorita nome) {
        int nomeLinguagem = CharSequence.compare(this.getNome(),nome.getNome());
        if (nomeLinguagem != 0) return nomeLinguagem;

        return this.getAnoDeCriação().compareTo(nome.getAnoDeCriação());

    }
}
