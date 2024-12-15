package patternCommand.command;

import patternCommand.receivers.Subtractor;
import patternCommand.state.State;

public class SubtractorCommand implements ICommand {
    Subtractor subtractor;
    State state;
    double prevState;

    public SubtractorCommand(Subtractor subtractor, State state) {
        this.subtractor = subtractor;
        this.state = state;
    }

    @Override
    public void execute(double arg) {
        prevState = state.getState();
        state.setState(subtractor.subtract(state.getState(), arg));
    }

    @Override
    public void undo() {
        state.setState(prevState);
    }
}
