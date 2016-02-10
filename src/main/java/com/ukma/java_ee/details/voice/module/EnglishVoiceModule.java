package com.ukma.java_ee.details.voice.module;

import org.springframework.stereotype.Component;

/**
 * Created by user on 06.02.2016.
 */

@Component("voice_module")
public class EnglishVoiceModule implements VoiceModule{

    public void sayHello() {
        System.out.println("Hello!");
    }
}
