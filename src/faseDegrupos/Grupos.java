package faseDegrupos;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Grupos{
     Random random = new Random();
    private int pontos = 0;
    HashMap<String, Integer> selecoes = new HashMap<>();

    public Grupos(){
        selecoes.put("Brasil", pontos);
        selecoes.put("Argentina", pontos);
        selecoes.put("França", pontos);
        selecoes.put("Alemanha", pontos);
    }

    public void realizarpartida(){
        //vou refazer dps
        System.out.println(" ");
        System.out.println("---------PARTIDAS---------");
            System.out.println("Brasil x Argentina");
            int placar1 = random.nextInt(5);
            int placar2 = random.nextInt(5);
            if ( placar1 > placar2){
                selecoes.replace("Brasil", pontos = 0);
                selecoes.replace("Brasil", pontos += 3);
                System.out.println("Placar: " + placar1 + " a " + placar2);
            } else if (placar2 > placar1){
                selecoes.replace("Argentina", pontos = 0);
                selecoes.replace("Argentina", pontos += 3);
                System.out.println("Placar: " + placar1 + " a " + placar2);
            } else if (placar1 == placar2){
                selecoes.replace("Brasil", pontos = 0);
                 selecoes.replace("Argentina", pontos = 0);
                 selecoes.replace("Brasil", pontos += 1);
                 selecoes.replace("Argentina", pontos += 1);
                 System.out.println("Placar: " + placar1 + " a " + placar2);
            }
             System.out.println("Brasil x França");
            placar1 = random.nextInt(5);
            placar2 = random.nextInt(5);
            if (placar1 > placar2){
                selecoes.replace("Brasil", pontos = 0);
                selecoes.replace("Brasil", pontos += 3);
                System.out.println("Placar: " + placar1 + " a " + placar2);
            } else if (placar2 > placar1){
                selecoes.replace("França", pontos = 0);
                selecoes.replace("França", pontos += 3);
                System.out.println("Placar: " + placar1 + " a " + placar2);
            } else if (placar1 == placar2) {
                selecoes.replace("Brasil", pontos = 0);
                 selecoes.replace("França", pontos = 0);
                 selecoes.replace("Brasil", pontos += 1);
                 selecoes.replace("França", pontos += 1);
                 System.out.println("Placar: " + placar1 + " a " + placar2);
            }
             System.out.println("Brasil x Alemanha");
             placar1 = random.nextInt(5);
             placar2 = random.nextInt(5);
            if (placar1 > placar2){
                selecoes.replace("Brasil", pontos = 0);
                selecoes.replace("Brasil", pontos += 3);
                System.out.println("Placar: " + placar1 + " a " + placar2);
            } else if (placar2 > placar1){
                selecoes.replace("Alemanha", pontos = 0);
                selecoes.replace("Alemanha", pontos += 3);
                System.out.println("Placar: " + placar1 + " a " + placar2);
            } else if (placar1 == placar2) {
                selecoes.replace("Brasil", pontos = 0);
                 selecoes.replace("Alemanha", pontos = 0);
                 selecoes.replace("Brasil", pontos += 1);
                 selecoes.replace("Alemanha", pontos += 1);
                 System.out.println("Placar: " + placar1 + " a " + placar2);
            }
             System.out.println("França x Argentina");
            placar1 = random.nextInt(5);
            placar2 = random.nextInt(5);
            if (placar1 > placar2){
                selecoes.replace("França", pontos = 0);
                selecoes.replace("França", pontos += 3);
                System.out.println("Placar: " + placar1 + " a " + placar2);
            } else if (placar2 > placar1){
                selecoes.replace("Argentina", pontos = 0);
                selecoes.replace("Argentina", pontos += 3);
                System.out.println("Placar: " + placar1 + " a " + placar2);
            } else if (placar1 == placar2) {
                selecoes.replace("França", pontos = 0);
                 selecoes.replace("Argentina", pontos = 0);
                 selecoes.replace("França", pontos += 1);
                 selecoes.replace("Argentina", pontos += 1);
                 System.out.println("Placar: " + placar1 + " a " + placar2);
            }
             System.out.println("França x Alemanha");
             placar1 = random.nextInt(5);
             placar2 = random.nextInt(5);
            if (placar1 > placar2){
                selecoes.replace("França", pontos = 0);
                selecoes.replace("França", pontos += 3);
                System.out.println("Placar: " + placar1 + " a " + placar2);
            } else if (placar2 > placar1){
                selecoes.replace("Alemanha", pontos = 0);
                selecoes.replace("Alemanha", pontos += 3);
                System.out.println("Placar: " + placar1 + " a " + placar2);
            } else if (placar1 == placar2) {
                selecoes.replace("França", pontos = 0);
                 selecoes.replace("Alemanha", pontos = 0);
                 selecoes.replace("França", pontos += 1);
                 selecoes.replace("Alemanha", pontos += 1);
                 System.out.println("Placar: " + placar1 + " a " + placar2);
            }
            System.out.println("Argentina x Alemanha");
             placar1 = random.nextInt(5);
             placar2 = random.nextInt(5);
            if (placar1 > placar2){
                selecoes.replace("Argentina", pontos = 0);
                selecoes.replace("Argentina", pontos += 3);
                System.out.println("Placar: " + placar1 + " a " + placar2);
            } else if (placar2 > placar1){
                selecoes.replace("Alemanha", pontos = 0);
                selecoes.replace("Alemanha", pontos += 3);
                System.out.println("Placar: " + placar1 + " a " + placar2);
            } else if (placar1 == placar2) {
                selecoes.replace("Argentina", pontos = 0);
                 selecoes.replace("Alemanha", pontos = 0);
                 selecoes.replace("Argentina", pontos += 1);
                 selecoes.replace("Alemanha", pontos += 1);
                 System.out.println("Placar: " + placar1 + " a " + placar2);
            }
        }
    public void tabela(){
       
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
        ranking.forEach((nome, pts) -> System.out.println(nome + " - " + pts + " pontos"));
    }
}