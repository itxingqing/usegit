package pattern.decorator.v1;

/**
 * @ClassName Pancakes
 * @Description 煎饼
 * @Author 邢庆
 * @Date 2021/2/27 18:05
 * @Version 1.0
 **/
public class Pancakes {

    protected String getDesc() {
        return "普通煎饼";
    }
    protected int cost() {
        return 8;
    }
}
