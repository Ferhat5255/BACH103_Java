package day28abstraction;

public class H_Accord implements Engine,Ac,Hood {

    @Override
    public void eco() {
        System.out.println("Uses eco engine");
    }

    @Override
    public void gas() {
        System.out.println("Use gas");
    }

    @Override
    public void tsi() {
        System.out.println("Uses tsi tecnology");
    }

    @Override
    public void djitale() {
        System.out.println("Uses djitale AC");
    }

    @Override
    public void climate() {
        System.out.println("Uses climate tecnology");

    }

    @Override
    public void steel() {
        System.out.println("Hood is made by steel");
    }
}
