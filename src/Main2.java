import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Mời nhập vào số tiền  muốn quy đổi: ");
        short number = numberInput.nextShort();
        System.out.println("số tiền quy đổi được bằng " + number * 23000 + " vnd");
    }
}
