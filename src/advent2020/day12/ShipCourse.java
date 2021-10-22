package advent2020.day12;

import utils.adventTasks.AocTask;
import utils.adventTasks.StageNumber;

import java.util.Scanner;
import java.util.stream.Stream;

public class ShipCourse {

    public final int INITIAL_LATITUDE = 0;
    public final int INITIAL_LONGITUDE = 0;
    public final int INITIAL_DELTA_LATITUDE = 1;
    public final int INITIAL_DELTA_LONGITUDE = 10;

    protected int latitude = INITIAL_LATITUDE; // +N -S
    protected int longitude = INITIAL_LONGITUDE; // +E -W

    protected int delta_latitude;
    protected int delta_longitude;

    protected int heading = 90;


//    private ShipCourse() {
//    }



    public static ShipCourse parseAndCalculate(Stream<String> commandStream) {
        ShipCourse self = new ShipCourse();

        commandStream.forEachOrdered(self::singleMoveStage2);

        return self;
    }


    protected void singleMove(String move) {
        char type = move.charAt(0);
        int val = Integer.parseInt(move.substring(1));

        validateCommand(type, val);


        switch (type) {
            case 'N' -> latitude += val;
            case 'S' -> latitude -= val;
            case 'E' -> longitude += val;
            case 'W' -> longitude -= val;
            case 'R' -> {
                heading += val;
                heading %= 360;
            }
            case 'L' -> {
                heading -= val;
                // that was the important line!
                heading = heading < 0 ? heading + 360 : heading;
                heading %= 360;
            }
            case 'F' -> moveForward(val);
            default -> throw new IllegalArgumentException("Unknown command!");
        }

    }

    void singleMoveStage2(String move) {
        char type = move.charAt(0);
        int val = Integer.parseInt(move.substring(1));

        // TODO check args

        switch (type) {
            case 'N' -> delta_latitude += val;
            case 'S' -> delta_latitude -= val;
            case 'E' -> delta_longitude += val;
            case 'W' -> delta_longitude -= val;
            case 'R', 'L' -> rotateWaypoint(type, val);
            case 'F' -> moveForwardToWaypoint(val);
            default -> throw new IllegalArgumentException("Unknown command!");
        }
    }

    void rotateWaypoint(char type, int val) {
            switch (val) {
                case 0 -> {}
                case 90 -> {
                    if (type == 'R') {
                        delta_latitude *= -1;
                    } else if (type == 'L') {
                        delta_longitude *= -1;
                    }
                }
                case 180 -> {
                    delta_latitude *= -1;
                    delta_longitude *= -1;
                }
                case 270 -> {
                    if (type == 'L') {
                        delta_latitude *= -1;
                    } else if (type == 'R') {
                        delta_longitude *= -1;
                    }
                }
            }
    }


    void moveForwardToWaypoint(int val) {
        int d_lat = delta_latitude * val;
        int d_lon = delta_longitude * val;

        delta_latitude += d_lat;
        delta_longitude += d_lon;

        latitude += d_lat;
        longitude += d_lon;
    }


    protected void validateCommand(char type, int val) {
        if (val < 0) {
            throw new IllegalArgumentException("Value cannot be negative!");
        }

        if (type == 'R' || type == 'L') {
            if (val % 90 != 0 || val < 0 || val > 360) {
                throw new IllegalArgumentException("Moving to the left or right can be done only for 90 * n azimutes!");
            }
        }
    }

    private void moveForward(int val) {
        switch (this.heading) {
            case 0 -> latitude += val;
            case 90 -> longitude += val;
            case 180 -> latitude -= val;
            case 270 -> longitude -= val;
        }
    }

    public int getManhattanDistance() {
        return Math.abs(INITIAL_LATITUDE - latitude) + Math.abs(INITIAL_LONGITUDE - longitude);
    }


    @Override
    public String toString() {
        return "ShipCourse{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", heading=" + heading +
                '}';
    }

    public int getINITIAL_LATITUDE() {
        return INITIAL_LATITUDE;
    }

    public int getINITIAL_LONGITUDE() {
        return INITIAL_LONGITUDE;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public int getHeading() {
        return heading;
    }

}




class ShipCourseRunner {
    public static void main(String[] args) {
        ShipCourse shipCourse = ShipCourse.parseAndCalculate(
                new Scanner(System.in)
                        .useDelimiter("\n")
                        .tokens()
        );

        System.out.println(shipCourse.toString());
        System.out.println("stageOne = " + shipCourse.getManhattanDistance());
    }
}