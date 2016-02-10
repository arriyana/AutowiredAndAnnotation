package com.ukma.java_ee.details.memory.cards;

import java.util.Stack;

/**
 * Created by user on 06.02.2016.
 */
public interface MemoryCard {

    public void writeToCard(String word);

    public String readFromCard();
}
