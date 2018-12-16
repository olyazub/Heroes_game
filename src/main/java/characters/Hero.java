package characters;

import kickbehavior.Behaviour;
import lombok.*;


@Getter
@Setter
@ToString
public abstract class Hero {
    public int power;
    public int hp;
    public abstract void kick(Hero c);
    public Behaviour behaviour;
    public boolean isAlive(){
        return hp > 0;
    }
    public Hero(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }
    public void setHp(int h){
        this.hp = h;
        if (this.hp <0){
            this.hp = 0;
        }
    }

}
