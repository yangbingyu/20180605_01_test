import java.util.Scanner;

/**
 * Created by dell on 2018/6/5.
 */
public class Score {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("STB的成绩是：");
        int stb=sc.nextInt();
        System.out.println("Java的成绩是：");
        int java=sc.nextInt();
        System.out.println("SQL的成绩是：");
        int sql=sc.nextInt();
        System.out.println("---------------------");
        System.out.println("STB\t\tJava\t\tSQL");
        System.out.println(stb+"\t\t"+java+"\t\t\t"+sql);
        System.out.println("---------------------");
        System.out.println("Java和SQL的成绩差："+ Math.abs(sql-java));
        System.out.println("3门课的平均分是："+ (stb+java+sql)/3);
    }
}
