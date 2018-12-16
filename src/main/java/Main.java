import characters.Hero;
import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;
import config.Config;
import characters.*;
import javafx.scene.effect.Reflection;
import org.reflections.Reflections;

import java.util.Set;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        System.out.println("Hello");
//        Reflections reflections = new Reflections("characters");
//        Set<Class<? extends Hero>> subTypes = reflections.getSubTypesOf(Hero.class);
//        System.out.println(subTypes);
        Hero c1 = Config.f.CreateCharacter();
        Hero c2 = Config.f.CreateCharacter();
        System.out.println("The heroes for this round are:");
        System.out.printf("%s: power %d, hp %d\n",  c1.getClass().getName(), c1.getPower(), c1.getHp());

        System.out.printf("%s: power %d, hp %d\n",  c2.getClass().getName(), c2.getPower(), c2.getHp());

        System.out.println("LET'S FIGHT!!");
        int counter = 1;
        while (c1.isAlive() && c2.isAlive()){
            System.out.printf("Fighting round %d\n", counter);
            c1.kick(c2);
            c2.kick(c1);
            System.out.println("results:");
            System.out.printf("%s: power %d, hp %d\n",  c1.getClass().getName(), c1.getPower(), c1.getHp());
            System.out.printf("%s: power %d, hp %d\n\n",  c2.getClass().getName(), c2.getPower(), c2.getHp());

            counter++;
            if (counter > 1000) {
                System.out.println("The fight exhausted both heroes, and they died");
                c1.setHp(0);
                c2.setHp(0);
            }
        }
        if (c1.isAlive() && !c2.isAlive()){
            System.out.printf("%s won!",c1.getClass().getName());
        }
        else if (!c1.isAlive() && c2.isAlive()){
            System.out.printf("%s won!",c2.getClass().getName());
        }
        else {
            System.out.println("Draw!");
        }
        System.out.println();
        System.out.println("Thanks for playing!");

    }
}
