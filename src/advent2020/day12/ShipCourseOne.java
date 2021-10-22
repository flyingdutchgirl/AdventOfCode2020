package advent2020.day12;

import utils.adventTasks.AocTask;
import utils.adventTasks.StageNumber;

import java.util.Optional;
import java.util.stream.Stream;

public class ShipCourseOne extends AocTask {

    public ShipCourseOne() {
        super(StageNumber.One, 12);
        setStageAnswer(Optional.of(1032L));
    }

    @Override
    public long calculateAnswer(Stream<String> stringStream) {
        return ShipCourse.parseAndCalculate(stringStream).getManhattanDistance();
    }
}
