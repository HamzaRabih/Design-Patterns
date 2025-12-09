package obs;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
    private List<Double> history=new ArrayList<>();
    @Override
    public void update(int state) {
        System.out.println("***************ObserverImpl2**************");
        history.add(Double.valueOf(state));
        double sum=0;
        System.out.println("history price including tax:");
        for (Double d : history) {
            sum+=d;
            System.out.println(d);
        }
        System.out.println("Average price including tax (prix moyen TTC): " + sum/history.size()+" DH");
        System.out.println("***************ObserverImpl2**************");
    }

}
