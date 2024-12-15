package patternCommand.command;

import patternCommand.receivers.Divider;
import patternCommand.state.State;

public class DividerCommand implements ICommand {
    Divider divider;
    State state;
    double prevState;

    public DividerCommand(Divider divider, State state) {
        this.divider = divider;
        this.state = state;
    }

    @Override
    public void execute(double arg) {
        if (arg != 0) {
            prevState = state.getState();
            state.setState(divider.divide(state.getState(), arg));
        } else
            System.out.println("division by zero!");
    }

    @Override
    public void undo() {
        state.setState(prevState);
    }
}
