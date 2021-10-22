package advent2020.day5;

import utils.adventTasks.AocTask;
import utils.adventTasks.StageNumber;

import java.util.Optional;
import java.util.stream.Stream;

public class PlaneSeatsOne extends AocTask {


    public PlaneSeatsOne() {
        super(StageNumber.One, 5);
        setStageAnswer(Optional.of(953L));
    }

    @Override
    public long calculateAnswer(Stream<String> stringStream) {
        return stringStream.mapToInt(PlaneSeats::seatId)
                .max()
                .orElseThrow();
    }



    protected static int seatId(String location) {
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


}
