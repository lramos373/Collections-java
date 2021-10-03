package Exercicio.Desafio;

import java.util.*;

public class Programa {
    public static void main(String[] args) {
        int totalNumeros = 100;
        List<Integer> lista = new ArrayList<>();
        Random  geradorDeNumero = new Random();
        for ( int i=0 ;i<totalNumeros;i++ ){
           lista.add(geradorDeNumero.nextInt(10));
        }
       Map<Integer,Integer> listagem = new TreeMap<>();
     for ( Integer num : lista) {
         if (listagem.containsKey(num))
             listagem.put(num, listagem.get(num) + 1);
         else
             listagem.put(num, 1);
     }
        System.out.println(listagem);
    }
}
