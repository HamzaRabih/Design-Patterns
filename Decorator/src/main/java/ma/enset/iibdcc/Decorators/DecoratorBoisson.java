package ma.enset.iibdcc.Decorators;

import ma.enset.iibdcc.Boissons.Boisson;

public abstract class DecoratorBoisson extends Boisson {

    protected Boisson boisson;

    public DecoratorBoisson(Boisson boisson) {
        this.boisson = boisson;
    }
}
