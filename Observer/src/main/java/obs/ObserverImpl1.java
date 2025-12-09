package obs;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl1 implements Observer {
    List<Double> history = new ArrayList<>();
    @Override
    public void update(int state) {
        System.out.println("===============ObserverImpl1==============");
        history.add(Double.valueOf(state-(state*0.20)));
        double sum=0;
        System.out.println("history price excluding tax:");
        for (Double d : history) {
            sum+=d;
            System.out.println(d);
        }
        System.out.println("Average price excluding tax (prix moyen HT): " + sum/history.size()+" DH");
        System.out.println("===============ObserverImpl1==============");
    }
}
