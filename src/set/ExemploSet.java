package set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione as sete notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        //System.out.println("exiba a posição da nota 5.0 :" + notas.indexOf(5d));
        //System.out.println("Adiciona na lista a nota 8.0 na posição 4: ");
        //System.out.println(" Substitua a nota 5.0 pela nota 6.0");
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
        System.out.println("exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota:" + Collections.max(notas));
        //System.out.println("exiba a terceira nota adicionada: " + notas.get(2));
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores:" + soma);
        System.out.println("Exiba a media das notas: " + (soma / notas.size()));
        System.out.println("Remova a nota 0:");
        notas.remove(0d);
        System.out.println(notas);
        //System.out.println("remova a nota na possição 0");
        //notas.remove(0);
        //System.out.println(notas);
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7)
                iterator1.remove();
        }
        System.out.println(notas);
        System.out.println("Exiba todas as notas como foram informada: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);
        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
        System.out.println("apague toda a lista");
        notas.clear();
        System.out.println(notas);
        System.out.println("Confira se a lista 1 está vazia : " + notas.isEmpty());
        System.out.println("Confira se a lista 2 está vazia : " + notas2.isEmpty());
        System.out.println("Confira se a lista 3 está vazia : " + notas3.isEmpty());



    }
}
