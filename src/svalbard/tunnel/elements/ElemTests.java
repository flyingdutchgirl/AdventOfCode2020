//package svalbard.tunnel.elements;
//
//import svalbard.tunnel.ParsingException;
//
//import java.util.Objects;
//import java.util.function.BiFunction;
//import java.util.function.Function;
//
//public class ElemTests {
//
//    Factory fact;
//
//    public static void main(String[] args) {
//        BiFunction<String, String, String> sum = (a, b) -> String.format("(%s + %s)", a, b);
//        BiFunction<String, String, String> prod = (a, b) -> String.format("(%s * %s)", a, b);
//        Function<String, String> neg = a -> {
//            return switch (a) {
//                case "X" -> "Y";
//                case "Y" -> "X";
//                default -> "err";
//            };
//        };
//        String neutr = "X";
//
//        Factory<String> fact = new Factory<String>(sum, prod, neg, neutr);
//
//        var xyy = fact.prodOf(
//                fact.sumOf(fact.neutral(), fact.negOf(fact.neutral())),
//                fact.negOf(fact.neutral())
//        );
//
//
//        System.out.println(xyy.getValue());
//
//    }
//
//
//    public <T> Elem<T> parse(String text) {
//        Objects.requireNonNull(text);
//
//        if (text.length() == 1) {
//            if ("".equals(text)) {
//                return fact.neutral();
//            } else {
//                throw new ParsingException();
//            }
//        }
//
//        if (countChars(text, '+') == 1) {
//            var elems = text.split("\\+");
//            return fact.sumOf(parse(elems[0]), parse(elems[1]));
//        }
//
//        if (countChars(text, '*') == 1) {
//            var elems = text.split("\\+");
//            return fact.prodOf(parse(elems[0]), parse(elems[1]));
//        }
//
//        if (text.charAt(0) == '!') {
//            return fact.negOf(parse(text.substring(1)));
//        }
//
//        StringBuilder sb = new StringBuilder();
//        if (text.charAt(0) == '[') {
//            int i = 1;
//            while (i < text.length() && text.charAt(i) != ']') {
//                sb.append(text.charAt(i++));
//            }
//            return parse(sb.toString());
//        } else if (text.charAt(0) == '(') {
//            int i = 1;
//            while (i < text.length() && text.charAt(i) != ')') {
//                sb.append(text.charAt(i++));
//            }
//            return parse(sb.toString());
//        }
//    }
//
//
//    public static int countChars(String str, char ch) {
//        return (int) str.chars()
//                .filter(i -> i == ch)
//                .count();
//    }
//
//
//}
