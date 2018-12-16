package kickbehavior;

import characters.Hero;
import config.Config;

public class RandomBehaviour implements Behaviour {

    public void kick(Hero main, Hero enemy) {
        enemy.setHp(Config.r.nextInt(main.getPower() + 1));
    }
}
