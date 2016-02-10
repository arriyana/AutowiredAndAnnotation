package com.ukma.java_ee.details.wheels;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by user on 06.02.2016.
 */
@Component("wheel")
@Scope("prototype")
public class MecanumWheel implements Wheel {

    public MecanumWheel() {
    }

    public void rotate() {
        System.out.println("Wheel " + this.hashCode() + " rotate");
    }
}
