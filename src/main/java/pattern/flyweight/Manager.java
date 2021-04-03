package pattern.flyweight;

/**
 * @ClassName Manager
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/3/5 20:53
 * @Version 1.0
 **/
public class Manager implements Employee {

    private String department;
    private String content;

    public Manager(String department) {
        this.department = department;
    }

    @Override
    public void report() {
        System.out.println("部门:" + department + " 开始作报告，内容是:" + content);
    }

    public void setContent(String content) {
        this.content = content;
    }
}
