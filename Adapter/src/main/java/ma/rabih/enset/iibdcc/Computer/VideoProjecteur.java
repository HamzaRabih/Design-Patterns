package ma.rabih.enset.iibdcc.Computer;

public class VideoProjecteur implements VGA {
    @Override
    public void print(String msg) {
        System.out.println("++++++++++++++Video Projecteur VGA+++++++++++++++");
        System.out.println(msg);
        System.out.println("++++++++++++++Video Projecteur VGA+++++++++++++++");
    }
}
