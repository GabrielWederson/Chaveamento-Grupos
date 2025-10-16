package faseDegrupos;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Grupos{
    private int i = 0;
    private String[] nomes = {"Brasil", "Argentina", "França", "Alemanha"};
     Random random = new Random();
    private int pontosbr = 0;
    private int pontosfr = 0;
    private int pontosar = 0;
    private int pontosal = 0;
    HashMap<String, Integer> selecoes = new HashMap<>();

    public Grupos(){
        selecoes.put("Brasil", pontosbr);
        selecoes.put("Argentina", pontosar);
        selecoes.put("França", pontosfr);
        selecoes.put("Alemanha", pontosal);
    }

    public void realizarpartida(){
        //vou refazer dps
        System.out.println(" ");
        System.out.println("---------PARTIDAS---------");
        for (int k = 0; k < 7; k++){
        while (i <= nomes.length ){
            for(int j = i + 1; j < 4; j ++){
                System.out.println(nomes[i] + " X " + nomes[j]);
                System.out.println(" ");
                int placar1 = random.nextInt(5);
                int placar2 = random.nextInt(5);
                if (placar1 > placar2){
                    System.out.println(nomes[i] + " ganhou de " + placar1 + " a " + placar2 + " de " + nomes[j]);
                    System.out.println(" ");
                    if (nomes[i].equals("Brasil")){
                        selecoes.replace("Brasil", pontosbr += 3);
                    } else if (nomes[i].equals("Argentina")){
                        selecoes.replace("Argentina", pontosar += 3);
                    } else if (nomes[i].equals("França")){
                         selecoes.replace("França", pontosfr += 3);
                    } else {
                        selecoes.replace("Alemanha", pontosal += 3);
                    }
                } else if (placar2 > placar1){
                    System.out.println(nomes[j] + " ganhou de " + placar2 + " a " + placar1 + " de " + nomes[i]);
                    System.out.println(" ");
                    if (nomes[j].equals("Brasil")){
                        selecoes.replace("Brasil", pontosbr += 3);
                    } else if (nomes[j].equals("Argentina")){
                        selecoes.replace("Argentina", pontosar += 3);
                    } else if (nomes[j].equals("França")){
                         selecoes.replace("França", pontosfr += 3);
                    } else {
                        selecoes.replace("Alemanha", pontosal += 3);
                    }
                } else {
                    System.out.println(nomes[i] + " empatou com " + nomes[j] + " de " + placar1 + " a " + placar2);
                    System.out.println(" ");
                    if (nomes[i].equals("Brasil") && nomes[j].equals("Argentina") || nomes[i].equals("Argentina") && nomes[j].equals("Brasil")){
                        selecoes.replace("Brasil", pontosbr += 1);
                        selecoes.replace("Argentina", pontosar += 1);
                    } else if (nomes[i].equals("Brasil") && nomes[j].equals("Alemanha") || nomes[j].equals("Brasil") && nomes[i].equals("Alemanha") ){
                         selecoes.replace("Brasil", pontosbr += 1);
                        selecoes.replace("Alemanha", pontosal += 1);
                    } else if (nomes[i].equals("Brasil") && nomes[j].equals("França") || nomes[j].equals("Brasil") && nomes[i].equals("França")){
                        selecoes.replace("Brasil", pontosbr += 1);
                        selecoes.replace("França", pontosfr += 1);
                    } else if (nomes[i].equals("Argentina") && nomes[j].equals("Alemanha") || nomes[j].equals("Argentina") && nomes[i].equals("Alemanha")){
                        selecoes.replace("Argentina", pontosar += 1);
                        selecoes.replace("Alemanha", pontosal += 1);
                    } else if (nomes[i].equals("Argentina") && nomes[j].equals("França") || nomes[j].equals("Argentina") && nomes[i].equals("França")){
                        selecoes.replace("Argentina", pontosar += 1);
                        selecoes.replace("França", pontosfr += 1);
                    } else if (nomes[i].equals("França") && nomes[j].equals("Alemanha") || nomes[j].equals("França") && nomes[i].equals("Alemanha")){
                         selecoes.replace("Alemanha", pontosal += 1);
                        selecoes.replace("França", pontosfr += 1);
                    }
                }
            }
            i++;
        }
     }
    }
 
    public void tabela() {
    Map<String, Integer> ranking = selecoes.entrySet()
        .stream()
        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
        .collect(Collectors.toMap(
            Map.Entry::getKey,
            Map.Entry::getValue,
            (e1, e2) -> e1,
            LinkedHashMap::new
        ));

    System.out.println(" ");
    System.out.println("-------Ranking de seleções-------");

    int tamanho = ranking.size();
    int contador = 0;

    for (Map.Entry<String, Integer> entry : ranking.entrySet()) {
        contador++;
        if (contador > tamanho - 2) { 
            System.out.println(entry.getKey() + " - " + entry.getValue() + " pontos {eliminado}");
        } else {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " pontos");
        }
    }
}
}