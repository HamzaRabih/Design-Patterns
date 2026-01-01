package ma.rabih.enset.iibdcc.adapter;

import ma.rabih.enset.iibdcc.Computer.TV;
import ma.rabih.enset.iibdcc.Computer.VGA;

public class HdmiVgaAdapterH extends TV implements VGA {

    @Override
    public void print(String message) {
        byte[] bytes=message.getBytes();
        super.view(bytes);
    }

}
