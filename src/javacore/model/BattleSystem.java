package javacore.model;

import java.util.List;

public class BattleSystem {

    public double calcularMediaForca(List<Herois> team ){
        double totalForca = 0;

        if (team == null || team.isEmpty()) {
            return 0;
        }

            for (Herois hero : team ) {
                totalForca += hero.getStrength();
            }
            return totalForca/team.size();
    }

    public double calculaMediaVelocidade (List<Herois> team){
        double totalVelocidade = 0;
        if ( team == null || team.isEmpty()){
            return 0;
        }
        for (Herois hero: team ){
            totalVelocidade+= hero.getSpeed();
        }
        return totalVelocidade/ team.size();
    }

    public double calculaMediaDefesa (List<Herois> team){
        double totalDefesa = 0;
        if ( team == null || team.isEmpty()){
            return 0;
        }
        for (Herois hero: team ){
            totalDefesa+= hero.getDefence();
        }
        return totalDefesa/ team.size();
    }

    public double calculaMediaInteligencia(List<Herois> team){
        double totalInteligencia = 0;
        if ( team == null || team.isEmpty()){
            return 0;
        }
        for (Herois hero: team ){
            totalInteligencia += hero.getSpeed();
        }
        return totalInteligencia/ team.size();
    }

    public int somaQuantidadeVidaEquipe (List<Herois> team){
        if (team==null || team.isEmpty()){
            System.out.println("Time Vazio");
            return 0;
        }

        int totalVidaEquipe = 0;

        for (Herois herois : team){
            totalVidaEquipe += herois.getHp();
        }
            return totalVidaEquipe;
    }

    // batalha






}
