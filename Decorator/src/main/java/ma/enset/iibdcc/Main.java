package ma.enset.iibdcc;

import ma.enset.iibdcc.Boissons.CafeLate;
import ma.enset.iibdcc.Decorators.Caramel;
import ma.enset.iibdcc.Decorators.Chocolat;

public class Main {
    public static void main(String[] args) {
        Chocolat chocoCafeLate=new Chocolat((new CafeLate()));
        System.out.println(chocoCafeLate.getDescription() + " " + chocoCafeLate.getPrice()+" DH");
        System.out.println("****************************");
        Caramel caramelChocoCafeLate=new Caramel(chocoCafeLate);
        System.out.println(caramelChocoCafeLate.getDescription() + " " + caramelChocoCafeLate.getPrice()+" DH");
    }
}