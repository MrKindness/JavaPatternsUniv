package patternCommand.state;

import patternCommand.command.ICommand;

import java.util.Scanner;
import java.util.Stack;

public class State {
    private static State instance = new State();
    private double state = 0;

    private Stack<ICommand> commands = new Stack<>();
    private Scanner argScan = new Scanner(System.in);
    private Double arg = 0.0;
    private ICommand activeCommand = null;

    private State() {
    }

    public static State getInstance() {
        return instance;
    }

    public void setState(double state) {
        this.state = state;
    }

    public double getState() {
        return state;
    }

    public void setCommand(ICommand command) {
        activeCommand = command;
    }

    public void doCommand() {
        if (activeCommand != null) {
            arg = argScan.nextDouble();
            activeCommand.execute(arg);
            commands.push(activeCommand);
            activeCommand = null;
        }
    }

    public void undoCommand() {
        if (!commands.isEmpty()) {
            activeCommand = commands.pop();
            activeCommand.undo();
            activeCommand = null;
        }
    }
}
