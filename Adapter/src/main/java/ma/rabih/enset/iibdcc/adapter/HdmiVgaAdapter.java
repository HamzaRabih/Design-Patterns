package ma.rabih.enset.iibdcc.adapter;

import ma.rabih.enset.iibdcc.Computer.HDMI;
import ma.rabih.enset.iibdcc.Computer.VGA;

public class HdmiVgaAdapter implements VGA {

    private HDMI hdmi;

    @Override
    public void print(String message) {
        byte[] bytes=message.getBytes();
        hdmi.view(bytes);
    }

    public void setHdmi(HDMI hdmi) {
        this.hdmi = hdmi;
    }
}
