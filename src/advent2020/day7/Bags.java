package advent2020.day7;

import java.util.*;
import java.util.stream.Collectors;

public class Bags {


    public static void main(String[] args) {
        parse();
        Bag.bagMap.clear();
        parseStageTwo();
    }


    static void parse() {
        final var bags = BagsConsts.FULL_RULES
                .replaceAll("\\.", "")
                .replaceAll("bags", "bag")
                .lines()
                .map(l -> l.split(" contain "))
                .sequential()
                .map(arr -> {
                    String name = arr[0].trim();
                    var bag = Bag.getInstance(name);
                    if (arr[1].contains("no other")) {
                        return bag;
                    }
                    Arrays.stream(arr[1].split(","))
                            .map(s -> s.replaceAll("\\d+", ""))
                            .map(String::trim)
                            .forEachOrdered(n -> bag.canContain.add(Bag.getInstance(n)));


                    return bag;
                })
                .collect(Collectors.toList());


        var res = Bag.bagMap
                .entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .filter(bag -> Bag.possibleContent(bag).contains(Bag.getInstance("shiny gold bag")))
                .map(bag -> bag.name)
//                .peek(System.out::println)
                .count();


//        System.out.println("----");
//        Bag.possibleContent(Bag.getInstance("dark orange bag"))
//                .stream()
//                .map(Bag::getName)
//                .distinct()
//                .forEachOrdered(System.out::println);

        System.out.println("stageOne = " + res);
    }



    static void parseStageTwo() {
        final var bags = BagsConsts.FULL_RULES
                .replaceAll("\\.", "")
                .replaceAll("bags", "bag")
                .lines()
                .map(l -> l.split(" contain "))
                .sequential()
                .map(arr -> {
                    String name = arr[0].trim();
                    var bag = Bag.getInstance(name);
                    if (arr[1].contains("no other")) {
                        return bag;
                    }

                    for (String s1 : arr[1].split(",")) {
                        String s = s1.trim();
                        var item = s.split("\\s+", 2);
                        int times = Integer.parseInt(item[0]);
                        String name1 = item[1].trim();
                        Bag bag1 = Bag.getInstance(name1);
                        for (int i = 0; i < times; i++) {
                            bag.canContain.add(bag1);
                        }
                    }

                    return bag;
                })
                .collect(Collectors.toList());



        // answer of stage 2!
        int size = Bag.possibleContent(Bag.getInstance("shiny gold bag")).size();
        System.out.println("stageTwo = " + size);

    }

}


class Bag {
    static Map<String, Bag> bagMap = new HashMap<>();

    List<Bag> canContain;
    String name;

    Bag(String name) {
        this.name = name;
        canContain = new ArrayList<>();
    }

    static Bag getInstance(String name) {
        return bagMap.computeIfAbsent(name, Bag::new);
    }

    @Override
    public String toString() {
        return "Bag{" +
                "canContain=" + Arrays.deepToString(canContain.toArray(Bag[]::new)) + // just for debug
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    static List<Bag> possibleContent(Bag bigBag) {
        var list = bigBag.canContain;
        List<Bag> newList = new ArrayList<>();

        if (list.isEmpty()) {
            return List.of();
        }

        for (Bag bag : list) {
            newList.addAll(possibleContent(bag));
        }

        newList.addAll(list);

        return newList;
    }

//        return list.stream()
//                .map(b -> List.of(List.of(b), Bag.possibleContent(b))
//                .flatMap(Collection::stream)
//                .collect(Collectors.toList());
}

//}


