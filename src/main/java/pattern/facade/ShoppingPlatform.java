package pattern.facade;

import org.springframework.util.StringUtils;

/**
 * @ClassName ShoppingPlatform
 * @Description 购物平台
 * @Author 邢庆
 * @Date 2021/2/27 8:26
 * @Version 1.0
 **/
public class ShoppingPlatform {

    private CommitOrderService commitOrderService = new CommitOrderService();
    private MoneyValidateService moneyValidateService = new MoneyValidateService();
    private ShippingService shippingService = new ShippingService();

    public String buyPhoneCommodity(PhoneCommodity phoneCommodity) {
        String orderNumber = commitOrderService.generateOrderInfo(phoneCommodity);
        if(!StringUtils.isEmpty(orderNumber)) {
            boolean enoughOver = moneyValidateService.isEnoughOver(phoneCommodity);
            if(enoughOver) {
                // 有足够的余额，产生物流信息
                String shipNumber = shippingService.generateShippingNumber(phoneCommodity);
                return "订单号：" + orderNumber + "物流编号为：" + shipNumber;
            }
        }
        return null;
    }
}
