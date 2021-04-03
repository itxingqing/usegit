package pool;

/**
 * @ClassName Student
 * @Description TODO
 * @Author 邢庆
 * @Date 2021/3/27 8:09
 * @Version 1.0
 **/
public class Student {

    private String name;
    private int count;

    public Student(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
