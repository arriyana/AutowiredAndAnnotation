package com.ukma.java_ee;

import com.ukma.java_ee.details.memory.cards.MemoryCard;
import com.ukma.java_ee.details.voice.module.VoiceModule;
import com.ukma.java_ee.details.wheels.Wheel;
import com.ukma.java_ee.locations.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by user on 06.02.2016.
 */

@Component
public class Robot {


    @Autowired
    private VoiceModule voiceModule;

    @Autowired
    @Qualifier("memory_card64")
    private MemoryCard memoryCard;

    @Autowired
    private Wheel left, right;

    public Robot() {
    }

    public VoiceModule getVoiceModule() {
        return voiceModule;
    }

    public void setVoiceModule(VoiceModule voiceModule) {
        this.voiceModule = voiceModule;
    }

    public MemoryCard getMemoryCard() {
        return memoryCard;
    }

    public void setMemoryCard(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    public Wheel getLeft() {
        return left;
    }

    public void setLeft(Wheel left) {
        this.left = left;
    }

    public Wheel getRight() {
        return right;
    }

    public void setRight(Wheel right) {
        this.right = right;
    }

    public void talk(){
        if(voiceModule!=null)
            voiceModule.sayHello();
    }

    public void go(){
        if(left!=null&&right!=null){
            System.out.println("Robot drive");
            left.rotate();
            right.rotate();
        }
    }

    @Autowired(required=false)
    public void goTo(Location location){
        if(left!=null&&right!=null){
            if(location!=null){
                System.out.println("Robot go to " + location.getName());
                left.rotate();
                right.rotate();
            }
            else
                System.out.println("Robot doesn't go anywhere");
        }
    }


    public void remember(String word){
        if(memoryCard!=null)
            memoryCard.writeToCard(word);
    }

}
