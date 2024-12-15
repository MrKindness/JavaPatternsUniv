package patternCommand.command;

import patternCommand.receivers.Summator;
import patternCommand.state.State;

public class SummatorCommand implements ICommand {
    Summator summator;
    State state;
    double prevState;

    public SummatorCommand(Summator summator, State state) {
        this.summator = summator;
        this.state = state;
    }

    @Override
    public void execute(double arg) {
        prevState = state.getState();
        state.setState(summator.summ(state.getState(), arg));
    }

    @Override
    public void undo() {
        state.setState(prevState);
    }
}
