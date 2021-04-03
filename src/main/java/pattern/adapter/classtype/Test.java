package pattern.adapter.classtype;

/**
 * @ClassName Test
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/3/2 19:13
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        Adapter adapter = new EnglishTranslateAdapter();
        adapter.translate();
    }
}
