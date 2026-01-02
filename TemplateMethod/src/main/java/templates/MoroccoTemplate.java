package templates;

public class MoroccoTemplate extends Template {
    @Override
    protected int param1() {
        return 3;
    }
    @Override
    protected double compute(int a, int b) {
        return Math.sqrt(a * a + b * b);
    }
}
