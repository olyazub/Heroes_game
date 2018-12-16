package kickbehavior;
import characters.Hero;

public class GodBehaviour implements Behaviour {
    public void kick(Hero main, Hero enemy) {
        enemy.setHp(0);
    }
}
