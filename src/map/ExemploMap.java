package map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os modelos e seus respecitvos consumo");
        Map<String, Double> carros = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);

        }};
        System.out.println(carros);
        System.out.println("Substitua o consumo do gol por 15,2 kl/l");
        carros.put("gol", 15.2);
        System.out.println("Confira se o modelo tucsom esta no dicionário" + carros.containsKey("tucsom"));
        System.out.println("Exiba o consumo do uno:" + carros.get("uno"));
        System.out.println("exiba os modelos");
        Set<String> modelos = carros.keySet();
        System.out.println(modelos);
        System.out.println("Exiba os consumos dos carros:");
        Collection<Double> consumo = carros.values();
        System.out.println(consumo);
        System.out.println("Exiba o modelo mais econômicos e seu consumo ");
        Double consumoMaisEficiente = Collections.max(carros.values());
        Set<Map.Entry<String, Double>> modelos1 = carros.entrySet();
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> eficiencia : modelos1
        ) {
            if (eficiencia.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = eficiencia.getKey();
                System.out.println("O modelo mais eficiente é " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }

        }
        System.out.println("Exiba o modelo menos econômicos e seu consumo ");
        Double menosEficiente = Collections.min(carros.values());
        String modeloMenosEficiente = "";

        for (Map.Entry<String, Double> eficiencia : modelos1
        ) {
            if (eficiencia.getValue().equals(menosEficiente)) {
                modeloMenosEficiente = eficiencia.getKey();
                System.out.println("O modelo menos eficiente é " + modeloMenosEficiente + " - " + menosEficiente);
            }
        }
        System.out.println("Exiba a soma dos consumos ");
        Iterator<Double> iterator = carros.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();

        }
        System.out.println("Exiba a media dos consumos deste dicionáirio de carros :" + soma / carros.size());
        System.out.println(carros);
        System.out.println("Remova os modelos com o consumo igual a 15.6 km/l  :");
        Iterator<Double> iterator1 = carros.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carros);
        System.out.println("Exiba todos os carros na ordem que foram informados");
        Map<String, Double> carros1 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);

        }};
        System.out.println(carros1);
        System.out.println("Exiba todos os carros na ordem alfabetica");
        Map<String, Double> carros2 = new TreeMap<>(carros1);
        System.out.println(carros2);
        System.out.println("Apaga o dicionario de carros");
        carros.clear();
        System.out.println(carros);
        System.out.println("Confirar se o dicionario carros esta vazio: "+carros.isEmpty());
    }


}
