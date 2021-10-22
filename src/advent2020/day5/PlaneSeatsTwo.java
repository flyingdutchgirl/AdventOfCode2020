package advent2020.day5;

import utils.adventTasks.StageNumber;

import java.util.Optional;
import java.util.stream.Stream;

public class PlaneSeatsTwo extends PlaneSeatsOne {

    public PlaneSeatsTwo() {
        super();
        setStageNumber(StageNumber.Two);
        setStageAnswer(Optional.of(615L));
    }

    @Override
    public long calculateAnswer(Stream<String> stringStream) {
        var seats = stringStream
                .mapToInt(PlaneSeats::seatId)
                .sorted()
                .toArray();

        for (int i = 0; i < seats.length - 1; i++) {
            if (seats[i] != seats[i + 1] - 1) {
                return seats[i] + 1;
            }
        }

        throw new IllegalArgumentException();
    }
}
