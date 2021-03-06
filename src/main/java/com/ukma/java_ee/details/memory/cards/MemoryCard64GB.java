package com.ukma.java_ee.details.memory.cards;

import org.springframework.stereotype.Component;

import java.util.Stack;

/**
 * Created by user on 06.02.2016.
 */
@Component("memory_card64")
public class MemoryCard64GB implements MemoryCard {

    private Stack<String> memory;
    private static final int SIZE = 64;

    public MemoryCard64GB() throws Exception{
        this.memory = (Stack<String>)Stack.class.newInstance();
        this.memory.setSize(SIZE);
    }

    public void writeToCard(String word) {
        this.memory.add(word);
    }

    public String readFromCard() {
        return this.memory.pop();
    }
}
