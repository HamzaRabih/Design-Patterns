package clients;

import services.IService;

public class Client {

    private IService service;

    public double perform(int t) {
        return service.compute(t);
    }

    public void setService(IService service) {
        this.service = service;
    }
}
