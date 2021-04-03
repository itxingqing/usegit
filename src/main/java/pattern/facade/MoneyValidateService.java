package pattern.facade;

/**
 * @ClassName MoneyValidateService
 * @Description 银行余额校验
 * @Author 邢庆
 * @Date 2021/2/27 8:17
 * @Version 1.0
 **/
public class MoneyValidateService {

    boolean isEnoughOver(PhoneCommodity phoneCommodity) {

        if(true) {
            System.out.println("购买商品"+phoneCommodity.getName()+"的银行余额足够");
            return true;
        }
        return false;
    }
}
