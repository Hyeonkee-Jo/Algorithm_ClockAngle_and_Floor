/**
 * Created by jo930_000 on 2016-10-07.
 */

public class ClockAngle {

    int hour_hand;
    int minute_hand;

    public double calculateHourAngle(int hour_hand, int minute_hand) {
        double angle;
        if(hour_hand > 12) hour_hand = hour_hand - 12;

        angle = (hour_hand*30) + (((double)minute_hand)/2);
        return angle;
    }

    public double calculateMinuteAngle(int minute_hand) {
        double angle;
        angle = minute_hand*6;
        return angle;
    }

    public double calculateTotalAngle(double angle_one, double angle_two) {
        double angle;
        if(angle_one > angle_two) angle = angle_one - angle_two;
        else angle = angle_two - angle_one;

        if(angle > 180) angle = 360 - angle;

        return angle;
    }

    public String toString() {
        return "Clock Angle = " + this.calculateTotalAngle(this.calculateHourAngle(this.hour_hand, this.minute_hand), this.calculateMinuteAngle(this.minute_hand))+" degree";
    }

}
