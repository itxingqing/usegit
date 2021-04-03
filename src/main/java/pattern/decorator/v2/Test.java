package pattern.decorator.v2;

/**
 * @ClassName Test
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/2/27 18:24
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {

        AbstrackPancake pancage = new Pancake();
        pancage = new EggDecorate(pancage);
        pancage = new EggDecorate(pancage);
        pancage = new SausageDecorate(pancage);
        System.out.println(pancage.desc() + "价格：" + pancage.cost());
    }
}
