package pattern.flyweight;

/**
 * @ClassName Test
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/3/5 20:58
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {

        String[] departments = {"QA", "BD", "RD", "SL"};

        for (int i = 0; i < 20; i++) {

            Manager manager = ManagerFactory.getManager(departments[(int)(Math.random()*departments.length)]);
            manager.report();
        }
    }
}
