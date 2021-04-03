package pattern.decorator.v2;

/**
 * @ClassName SausageDecorate
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/2/27 18:23
 * @Version 1.0
 **/
public class SausageDecorate extends AbstrackDecorate {
    public SausageDecorate(AbstrackPancake abstrackPancake) {
        super(abstrackPancake);
    }

    @Override
    protected String desc() {
        return super.desc() + " 加一根肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
