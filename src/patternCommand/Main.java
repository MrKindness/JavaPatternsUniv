package patternCommand;

import patternCommand.command.DividerCommand;
import patternCommand.command.ICommand;
import patternCommand.command.MultiplicatorCommand;
import patternCommand.command.SubtractorCommand;
import patternCommand.command.SummatorCommand;
import patternCommand.receivers.Divider;
import patternCommand.receivers.Multiplicator;
import patternCommand.receivers.Subtractor;
import patternCommand.receivers.Summator;
import patternCommand.state.State;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        State state = State.getInstance();
        Character commandChar = ' ';
        Scanner commandScan = new Scanner(System.in);
        ICommand command = null;

        while (!commandChar.equals('e')) {
            System.out.println(state.getState());

            commandChar = commandScan.nextLine().charAt(0);

            switch (commandChar) {
                case '+':
                    command = new SummatorCommand(new Summator(), State.getInstance());
                    break;
                case '-':
                    command = new SubtractorCommand(new Subtractor(), State.getInstance());
                    break;
                case '*':
                    command = new MultiplicatorCommand(new Multiplicator(), State.getInstance());
                    break;
                case '/':
                    command = new DividerCommand(new Divider(), State.getInstance());
                    break;
                case 'u':
                    state.undoCommand();
                    break;
            }
            if (command != null) {
                state.setCommand(command);
                state.doCommand();
                command = null;
            }
        }
    }
}
