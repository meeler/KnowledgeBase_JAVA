package lombok.demo;


/**
 * Created by Auser on 2017/4/21.
 */
public class Test {
    public static void main(String[] args) {
//        TestLombok testLombok = TestLombok.of("yw").setAge(24);
//        System.out.println(testLombok.toString());
        TestLombok jl = TestLombok.builder().age(10).name("jl").build();
        System.out.println(jl);
    }
}
