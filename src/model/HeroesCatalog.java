package model;

import java.util.ArrayList;

public class HeroesCatalog {

    private ArrayList<Heroes> catalagoCompra;

    //public Heroes (String heroName, int hp, double strangth, double speed, double defence, double price)
    // os atributos dos personagens sõa de 0 a 100
    // a inteligencia do personagem se da pela batalha em campo e tambem da inteligencia real do personagem ( a media dos dois )
    // HP tem maximo de 500 HP
    public HeroesCatalog (){
       catalagoCompra = new ArrayList<>();

       catalagoCompra.add(new Heroes("Thor", 300 , 70, 35, 40 , 90,45)); // Thor

       catalagoCompra.add(new Heroes("Homem-Aranha", 180 , 40, 50, 20 , 40,90)); // Homem aranha

       catalagoCompra.add(new Heroes("Wolverine", 250 , 40, 38, 50 , 70,65)); // Wolverine

       catalagoCompra.add(new Heroes("Ciclope", 150 , 20, 35, 35, 90,95)); // Ciclope

       catalagoCompra.add(new Heroes("Hulk", 300 , 80, 20.5, 70 , 120,15)); // Hulk

       catalagoCompra.add(new Heroes("Capitão América", 190 , 45, 50, 55 , 60,75)); // Capitão america

        catalagoCompra.add(new Heroes("Tocha Humana", 160 , 30, 40, 60 , 70,45));  // Tocha Humana

        catalagoCompra.add(new Heroes("Sentry", 400 , 90, 80, 80 , 300 ,35)); // Sentry

        catalagoCompra.add(new Heroes("Soul Storm", 130 , 40, 28, 90 , 50,70));

        catalagoCompra.add(new Heroes("Pantera Negra", 180 , 45, 55, 50 , 80,55));

        catalagoCompra.add(new Heroes("Capitã Marvel", 300 , 60, 50.5, 50 , 120,40));
    }


}
