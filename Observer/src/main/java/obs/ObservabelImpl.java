package obs;

import java.util.ArrayList;
import java.util.List;

public class ObservabelImpl implements Observabel {

    private int state;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(state));
    }

    public void setState(int state) {
        this.state = state;
        System.out.println("new price including tax 20%  / nouveau prix TTC (TVA 20%) / (New state): " + state+" DH");
        System.out.println("price excluding tax: "+ Double.valueOf(state-(state*0.20))+" DH");
        notifyObservers();
    }

    public int getState() {
        return state;
    }
}
