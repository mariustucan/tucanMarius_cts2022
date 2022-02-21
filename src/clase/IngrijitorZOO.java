package clase;

public class IngrijitorZOO { //relatie HAS A animal
    private String nume;

    public IngrijitorZOO(String nume) {
        super();
        this.nume = nume;
    }

    public String getNume() {
        return nume;

    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void hranesteAnimal(Animal animal,String mancare) {
        animal.mananca(mancare);

    }
}
