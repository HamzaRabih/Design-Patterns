package ma.enset.iibdcc.Decorators;

import ma.enset.iibdcc.Boissons.Boisson;

public class Caramel extends DecoratorBoisson {

    public Caramel(Boisson boisson) {
        super(boisson);
    }

    public String getDescription() {
        return boisson.getDescription()+" Au Caramel";
    }

    public Double getPrice() {
        return boisson.getPrice()+1.50;
    }

}
