package pattern.single;


import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ContainerSingleton
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/2/25 19:47
 * @Version 1.0
 **/
public class ContainerSingleton {

    private static Map<String, Object> containers = new HashMap<>();

    private ContainerSingleton() {}

    public static void putInstance(String key, Object obj) {
        if(!StringUtils.isEmpty(key) && obj != null) {
            if(!containers.containsKey(key)) {
                containers.put(key, obj);
            }
        }
    }
    public static Object getInstance(String key) {
        return containers.get(key);
    }
}
