package services;

public class ServiceImpl implements IService {
    @Override
    public double compute(int t) {
        System.out.println("Computing............");
        return Math.cos(t * Math.PI / 180)*Math.sqrt(t*t);
    }
}
