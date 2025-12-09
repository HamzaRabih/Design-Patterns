package ma.enset.iibdcc.Decorators;

import ma.enset.iibdcc.Boissons.Boisson;

public class Noisette  extends DecoratorBoisson {

    public Noisette(Boisson boisson) {
        super(boisson);
    }

    public String getDescription() {
        return boisson.getDescription()+" Au Noisette";
    }

    public Double getPrice() {
        return boisson.getPrice()+2.50;
    }
}
