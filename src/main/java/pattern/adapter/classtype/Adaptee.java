package pattern.adapter.classtype;

/**
 * @ClassName Adaptee
 * @Description 被适配对象
 * @Author 邢庆
 * @Date 2021/3/1 20:58
 * @Version 1.0
 **/
public class Adaptee {

    public String say() {
        System.out.println("我说了一句外国话，i like china");
        return "i like china";
    }
}
