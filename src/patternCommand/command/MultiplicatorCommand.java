package patternCommand.command;

import patternCommand.receivers.Multiplicator;
import patternCommand.state.State;

public class MultiplicatorCommand implements ICommand {
    Multiplicator multiplicator;
    State state;
    double prevState;

    public MultiplicatorCommand(Multiplicator multiplicator, State state) {
        this.multiplicator = multiplicator;
        this.state = state;
    }

    @Override
    public void execute(double arg) {
        prevState = state.getState();
        state.setState(multiplicator.multiply(state.getState(), arg));
    }

    @Override
    public void undo() {
        state.setState(prevState);
    }
}
