package Exercicio.Proposto4;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Programa {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagemFavorita = new HashSet<>(){{
            add(new LinguagemFavorita("java",1991, "intellij"));
            add(new LinguagemFavorita("python",1990,"intellij"));
            add(new LinguagemFavorita("java Script",1995,"eclipse"));
        }};
        System.out.println("--\tordem de inserção\t--");
        for (LinguagemFavorita next : linguagemFavorita) System.out.println(next);
        System.out.println("--\tordem de Natural ( nome)\t--");
        Set<LinguagemFavorita> linguagemFavorita1 = new TreeSet<>(linguagemFavorita);
        for (LinguagemFavorita next : linguagemFavorita1) System.out.println(next);
        System.out.println("--\tordem de Natural (Ide)\t--");
        Set<LinguagemFavorita> linguagemFavorita2 = new TreeSet<>(new OrdemIde());
        linguagemFavorita2.addAll(linguagemFavorita);
        for (LinguagemFavorita next : linguagemFavorita2) System.out.println(next);
        System.out.println("--\tordem de Natural (Ano e nome)\t--");
        Set<LinguagemFavorita> linguagemFavorita3 = new TreeSet <>  (new OrdemAnoDeCriacaoENome());
        linguagemFavorita3.addAll(linguagemFavorita);
        for (LinguagemFavorita next : linguagemFavorita3) System.out.println(next);
        System.out.println("--\tordem de Natural (Nome, ano  e Ide)\t--");
        Set<LinguagemFavorita> linguagemFavorita4 = new TreeSet <>  (new OrdemNomeAnoEIde());
        linguagemFavorita4.addAll(linguagemFavorita);
        for (LinguagemFavorita next : linguagemFavorita4) System.out.println(next);
}}
