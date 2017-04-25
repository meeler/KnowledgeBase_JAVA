package enums.demo;

/**
 * Created by Auser on 2017/4/25.
 */
public class Test {
    public static void main(String[] args) {
        int i = 0 ;
        EnumDemo [] enumDemos = EnumDemo.values();
        for (EnumDemo enumDemo : enumDemos) {
            System.out.println(enumDemo);
        }
        System.out.println(EnumDemo.NOTSTARTED.toString());
        EnumDemo enumDemo1 = EnumDemo.valueOf(EnumDemo.class, "END");
        System.out.println(enumDemo1.getStatusName());
        EnumDemo enumDemo = EnumDemo.getEnumStatusCode(99);
        System.out.println(enumDemo.getStatusName());
    }
}
