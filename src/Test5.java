import java.util.Scanner;

/**
 * Created by dell on 2018/6/5.
 */
public class Test5 {
    public static void main(String[] args){
        int num=0;
        int result=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("input a number:");
        num=scanner.nextInt();
        result=(int)((num*10+5)/2+3.14159);
        System.out.println("加密后的结果是："+result);
    }
}
