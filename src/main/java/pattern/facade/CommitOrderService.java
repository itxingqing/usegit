package pattern.facade;

/**
 * @ClassName CommitOrderService
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/2/27 8:20
 * @Version 1.0
 **/
public class CommitOrderService {

    String generateOrderInfo(PhoneCommodity phoneCommodity) {
        System.out.println("生成商品" + phoneCommodity.getName() + "的订单，编号是ORD000001");
        return "ORD000001";
    }
}
