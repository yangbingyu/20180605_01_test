/**
 * Created by dell on 2018/6/5.
 */
public class Test4 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 2;
        int a = num1 % num2;//a=1
        int b = num1 / num2;//a=2
        System.out.println(num1 + " % " + num2 + "= " + a);
        System.out.println(num1 + " / " + num2 + " = " + b);
        num1++;
        num2--;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
