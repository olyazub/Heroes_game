package characters;

public class Hobbit extends Hero {
    public Hobbit() {
        super(0,3);
    }

    @Override
    public void kick(Hero c) {
        toCry();
    }

    public void toCry(){
        System.out.println("CryCryCry");
    }
}
