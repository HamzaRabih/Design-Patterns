import obs.ObservabelImpl;
import obs.Observer;

public class Test2 {

    public static void main(String[] args) {

        ObservabelImpl observabel = new ObservabelImpl();

        observabel.subscribe(new Observer() {
            @Override
            public void update(int state) {
                System.out.println(" ");
                System.out.println("**************************");
                System.out.println("Observer 1 ,price excluding tax: " + Double.valueOf(state - (state * 0.2)));
                System.out.println("**************************");
                System.out.println(" ");
            }
        });

        //Puisque l'interface Observer à une seule methode, on peut utiliser l'expression lambda
        observabel.subscribe((state) -> {
                    System.out.println(" ");
                    System.out.println("===========================");
                    System.out.println("Observer 2 , price including tax:: " + state);
                    System.out.println("===========================");
                    System.out.println(" ");

                }
        );

        observabel.setState(111);
        observabel.setState(250);

    }

}
