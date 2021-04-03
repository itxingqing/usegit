package pattern.decorator.v1;

/**
 * @ClassName PancakesWithEggAndSausage
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/2/27 18:08
 * @Version 1.0
 **/
public class PancakesWithEggAndSausage extends PancakesWithEgg {
    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一根肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
