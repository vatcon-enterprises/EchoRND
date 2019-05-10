package com.vatcon.echornd;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.SkillStreamHandler;

public class HelloWorldStreamHandler extends SkillStreamHandler {
	private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                       new CancelandStopIntentHandler(),
                       new HelloWorldIntentHandler(),
                       new HelpIntentHandler(),
                       new LaunchRequestHandler(),
                       new SessionEndedRequestHandler())
                .build();
    }

    public HelloWorldStreamHandler() {
        super(getSkill());
    }
}
