package Exercicio.Proposto3;


import java.util.*;

public class ArcoIris {
    public static void main(String[] args) {
        Set<String> cor = new HashSet<>();
        cor.add("Vermelho");
        cor.add("Laranja");
        cor.add("Amarelo");
        cor.add("Verde");
        cor.add("Azul");
        cor.add("anil");
        cor.add("Violeta");

        System.out.println("--\tCores uma embaixo da outra\t--");
        for (String cores : cor)
            System.out.println(cores);
        System.out.println("Quantidade de cores: " + cor.size());
        System.out.println("--\tCor em ordem alfabetica\t--");
        Set<String> cor1 = new TreeSet<>(cor);
        for (String cores : cor1) System.out.println(cores);
        System.out.println("--\tCor em ordem Inversa\t--");
        System.out.println("Ordem normal\n:" + cor);
        List<String> cor2 = new ArrayList<>(cor);
        Collections.reverse(cor2);
        System.out.println("Ordem inversa\n:" + cor2);
        System.out.println("Cores que começa com a letra V:");
        for (String comeca : cor) {

            if (comeca.startsWith("V")) System.out.println(comeca);

        }

        System.out.println("Arco iris com as cores que não comecam com a letra V:");
        Iterator<String> iterator = cor.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().startsWith("V")) iterator.remove();

        }
        System.out.println(cor);
        System.out.println("O arco iris está sem cor :");
        cor.clear();
        System.out.println(cor);
        System.out.println("Confira se o arco iris está sem cor :" + cor.isEmpty());
    }

}

