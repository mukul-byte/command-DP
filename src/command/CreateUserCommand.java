package command;

import java.util.List;

public class CreateUserCommand implements Command{
    private final String commandName = "create_user";
    //save the user in user repository
    @Override
    public void execute(List<String> tokens) {
        System.out.println("Creating User with arguments " + tokens.subList(1, tokens.size()));
    }

    @Override
    public Boolean matches(String inputCommand) {
        return commandName.equals(inputCommand);
    }
}
