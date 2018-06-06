import java.util.Scanner;

/**
 * Created by dell on 2018/6/5.
 */
public class Date {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int days=0;
        System.out.println("请输入年份");
        int year=scanner.nextInt();
        System.out.println("请输入月份");
        int month=scanner.nextInt();
        System.out.println("请输入日期");
        int day=scanner.nextInt();
        int feb=0;
        if ((year%4==0&&year%100!=0)||year%400==0) {
            feb=29;
        }else{
            feb=28;
        }
            switch (month) {
                case 12:
                    days += 30;
                case 11:
                    days += 31;
                case 10:
                    days += 30;
                case 9:
                    days += 31;
                case 8:
                    days += 31;
                case 7:
                    days += 30;
                case 6:
                    days += 31;
                case 5:
                    days += 30;
                case 4:
                    days += 31;
                case 3:
                    days += feb;
                case 2:
                    days += 31;
                case 1:
                    days += day;
                    System.out.println(days);
                    break;

            }
    }
}
