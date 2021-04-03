package pattern.facade;

/**
 * @ClassName Test
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/2/27 8:33
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        
        PhoneCommodity phoneCommodity = new PhoneCommodity("IPHONE5");
        ShoppingPlatform shoppingPlatform = new ShoppingPlatform();
        String shipNumber = shoppingPlatform.buyPhoneCommodity(phoneCommodity);
        System.out.println("你的物流信息为" + shipNumber);
    }
}
