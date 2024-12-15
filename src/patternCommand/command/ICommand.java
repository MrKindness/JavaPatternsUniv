package patternCommand.command;

public interface ICommand {
    void execute(double arg);
    void undo();
}
