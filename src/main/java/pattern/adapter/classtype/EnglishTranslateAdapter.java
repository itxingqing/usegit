package pattern.adapter.classtype;

/**
 * @ClassName EnglishTranslateAdapter
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/3/2 19:10
 * @Version 1.0
 **/
public class EnglishTranslateAdapter extends Adaptee implements Adapter {

    /**
     * 翻译
     */
    @Override
    public void translate() {
        // google translate engine
        String originSay = super.say();
        System.out.println(originSay + "翻译后，我喜欢中国");
    }
}
