package command;

import java.util.List;

public interface Command {
    public void execute(List<String> tokens);
    public Boolean matches(String inputCommand);
}
