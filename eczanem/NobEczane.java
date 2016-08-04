package com.example.serife.eczanem;

public class NobEczane {

    public String Namenob;

    public String Addressnob;

    public String Semtnob;


    public NobEczane(String namenob, String addressnob, String semtnob) {

        Semtnob = semtnob;

        Namenob = namenob;

        Addressnob = addressnob;
    }

    public String getNamenob()

    {
        return  Namenob;
    }
    public String getAddressnob()

    {
        return Addressnob;
    }
    public String getSemtnob(){return Semtnob;}
}
