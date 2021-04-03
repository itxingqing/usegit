package pattern.decorator.v2;

/**
 * @ClassName EggDecorate
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/2/27 18:21
 * @Version 1.0
 **/
public class EggDecorate extends AbstrackDecorate {

    public EggDecorate(AbstrackPancake abstrackPancake) {
        super(abstrackPancake);
    }

    @Override
    protected String desc() {
        return super.desc() + " 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
