import javax.naming.Name;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner name  = new Scanner(System.in);
        System.out.println("Nhập tên của bạn vào đây : ");
        String yourName = name.nextLine();
        System.out.println("Tên của bạn mới nhập vào là : " + yourName);


    }
}