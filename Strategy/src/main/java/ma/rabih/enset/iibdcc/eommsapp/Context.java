package ma.rabih.enset.iibdcc.eommsapp;

public class Context {

    private Strategy strategy=new DefaultStrategyImpl();


    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void effectuerOperation() {
        System.out.println("***********");
        strategy.operationStrategy();
        System.out.println("===========");

    }
}
