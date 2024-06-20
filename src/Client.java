import command.Command;
import command.CommandRegistry;
import command.CreateGameCommand;
import command.CreateUserCommand;
import exceptions.InvalidCommandException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        CommandRegistry commandRegistry = Client.getCommandRegistry();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            System.out.print("> ");
            try {
                String input = br.readLine().toString();
                commandRegistry.execute(input);
            } catch (InvalidCommandException e) {
                System.out.println("Command is invalid");
            } catch (IOException e) {
                System.out.println("ISE: System error");
            }
        }
    }

    private static CommandRegistry getCommandRegistry(){
        CommandRegistry registry = new CommandRegistry();
        Command createUser = new CreateUserCommand();
        Command createGame = new CreateGameCommand();
        registry.register(createUser);
        registry.register(createGame);
        return registry;
    }
}