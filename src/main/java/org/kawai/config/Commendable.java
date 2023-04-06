package org.kawai.config;

import net.dv8tion.jda.api.entities.MessageChannel;
import org.kawai.commend.CommendType;

public interface Commendable {
    //    행위의 틀
    void doCommend(MessageChannel channel, String userMessage);

    CommendType getCommendType();
}
