package Exercicio.Proposto5;

import java.util.*;

public class EstadosNordeste {


    public static void main(String[] args) {
        System.out.println("--\t Estados do nordeste e sua população\t--");
        Map<String, Integer> estados = new HashMap<>() {{
            put("Pernambuco", 9616621);
            put("Alagoas", 3351543);
            put("Ceará", 9187103);
            put("Rio Grande do Norte", 3534265);
        }};
        for (Map.Entry<String, Integer> estado : estados.entrySet())
            System.out.println("O estado do " + estado.getKey() + " com "
                    + estado.getValue() + " de Pessoas");

        System.out.println("--\t Mudando a população de Pernambuco\t--");
        estados.put("Pernambuco", 3534165);
        for (Map.Entry<String, Integer> estado : estados.entrySet())
            System.out.println("O estado do " + estado.getKey() + " com "
                    + estado.getValue() + " de Pessoas");
        System.out.println("--\t Confira se o estado de Paraiba esta na lista \t--");
        if (estados.containsKey("Paraiba")) {
            System.out.println("Esta na lista");
        } else {
            System.out.println("--\tAdicionado o estado da Paraiba e sua população\t--");
            estados.put("Paraiba", 4039277);
            for (Map.Entry<String, Integer> estado : estados.entrySet())
                System.out.println("O estado do " + estado.getKey() + " com "
                        + estado.getValue() + " de Pessoas");
        }
        System.out.println("--\t População de Percambuco\t--" + estados.get("Pernambuco"));
        System.out.println("--\tEstados na ordem informada\t--");
        Map<String, Integer> estados1 = new LinkedHashMap<>() {{
            put("Pernambuco", 9616621);
            put("Alagoas", 3351543);
            put("Ceará", 9187103);
            put("Rio Grande do Norte", 3534265);
        }};
        for (Map.Entry<String, Integer> estado : estados1.entrySet())
            System.out.println("O estado do " + estado.getKey() + " com "
                    + estado.getValue() + " de Pessoas");
        System.out.println("--\tEstados na ordem alfabetica\t--");
        Map<String, Integer> estados2 = new TreeMap<>(estados);
        for (Map.Entry<String, Integer> estado : estados2.entrySet())
            System.out.println("O estado do " + estado.getKey() + " com "
                    + estado.getValue() + " de Pessoas");

        Integer menorPopulacão = Collections.min(estados.values());
        Set<Map.Entry<String, Integer>> modelo = estados.entrySet();
        String estadoMenosPopuloso = "";
        for (Map.Entry<String, Integer> menor : modelo) {
            if (menor.getValue().equals(menorPopulacão))
                estadoMenosPopuloso = menor.getKey();

        }
        System.out.println("o estado do " + estadoMenosPopuloso + " é o menos populoso com  " + menorPopulacão + " habitantes");

        Integer maiorPopulacão = Collections.max(estados.values());
        Set<Map.Entry<String, Integer>> modelo1 = estados.entrySet();
        String estadoMaisPopuloso = "";
        for (Map.Entry<String, Integer> maior : modelo1) {
            if (maior.getValue().equals(maiorPopulacão))
                estadoMaisPopuloso = maior.getKey();

        }
        System.out.println("o estado do " + estadoMaisPopuloso + " é o mais populoso com  " + maiorPopulacão + " habitantes");


        Iterator<Integer> iterator = estados.values().iterator();
        Integer soma = 0;
        while (iterator.hasNext())
            soma += iterator.next();
        System.out.println("--\tA soma da população dos estados \t--\n" + soma);
        System.out.println("--\tA media da população dos estados \t--\n" + (soma / estados.size()));

        System.out.println("--\tEstados com população maior que 4000000\t--" );
        Iterator<Integer> iterator1 = estados.values().iterator();
        while (iterator1.hasNext())
            if (iterator1.next() < 4000000) iterator1.remove();

        for (Map.Entry<String, Integer> estado : estados.entrySet())
            System.out.println("O estado do " + estado.getKey() + " com "
                    + estado.getValue() + " de Pessoas");
        estados.clear();
        System.out.println(estados);
        System.out.println("o dicionario está vazio: "+ estados.isEmpty());



    }

}

