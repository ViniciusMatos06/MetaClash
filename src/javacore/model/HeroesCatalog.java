package javacore.model;

import java.util.ArrayList;
import java.util.List;

public class HeroesCatalog {

    // Guarda os "modelos" (templates) dos heróis disponíveis
    private final List<Heroes> catalogoCompra;

    public HeroesCatalog() {
        catalogoCompra = new ArrayList<>();

        // Heroes(String heroName, int hp, double strength, double speed, double defence, double price, double inteligence)

        catalogoCompra.add(new Heroes("Thor", 300, 70, 35, 40, 90, 45));
        catalogoCompra.add(new Heroes("Homem-Aranha", 180, 40, 50, 20, 40, 90));
        catalogoCompra.add(new Heroes("Wolverine", 250, 40, 38, 50, 70, 65));
        catalogoCompra.add(new Heroes("Ciclope", 150, 20, 35, 35, 90, 95));
        catalogoCompra.add(new Heroes("Hulk", 300, 80, 20.5, 70, 120, 15));
        catalogoCompra.add(new Heroes("Capitão América", 190, 45, 50, 55, 60, 75));
        catalogoCompra.add(new Heroes("Tocha Humana", 160, 30, 40, 60, 70, 45));
        catalogoCompra.add(new Heroes("Fenix Negra", 350 , 100, 80, 80 , 300 ,55)); // Fenix Negra
        catalogoCompra.add(new Heroes("Soul Storm", 130 , 40, 28, 90 , 50,70)); // Soul Storm
        catalogoCompra.add(new Heroes("Pantera Negra", 180 , 45, 55, 50 , 80,55)); // Pantera Negra

    }

    public int tamanhoCatalogo() {
        return catalogoCompra.size();
    }

    // Mostra um herói do catálogo (apenas leitura)
    public Heroes verHeroi(int index) {
        return catalogoCompra.get(index);
    }

    // Esse é o mais importante: cria uma NOVA instância (não compartilha objeto)
    public Heroes criarHeroi(int index) {
        Heroes base = catalogoCompra.get(index);
        return new Heroes(
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
