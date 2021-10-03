package Exercicio.Proposto6;

import java.rmi.MarshalledObject;
import java.util.*;

public class ProgramaOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("--\t Ordem aleatória\t--");
        Map<Integer,Contato> agenda = new HashMap<>(){{
            put(1,new Contato("Simba",2222));
            put(2,new Contato("Cami",5555));
            put(3,new Contato("Jon", 1111));

        }};

        for( Map.Entry<Integer,Contato> contato : agenda.entrySet())
        System.out.println(contato.getKey() + " - "+contato.getValue().getNome());

        System.out.println("--\t Ordem inserção\t--");
        Map<Integer,Contato> agenda1 = new LinkedHashMap<>(){{
            put(1,new Contato("Simba",2222));
            put(2,new Contato("Cami",5555));
            put(3,new Contato("Jon", 1111));

        }};
        for( Map.Entry<Integer,Contato> contato : agenda1.entrySet())
            System.out.println(contato.getKey() + " - "+contato.getValue().getNome());

        System.out.println("--\t Ordem Id\t--");
        Map<Integer,Contato> agenda2 = new TreeMap<>(agenda);
        for( Map.Entry<Integer,Contato> contato : agenda2.entrySet())
            System.out.println(contato.getKey() + " - "+contato.getValue().getNome());

        System.out.println("--\t Ordem Telefone\t--");
        Set<Map.Entry<Integer,Contato>> agenda3 = new TreeSet<>(new ComparatorOrdemTelefone());
        agenda3.addAll(agenda.entrySet());
        for( Map.Entry<Integer,Contato> contato : agenda3)
            System.out.println(contato.getKey() + " - "+contato.getValue().getNome()+" - " + contato.getValue().getNumero());

        System.out.println("--\t Ordem Telefone\t--");
        Set<Map.Entry<Integer,Contato>> agenda4 = new TreeSet<>(new ComparatorOrdemNomeContato());
        agenda4.addAll(agenda.entrySet());
        for( Map.Entry<Integer,Contato> contato : agenda4)
            System.out.println(contato.getKey() + " - "+contato.getValue().getNome()+" - " + contato.getValue().getNumero());

    }

}
