package pattern.facade;

/**
 * @ClassName ShippingService
 * @Description 装货物流
 * @Author 邢庆
 * @Date 2021/2/27 8:23
 * @Version 1.0
 **/
public class ShippingService {

    String generateShippingNumber(PhoneCommodity phoneCommodity) {
        System.out.println("商品"+phoneCommodity.getName() + "已经产生物流订单号SHIP000001");
        return "SHIP000001";
    }
}
