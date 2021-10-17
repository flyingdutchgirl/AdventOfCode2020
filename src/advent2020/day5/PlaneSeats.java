package advent2020.day5;

import java.util.Scanner;

public class PlaneSeats {

    static int seatId(String location) {
        int min = 0;
        int max = 127;

        for (char ch: location.substring(0, 7).toCharArray()) {

            if (ch == 'F') { //lower half
                max -= (max - min) / 2 + 1;
            } else if (ch == 'B') { //upper half
                min += (max - min) / 2 + 1;
            }

//            System.out.println(min + " - " + max);
        }
        assert min == max;

        int row = min;
        min = 0;
        max = 7;

        for (char ch: location.substring(7).toCharArray()) {
            if (ch == 'L') { //lower half
                max -= (max - min) / 2 + 1;
            } else if (ch == 'R') {
                min += (max - min) / 2 + 1;
            }
//            System.out.println(min + " - " + max);
        }

        assert min == max;

        int column = min;

        return row * 8 + column;
    }

    public static void main(String[] args) {
//        var x = seatId("FBFBBFFRLR");
//        System.out.println(x);
//        stage1();
        stage2();
    }

    static void stage1() {
        var id = new Scanner(System.in)
                .useDelimiter("\n")
                .tokens()
                .mapToInt(PlaneSeats::seatId)
                .max()
                .orElseThrow();

        System.out.println(id);
    }

    static void stage2() {
        var seats = new Scanner(System.in)
                .useDelimiter("\n")
                .tokens()
                .mapToInt(PlaneSeats::seatId)
                .sorted()
                .toArray();

        for (int i = 0; i < seats.length - 1; i++) {
            if (seats[i] != seats[i+1] - 1) {
                System.out.println(seats[i] + ", " + seats[i+1]);
            }
        }

    }


}
