package ma.rabih.enset.iibdcc.Computer;

public class UniteCentrale {

    private VGA vga;

    public void print(String message) {
        vga.print(message);
    }

    public void setVga(VGA vga) {
        this.vga = vga;
    }
}
