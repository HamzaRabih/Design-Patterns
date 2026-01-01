package ma.rabih.enset.iibdcc;

import ma.rabih.enset.iibdcc.Computer.*;
import ma.rabih.enset.iibdcc.adapter.HdmiVgaAdapter;
import ma.rabih.enset.iibdcc.adapter.HdmiVgaAdapterH;

public class Test {
    public static void main(String[] args) {

        UniteCentrale uniteCentrale = new UniteCentrale();
        uniteCentrale.setVga(new Ecran());
        uniteCentrale.print("Bonjour");
        uniteCentrale.setVga(new VideoProjecteur());
        uniteCentrale.print("Bonjour");

        HdmiVgaAdapter hdmiAdapter = new HdmiVgaAdapter();
        hdmiAdapter.setHdmi(new TV());
        uniteCentrale.setVga(hdmiAdapter);
        uniteCentrale.print("Bonsoir");

        HdmiVgaAdapterH hdmiAdapterH = new HdmiVgaAdapterH();
        uniteCentrale.setVga(hdmiAdapterH);
        uniteCentrale.print("TEST");


        uniteCentrale.setVga(new SupperVP());
        uniteCentrale.print("SALAMO3ALAYKOM  ");

        HdmiVgaAdapter hdmiAdapter2 = new HdmiVgaAdapter();
        hdmiAdapter2.setHdmi(new SupperVP());
        uniteCentrale.setVga(hdmiAdapter2);
        uniteCentrale.print("SALAMO3ALAYKOM ");




    }
}