package kickbehavior;
import characters.Hero;

public class OrdinaryBehaviour implements Behaviour {

    public void kick(Hero main, Hero enemy) {
        enemy.setHp(enemy.getHp() - main.getPower());
    }
}
