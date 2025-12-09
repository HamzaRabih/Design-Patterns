package obs;

public interface Observabel {

    //subscribe =addObserver
    void subscribe(Observer observer);

    //unSubscribe=removeObserver
    void unSubscribe(Observer observer);

    void notifyObservers();
}
