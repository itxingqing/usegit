package pattern.prototype;

import pattern.single.HungrySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName Prototype
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/2/26 19:37
 * @Version 1.0
 **/
public class Prototype {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        HungrySingleton hungrySingleton = HungrySingleton.getInstance();

        Method method = HungrySingleton.class.getDeclaredMethod("clone");
        method.setAccessible(true);
        HungrySingleton cloneHungrySingleton = (HungrySingleton) method.invoke(hungrySingleton);
        System.out.println(hungrySingleton);
        System.out.println(cloneHungrySingleton);
    }
}
