package advent2020.day11;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;


class SeatsRunner {
    public static void main(String[] args) {
        Seats seats = new Seats();
        seats.parseAll(new Scanner(System.in).useDelimiter("\n").tokens());
//        System.out.println("stageOne = " + seats.findStableNumber());

        seats.test2();

    }
}


public class Seats {
    private PlaceState[][] places;


    public Seats() {
    }


    void printSeats() {
        for (PlaceState[] pl : this.places) {
            Arrays.stream(pl)
                    .map(PlaceState::getDesc)
                    .forEach(System.out::print);

            System.out.println();
        }
    }


    public void parseAll(Stream<String> stringStream) {
        this.places = stringStream
                .map(this::parseLine)
                .toArray(PlaceState[][]::new);
    }

    private PlaceState[] parseLine(String text) {
        return text.chars()
                .mapToObj(i -> switch ((char) i) {
                    case '.' -> PlaceState.FLOOR;
                    case 'L' -> PlaceState.EMPTY;
                    case '#' -> PlaceState.OCC;
                    default -> throw new IllegalArgumentException();
                })
                .toArray(PlaceState[]::new);

    }

    public long findStableNumber() {
        if (this.places == null) {
            throw new IllegalStateException("Use parseAll() method before!");
        }

        long last = -1L;
        long current = allOccupied();

        assert current >= 0;


        while (last != current) {
            last = current;
            current = singleCycle();
        }

        return current;
    }

    void test1() {
        for (int i = 0; i < 50; i++) {
            System.out.println(singleCycle());
        }
    }

    void test2() {
        for (int i = 0; i < 6; i++) {
            printSeats();
            System.out.println(singleCycle());
        }
    }


    private long allOccupied() {
        return Arrays.stream(places)
                .flatMap(Arrays::stream)
                .filter(p -> p == PlaceState.OCC)
                .count();
    }


    long singleCycle() {
        final PlaceState[][] copy = clonePlacesArr();

        for (int x = 0; x < copy.length; x++) {
            for (int y = 0; y < copy[x].length; y++) {
                int occupied = numberOfOccupAround(x, y);
                if (copy[x][y] == PlaceState.EMPTY && occupied == 0) {
                    places[x][y] = PlaceState.OCC;
                } else if (copy[x][y] == PlaceState.OCC && occupied >= 4) {
                    places[x][y] = PlaceState.EMPTY;
                }
            }
        }

        return allOccupied();
    }

    private PlaceState[][] clonePlacesArr() {
        PlaceState[][] newArr = new PlaceState[this.places.length][];

        for (int i = 0; i < this.places.length; i++) {
//            newArr[i] = Arrays.copyOf(this.places[i], this.places.length);
            newArr[i] = Arrays.stream(this.places[i]).sequential().toArray(PlaceState[]::new);
        }

        return newArr;
    }

    private int numberOfOccupAround(int x, int y) {
        final int[] xIdxs = {x - 1, x, x + 1};
        final int[] yIdxs = {y - 1, y, y + 1};

        int counter = 0;

        for (int ix : xIdxs) {
            for (int iy : yIdxs) {
                if (ix == x && iy == y) {
                    continue;
                }

                if (getPlace(ix, iy).map(p -> p == PlaceState.OCC).orElse(false)) {
                    counter++;
                }

            }
        }

        return counter;
    }

    private Optional<PlaceState> getPlace(int x, int y) {
        try {
            return Optional.of(this.places[x][y]);
        } catch (IndexOutOfBoundsException exc) {
            return Optional.empty();
        }
    }


}



enum PlaceState {
    FLOOR("."),
    OCC("#"),
    EMPTY("L");

    public final String desc;

    PlaceState(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}