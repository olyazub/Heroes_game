package characters;


import kickbehavior.RandomBehaviour;

import static config.Config.r;

public class SwordsMan extends Hero {
    public SwordsMan(int min, int max) {
        super(r.nextInt(max-min+1)+min,r.nextInt(max-min+1)+min);
        setBehaviour(new RandomBehaviour());
    }

    public void kick(Hero c) {
        c.setHp(c.getPower() - r.nextInt(this.getPower()) );
    }

}
