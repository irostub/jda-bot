package org.kawai.config;

import org.jetbrains.annotations.NotNull;
import org.kawai.command.CommandHolder;
import org.kawai.command.ImageCommand;
import org.kawai.command.ReactionCommand;
import org.kawai.command.RpsCommand;

import java.util.Arrays;
import java.util.List;

public class CommandConfig {

    public CommandConfig() {
        CommandHolder holder = CommandHolder.getInstance();
        List<Commandable> commandables = getCommandables();

        for (Commandable commandable : commandables) {
            holder.getCommandableMap()
                    .put(commandable.getCommandType(), commandable);
        }
    }

    @NotNull
    private static List<Commandable> getCommandables() {
        return Arrays.asList(
                new RpsCommand(),
                new ReactionCommand(),
                new ImageCommand()
        );
    }

}
