package characters;

public class Elf extends Hero {

    public Elf() {
        super(10,10);
    }

    @Override
    public void kick(Hero c) {
        if (this.getPower() > c.getPower() ) {
            c.setHp(0);
        }
        else {
            c.setHp(c.getHp() - 1 );
        }
    }
}
