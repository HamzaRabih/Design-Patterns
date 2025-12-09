import obs.*;

import java.util.Observable;

public class Test {
    public static void main(String[] args) {
        ObservabelImpl observable = new ObservabelImpl();
        Observer obs1=new ObserverImpl1();
        Observer obs2=new ObserverImpl2();

        observable.subscribe(obs1);
        observable.subscribe(obs2);
        System.out.println("---------------------------------------------------------------------------------");
        observable.setState(120);
        System.out.println("---------------------------------------------------------------------------------");
        observable.setState(125);
        System.out.println("---------------------------------------------------------------------------------");
        observable.setState(190);
    }
}
