package javacore.model;

import java.util.ArrayList;



// dia 20/02 fazer o sistema de ataque do jogo



public class Player {

    ArrayList<Heroes> heroTeam = new ArrayList<Heroes>();


    private String playerName;
    private double saldo = 200; //saldo inicial para todo jogador.


    public double getSaldo() {
        return saldo;
    }

    public String getPlayerName() {
        return playerName;
    }


    public void comprarHeroi(Heroes heroName) {
        if (getSaldo() > heroName.getPrice()) {
            saldo = saldo - heroName.getPrice();
            heroTeam.add(heroName);
        } else {
            System.out.println("Saldo insuficente para comprar esse heroi.");
        }
    }

    public void venderHeroi(Heroes heroName) {
        if (heroName == null) {
            System.out.println("Héroi não pode ser nulo! ❌");
        }
        if (!heroTeam.contains(heroName)) {
            System.out.println("Héroi não está no seu time, venda apenas os personagens que você possui. ❌");
        }
            saldo = saldo + heroName.getPrice();
        System.out.println("Héroi vendido com sucesso! ✅ "); // emoji do dinheiro
    }
}