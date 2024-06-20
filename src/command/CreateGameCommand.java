package command;

import java.util.List;

public class CreateGameCommand implements Command{
    private final String commandName = "create_game";
    @Override
    public void execute(List<String> tokens) {
        System.out.println("Creating Game....");
    }

    @Override
    public Boolean matches(String inputCommand) {
        return commandName.equals(inputCommand);
    }
}
