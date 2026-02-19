package model;

import java.util.ArrayList;

public class Player {

    ArrayList<Player> HeroesList = new ArrayList<Player>();


    private String playerName;
    private double saldo = 200; //saldo inicial para todo jogador.


    public double getSaldo() {
        return saldo;
    }

    public String getPlayerName() {
        return playerName;
    }





}
