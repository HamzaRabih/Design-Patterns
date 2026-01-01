package ma.rabih.enset.iibdcc.Computer;

public class SupperVP implements VGA, HDMI {


    @Override
    public void view(byte[] data) {
        System.out.println("___________SupperVP HDMI ___________");
        String message=new String(data);
        System.out.println(message);
        System.out.println("___________SupperVP HDMI ___________");
    }

    @Override
    public void print(String msg) {
        System.out.println("___________SupperVP VGA___________");
        System.out.println(msg);
        System.out.println("___________SupperVP VGA___________");
    }
}
