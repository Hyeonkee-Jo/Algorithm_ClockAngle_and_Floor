import java.util.Scanner;

/**
 * Created by jo930_000 on 2016-10-07.
 */
public class FloorTest {
    public static void main(String[] args) {
        Floor test = new Floor();

        Scanner scan = new Scanner(System.in);
        System.out.print("logN의 N에 대입할 양의 정수를 입력하시오 : ");
        double positive_integer = scan.nextDouble();

        System.out.println("log" + positive_integer + "의 바닥함수는 " + test.floor(positive_integer)+",  수행횟수 : " + test.perform_count );
        System.out.println("binary search를 이용한 log" + positive_integer + "의 바닥함수는 " + test.binaryfloor(positive_integer)+",  수행횟수 : " + test.perform_count );
    }
}
