package pattern.decorator.v2;

/**
 * @ClassName Pancake
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/2/27 18:15
 * @Version 1.0
 **/
public class Pancake extends AbstrackPancake {
    @Override
    protected String desc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
