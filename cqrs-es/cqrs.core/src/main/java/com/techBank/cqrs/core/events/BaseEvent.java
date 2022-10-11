package com.techBank.cqrs.core.events;

import com.techBank.cqrs.core.messages.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public abstract class BaseEvent extends Message {
    private int version;

}
