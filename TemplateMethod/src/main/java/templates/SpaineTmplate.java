package templates;

public class SpaineTmplate extends Template {
    @Override
    protected int param1() {
        return 9;
    }

    @Override
    protected double compute(int a, int b) {
        return a * b;
    }
}
