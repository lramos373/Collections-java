package list;

import java.util.LinkedList;


public class ExemploLinkedList {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione as sete notas: " );
        LinkedList<Double> notas2 = new LinkedList<Double>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);
        System.out.println(notas2);
        System.out.println(" MOstre a primeira nota da nova lista sem removê-lo:" + notas2.getFirst());
        System.out.println(notas2);
        System.out.println(" MOstre a primeira nota da nova lista  removendo: " + notas2.removeFirst() );
        System.out.println(notas2);
    }
}
