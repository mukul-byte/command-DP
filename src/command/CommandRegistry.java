package command;

import exceptions.InvalidCommandException;

import java.util.ArrayList;
import java.util.List;

public class CommandRegistry {
    List<Command> commands = new ArrayList<>();

    public void register(Command command){
        this.commands.add(command);
    }

    public void execute(String input){
        List<String> tokens = List.of(input.split(" "));
        String inputCommand = tokens.get(0);

        for(Command command: commands){
            if(command.matches(inputCommand)){
                command.execute(tokens);
                return;
            }
        }
        throw new InvalidCommandException();
    }
}
