import java.util.Scanner;

/**
 * Created by dell on 2018/6/5.
 */
public class Test6 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入四位会员卡号：");
        int card=scanner.nextInt();
        int i=card/1000;
        int j=card%1000/100;
        int m=card%100/10;
        int n=card%10;
        int sum=i+j+m+n;
        System.out.println("会员卡号"+card+"各位之和："+sum);
        if(sum>20){
            System.out.println("是幸运客户吗？"+"true");
        }else{
            System.out.println("是幸运客户吗？"+"false");
        }

    }
}
