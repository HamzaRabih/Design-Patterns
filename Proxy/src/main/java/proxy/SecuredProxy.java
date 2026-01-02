package proxy;

import services.IService;

public class SecuredProxy implements IService {

    private IService service;
    private String password;

    @Override
    public double compute(int t) {
        if (password == "1234") {
            return service.compute(t);
        }else {
            throw new RuntimeException("not authorized");
        }
    }

    public void setService(IService service) {
        this.service = service;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
