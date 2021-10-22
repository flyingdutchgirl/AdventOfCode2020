package advent2020.day17;

import java.util.*;
import java.util.stream.Collectors;

public class PowerGrid {

//    List<Point3D> points = new ArrayList<>();
    int cycle = 0;
    Map<int[], Point> point3DMap = new HashMap<>();


    public static void main(String[] args) {
        System.out.println("stageOne = " + stage1());
    }

    Point getPoint(int[] arr) {
        if (point3DMap.containsKey(arr)) {
            return point3DMap.get(arr);
        }

        var newPoint = new Point(arr);
        point3DMap.put(arr, newPoint);

        return newPoint;
    }

    static long stage1() {
        PowerGrid grid = new PowerGrid();
        final int NUMBER_OF_CYCLES = 4;

        Scanner sc = new Scanner(System.in);
        var lines = sc.useDelimiter("\n")
                .tokens()
                .collect(Collectors.toList());

        grid.parse(lines);

        for (int i = 0; i < NUMBER_OF_CYCLES; i++) {
            grid.doCycle();
        }

        return grid.point3DMap
                .values()
                .stream()
                .filter(Point::isActive)
                .count();
    }

    void parse(List<String> lines) {
        for (int i = 0; i < lines.size(); i++) {
            char[] lineChars = lines.get(i).toCharArray();
            for (int k = 0; k < lineChars.length; k++) {
                int[] pos = {i, k, 0};
                int finalI = i;
                int finalK = k;
//                Point point3D = point3DMap.computeIfAbsent(pos, ign -> new Point(finalI, finalK, 0));

                Point point3D = getPoint(new int[]{i,k,0});

                if(lineChars[k] == '#') {
                    point3D.isActive = true;
                } else if (lineChars[k] == '.') {
                    point3D.isActive = false;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }

    void doCycle() {
        cycle++;
        var pointsCopy = new HashSet<>(this.point3DMap.values());

        for (Point point : pointsCopy) {
            var surrounding = surroundingPoints(point);
            assert surrounding.size() == 26;

            var activity = surrounding.stream()
                    .collect(Collectors.partitioningBy(p1 -> p1.isActive));

            int neighbAct = activity.get(true).size();

            if (point.isActive) {
                if (neighbAct != 2 && neighbAct != 3) {
                    point.isActive = false;
                }
            } else {
                if (neighbAct == 3) {
                    point.isActive = true;
                }
            }

        }
    }


    List<Point> surroundingPoints(Point point) {
        return surroundingPos(point.positionArr)
                .stream()
//                .map(arr -> this.point3DMap.computeIfAbsent(arr, Point::new))
                .map(arr -> getPoint(arr))
                .collect(Collectors.toList());
    }

    static List<int[]> surroundingPos(int[] arr) {
        return surroundingPos(arr[0], arr[1], arr[2]);
    }

    static List<int[]> surroundingPos(int x, int y, int z) {
        final int[] surr = {-1, 0, 1};
        List<int[]> points = new ArrayList<>();

        for (int a : surr) {
            for (int b : surr) {
                for (int c : surr) {
                    int[] point = {x + a, y + b, z + c};
                    if (!(a == 0 && b == 0 && c == 0)) {
                        points.add(point);
                    }
                }
            }
        }

        return points;
    }


//    public static void main(String[] args) {
//        var test1 = surroundingPoints(10, 10, 10);
//        test1
//                .stream()
//                .map(Arrays::toString)
//                .forEachOrdered(System.out::println);
//
//        System.out.println("size = " + test1.size());
//    }


}


class Point {
    final int[] positionArr;

    boolean isActive = false;

    public Point(int x, int y, int z) {
        positionArr = new int[]{x,y,z};
    }

    public Point(int[] positionArr) {
        this.positionArr = positionArr;
    }

    @Override
    public String toString() {
        return Arrays.toString(positionArr);
    }

    public int getX() {
        return positionArr[0];
    }

    public int getY() {
        return positionArr[1];
    }

    public int getZ() {
        return positionArr[2];
    }

    public boolean isActive() {
        return isActive;
    }
}