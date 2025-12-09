package ma.enset.iibdcc.Decorators;


import ma.enset.iibdcc.Boissons.Boisson;

public class Chocolat extends DecoratorBoisson {

    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    public String getDescription() {
        return boisson.getDescription()+" Au Chocolat";
    }

    public Double getPrice() {
        return boisson.getPrice()+2.00;
    }

}
