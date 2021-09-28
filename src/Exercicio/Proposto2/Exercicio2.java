package Exercicio.Proposto2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;
        List<Questionario> questionario = new ArrayList<>() {{
            add(new Questionario("Telefonou para vítima?", " "));
            add(new Questionario("Esteve no local do Crime?", " "));
            add(new Questionario("Mora perto da vitima?", " "));
            add(new Questionario("Devia para a vitima?", " "));
            add(new Questionario("Ja trabalhou com a vitima?", " "));
        }};
        Iterator<Questionario> iterator = questionario.iterator();
        int cont = 1;

        while (iterator.hasNext()) {
            Questionario next = iterator.next();
            System.out.println(cont + " - " + next.getPergunta());
            resposta = scanner.next();
            next.setResposta(resposta);
            cont++;

        }
        Iterator<Questionario> iterator1 = questionario.iterator();
        int respostasPositivas = 0;
        while (iterator1.hasNext())

            if (iterator1.next().getResposta().contains("s")) {

                respostasPositivas++;
            }

        switch (respostasPositivas) {
            case 2:
                System.out.println("-- SUSPEITA --");
                break;
            case 3:
                System.out.println("--CUMPLICE--");
                break;
            case 4:
                System.out.println("--ASSASINO--");
                break;
            case 5:
                System.out.println("--INOCENTE--");
                break;


        }

    }


}

