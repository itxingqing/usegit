package pattern.decorator.v1;

/**
 * @ClassName PancakesWithEgg
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/2/27 18:07
 * @Version 1.0
 **/
public class PancakesWithEgg extends Pancakes {

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
