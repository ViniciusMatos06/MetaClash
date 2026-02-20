package javacore.model;

import java.util.ArrayList;
import java.util.List;

public class HeroesCatalog {

    // Guarda os "modelos" (templates) dos heróis disponíveis
    private final List<Herois> catalogoCompra;

    public HeroesCatalog() {
        catalogoCompra = new ArrayList<>();

        // Heroes(String heroName, int hp, double strength, double speed, double defence, double price, double inteligence)

        catalogoCompra.add(new Herois("Thor", 300, 70, 35, 40, 90, 45));
        catalogoCompra.add(new Herois("Motoqueiro-Fantasma", 250, 50, 25, 45, 110, 35));
        catalogoCompra.add(new Herois("Homem de Gelo", 180, 40, 50, 20, 40, 90));
        catalogoCompra.add(new Herois("Wolverine Mustang", 250, 40, 38, 50, 70, 65));
        catalogoCompra.add(new Herois("Ciclope Militar", 150, 20, 35, 35, 90, 95));
        catalogoCompra.add(new Herois ("Hulk Cinza", 300, 80, 20.5, 70, 120, 15));
        catalogoCompra.add(new Herois("Velocista Escarlate", 190, 45, 100, 40, 75, 80));
        catalogoCompra.add(new Herois("Fenix Negra", 350 , 100, 80, 80 , 300 ,55)); // Fenix Negra
        catalogoCompra.add(new Herois("Soul Storm", 130 , 40, 28, 90 , 50,70)); // Soul Storm
        catalogoCompra.add(new Herois ("Cavaleiro Negro", 180 , 45, 55, 50 , 80,55)); // Pantera Negra

    }

    public int tamanhoCatalogo() {
        return catalogoCompra.size();
    }

    // Mostra um herói do catálogo (apenas leitura)
    public Herois verHeroi(int index) {
        return catalogoCompra.get(index);
    }

    // Esse é o mais importante: cria uma NOVA instância (não compartilha objeto)
    public Herois criarHeroi(int index) {
        Herois base = catalogoCompra.get(index);
        return new Herois(
                base.getHeroName(),
                base.getHp(),
                base.getStrength(),
                base.getSpeed(),
                base.getDefence(),
                base.getPrice(),
                base.getInteligence()
        );
    }
}
