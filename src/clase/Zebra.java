package clase;

public class Zebra extends Animal {

    public Zebra(String nume) {
        super(nume);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void mananca(String mancare) {
        // TODO Auto-generated method stub
        System.out.print("Zebra "+this.getNume()+ " mananca "+ mancare);
    }

}
}
