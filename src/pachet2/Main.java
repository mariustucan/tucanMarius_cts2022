package pachet2;

import clase.Girafa;
import clase.IngrijitorZOO;
import clase.ZOO;
import clase.Zebra;

public class Main {

    public static void main (String[] args){
        //todo auto gen method stub

        IngrijitorZOO ingrijitor = new IngrijitorZOO("mARIUS");
        Zebra z1 = new Zebra("elena");
        Zebra z2 = new Zebra("CIMPI");

        Girafa g1 = new Girafa("zaraza");
        Girafa g2 = new Girafa("pacli");

        ZOO zoo = new ZOO("Bucuresti ZOO ", ingrijitor);
        zoo.adaugaAnimal(z1);
        zoo.adaugaAnimal(z2);
        zoo.adaugaAnimal(g1);
        zoo.adaugaAnimal(g2);

        zoo.hranesteAnimale("capsuni cu frisca");

    }

}
