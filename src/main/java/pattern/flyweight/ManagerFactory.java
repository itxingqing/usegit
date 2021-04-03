package pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ManagerFactory
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/3/5 20:55
 * @Version 1.0
 **/
public class ManagerFactory {

    private static final Map<String, Employee> employees = new HashMap<>();

    public static Manager getManager(String department) {

        Manager manager = (Manager) employees.get(department);
        if(manager == null) {

            manager = new Manager(department);
            String content = "我完成了kpi";
            manager.setContent(content);
            System.out.println("工厂创建了部门：" + department + " 经理的报告内容是：" + content);
            employees.put(department, manager);
        }
        return manager;
    }
}
