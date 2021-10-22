package advent2020.day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JumpingCode {

    public static void main(String[] args) {
        var lines = new Scanner(System.in)
                .useDelimiter("\n")
                .tokens()
                .collect(Collectors.toList());
        var cmds = parseCommands(lines);
        var res = executeCommands(cmds).val;

        System.out.println("stageOne = " + res);

        var stageTwo = stage2(cmds).orElseThrow();
        System.out.println("stageTwo = " + stageTwo);

    }

    static Optional<Integer> stage2(List<Command> cmds) {
        for (int i = 0; i < cmds.size(); i++) {
            Command cmd = cmds.get(i);
            CommandType preType = cmd.type;
            if (preType == CommandType.JMP) {
                cmd.type = CommandType.NOP;
            } else if (preType == CommandType.NOP) {
                cmd.type = CommandType.JMP;
            }

            var info = executeCommands(cmds);

            cmd.type = preType;

            if (info.state == TerminationState.TERMINATING) {
                return Optional.of(info.val);
            }

//            System.out.println(info.state);
            cmds.forEach(c -> c.visited = false);
        }

        return Optional.empty();
    }

    static List<Command> parseCommands(List<String> lines) {
        List<Command> commands = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            String[] tokens = line.split("\\s+");
            CommandType type = switch (tokens[0].trim()) {
                case "acc" -> CommandType.ACC;
                case "jmp" -> CommandType.JMP;
                case "nop" -> CommandType.NOP;
                default -> throw new IllegalStateException("Unexpected value: " + tokens[0].trim());
            };
            int val = Integer.parseInt(tokens[1].trim());

            Command cmd = new Command(type, val, i);
            commands.add(cmd);
        }

//        commands.stream().map(Command::toString).forEachOrdered(System.out::println);

        return commands;
    }

    static TerminationInfo executeCommands(List<Command> commands) {
        int acc = 0;
        int pos = 0;

        Command current = commands.get(pos);

        while (!current.visited) {

            switch (current.type) {
                case NOP -> {pos++;}
                case ACC -> {
                    acc += current.value;
                    pos++;
                }
                case JMP -> pos += current.value;
            }

            current.visited = true;

            if (pos >= commands.size() || pos < 0) {
                return new TerminationInfo(acc, TerminationState.TERMINATING); // the program ends without looping
            }

//            try {
                current = commands.get(pos);
//            } catch (IndexOutOfBoundsException exc) {
//                return Optional.empty();
//            }
//            System.out.println("acc = " + acc);
        }

        return new TerminationInfo(acc, TerminationState.LOOPING); // program starts looping infinitely at the given position
    }

}



class Command {
    CommandType type;
    final int value;
    final int pos;
    boolean visited = false;

    Command(CommandType type, int value, int pos) {
        this.type = type;
        this.value = value;
        this.pos = pos;
    }

    @Override
    public String toString() {
        return "Command{" +
                "type=" + type +
                ", value=" + value +
                ", pos=" + pos +
                ", visited=" + visited +
                '}';
    }
}


enum CommandType {
    NOP, ACC, JMP
}

enum TerminationState {
    LOOPING, TERMINATING
}

class TerminationInfo {
    final int val;
    final TerminationState state;

    public TerminationInfo(int val, TerminationState state) {
        this.val = val;
        this.state = state;
    }
}