import clients.Client;
import proxy.ProxyCache;
import proxy.SecuredProxy;
import services.IService;
import services.ServiceImpl;

public class Test {

    public static void main(String[] args) {

        System.out.println("------------Simple Test without Proxy----------- ");
        IService service = new ServiceImpl();
        Client client = new Client();
        client.setService(service);
        System.out.println("RES= "+client.perform(23));
        System.out.println("RES= "+client.perform(23));
        System.out.println("RES= "+client.perform(23));

        System.out.println("------------Cache Proxy Test----------- ");
        IService proxyCache = new ProxyCache();
        client.setService(proxyCache);
        System.out.println("RES= "+client.perform(20));
        System.out.println("RES= "+client.perform(20));
        System.out.println("RES= "+client.perform(20));


        System.out.println("------------Cache and Secured Proxy Test (Valid Password )----------- ");
        SecuredProxy securedProxy = new SecuredProxy();
        securedProxy.setPassword("1234");
        securedProxy.setService(proxyCache);
        client.setService(securedProxy);
        System.out.println("RES= "+client.perform(20));
        System.out.println("RES= "+client.perform(20));

        System.out.println("------------Cache and Secured Proxy Test (Wrong Password )----------- ");
        securedProxy.setPassword("123");
        securedProxy.setService(proxyCache);
        client.setService(securedProxy);
        System.out.println("RES= "+client.perform(20));
        System.out.println("RES= "+client.perform(20));

    }
}
