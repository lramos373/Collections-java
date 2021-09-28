package Exercicio.Proposto1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercicio1 {

    public static void main(String[] args) {
        List<Mes> mes = new ArrayList<>() {
            {
                add(new Mes("Janeiro", 32d));
                add(new Mes("Fevereiro", 31d));
                add(new Mes("Março", 28d));
                add(new Mes("abril", 25d));
                add(new Mes("Maio", 21d));
                add(new Mes("Junho", 19d));
            } };

             Iterator<Mes> iterator = mes.iterator();
        Double mediaSemestral = 0d;
        int cont = 0;
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double nextMes = iterator.next().getTem();
            soma += nextMes;
            cont++;
            mediaSemestral = soma / cont;

        }
        System.out.println(mediaSemestral);
        Iterator<Mes> iterator1 = mes.iterator();
       while(iterator1.hasNext()){
           Double nextMesTemp = iterator1.next().getTem();
           String nextMesNome = iterator1.next().getMes();
           if(mediaSemestral < nextMesTemp){
               System.out.println("O mes de "+ nextMesNome + " foi mais quente que a media Semetral de: "+ mediaSemestral+
                       " e a sua temperatura foi de :"+nextMesTemp);
           }
       }

    }

}

