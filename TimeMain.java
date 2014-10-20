package Module2.Thread.Time;


import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Time tm = new Time();
        Thread time = new Thread(tm);

        System.out.println("Для прерывания введите \'Y\'");

        time.start();

        String e = scan.nextLine();
        if (e.equals("Y") || e.equals("y")) {
            time.interrupt();
        }
    }
}
