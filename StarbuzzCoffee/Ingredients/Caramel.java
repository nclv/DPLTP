package StarbuzzCoffee.Ingredients;

import StarbuzzCoffee.Boisson;
import StarbuzzCoffee.DecorateurIngredient;

public class Caramel extends DecorateurIngredient{
    Boisson boisson;

    public Caramel(Boisson boisson) {
        this.boisson = boisson;
    }

    public Boisson.Taille getTaille() {
        return boisson.getTaille();
    }

    public String getDescription() {
        return boisson.getDescription() + ", Caramel";
    }

    public double count() {
        double count = boisson.count();
        if (getTaille() == Boisson.Taille.PETIT) {
            count += 0.10;
        } else if (getTaille() == Boisson.Taille.MOYEN) {
            count += 0.15;
        } else if (getTaille() == Boisson.Taille.GRAND) {
            count += 0.20;
        }
        return count;
    }
}
