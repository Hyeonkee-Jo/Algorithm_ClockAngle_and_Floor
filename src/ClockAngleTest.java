import java.util.Scanner;

/**
 * Created by jo930_000 on 2016-10-07.
 */
public class ClockAngleTest {
    public static void main(String[] args) {
        ClockAngle test = new ClockAngle();
        Scanner scan = new Scanner(System.in);

        System.out.print("시를 입력해주세요 : ");
        test.hour_hand = scan.nextInt();
        if(test.hour_hand > 12) {
            System.out.println("잘못된 입력입니다.(시침은 12까지!!)");
        }
        else {
            System.out.print("분을 입력해주세요 : ");
            test.minute_hand = scan.nextInt();

            System.out.println("현재시간은 " + test.hour_hand + ":" + test.minute_hand);
            System.out.println(test.toString());
        }
    }
}