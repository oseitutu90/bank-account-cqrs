package com.techBank.cqrs.core.infastructure;

import com.techBank.cqrs.core.commands.BaseCommand;
import com.techBank.cqrs.core.commands.CommandHandlerMethod;

public interface CommandDispatcher {
    <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandlerMethod<T> handler);
    void send(BaseCommand command);
}
