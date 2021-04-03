package pattern.decorator.v2;

/**
 * @ClassName AbstrackDecorate
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/2/27 18:16
 * @Version 1.0
 **/
public class AbstrackDecorate extends AbstrackPancake{

    private AbstrackPancake abstrackPancake;

    public AbstrackDecorate(AbstrackPancake abstrackPancake) {
        this.abstrackPancake = abstrackPancake;
    }

    @Override
    protected String desc() {
        return this.abstrackPancake.desc();
    }

    @Override
    protected int cost() {
        return this.abstrackPancake.cost();
    }
}
