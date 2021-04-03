package pattern.decorator.v1;

/**
 * @ClassName Test
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/2/27 18:09
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {

        Pancakes pancakes = new Pancakes();
        System.out.println(pancakes.getDesc() + " 花费: " + pancakes.cost() + " 元");
        Pancakes pancakesWighEgg = new PancakesWithEgg();
        System.out.println(pancakesWighEgg.getDesc() + " 花费: " + pancakesWighEgg.cost() + " 元");
        Pancakes pancakesWighEggAndSausage = new PancakesWithEggAndSausage();
        System.out.println(pancakesWighEggAndSausage.getDesc() + " 花费: " + pancakesWighEggAndSausage.cost() + " 元");

    }
}
