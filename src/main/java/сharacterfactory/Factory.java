package сharacterfactory;

import characters.*;
import config.Config;

import java.lang.reflect.Constructor;
import java.util.HashMap;

public class Factory {

    public  HashMap<Integer, Class<? extends Hero>> hm;
    public  Factory() {
        hm = new HashMap<>();
        hm.put(1, Hobbit.class);
        hm.put(2, Elf.class);
        hm.put(3, King.class);
        hm.put(4, Knight.class);
    }


    public Hero CreateCharacter() throws IllegalAccessException, InstantiationException {
        int num = Config.r.nextInt(4) + 1;
//        System.out.println(num);
        Class<? extends Hero> aClass = hm.get(num);
        return aClass.newInstance();

    }

}
