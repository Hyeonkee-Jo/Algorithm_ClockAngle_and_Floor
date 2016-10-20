/**
 * Created by jo930_000 on 2016-10-07.
 */

public class Floor {

    int perform_count;

    public int floor(double positive_integer) {
        perform_count = 0;
        int exp = -1;
        double k = 1;

        while (k <= positive_integer) {
            exp = exp + 1;
            k = k * 2;
            perform_count++;
        }

        return exp;
    }

    public int binaryfloor(double positive_integer) {
        perform_count = 0;
        int exp = 1;
        double k = 2;

        if (positive_integer < 2) {
            perform_count = 1;
            return 0;
        }
        else if( positive_integer == 2) {
            perform_count = 2;
            return 1;
        }
        else {
            while (k <= positive_integer) {
                exp = exp * 2;
                k = k * k;
                perform_count++;
            }

            // binary search
            int left = exp/2;
            int right = exp;
            int mid = (left+right)/2;
            double mid_number = 1;
            boolean flag = true;

            while(flag) {
                mid_number = 1;
                mid_number = Math.pow(2.0, mid);

                if(positive_integer < mid_number) {
                    right = mid;
                    mid = (left+right)/2;
                    perform_count++;
                }
                else if(positive_integer > mid_number){
                    left = mid;
                    mid = (left+right)/2;
                    perform_count++;
                }

                if((right-left) == 1) {
                    flag = false;
                }
            }
            return left;
        }
    }
}
