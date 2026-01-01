package ma.rabih.enset.iibdcc.Computer;

public class Ecran implements VGA {

    @Override
    public void print(String msg) {
        System.out.println("++++++++++++Ecran VGA++++++++++++++");
        System.out.println(msg);
        System.out.println("++++++++++++Ecran VGA++++++++++++++");
    }
}
