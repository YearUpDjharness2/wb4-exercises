package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {


    @Test
    public void accelerate_should_increaseCarSpeed() {
        //arrange
        Car car = new Car("Jeep", "CJ-7");
        int speedUpBy = 15;
        int slowDownBy = 15;
        int expectedSpeed = 5;
        car.accelerate(speedUpBy);


        //act
        car.brake(slowDownBy);


        // assert
        int actualSpeed = car.getSpeed();
        assertEquals(expectedSpeed);

    }

    @Test
    public void brake_should_stopCar_whenChangeIsGreater() {
        //arrange
        Car car = new Car("Jeep", "CJ-7");
        int speedUpBy = 15;
        int slowDownBy = 15;
        int expectedSpeed = 5;
        car.accelerate(speedUpBy);


        //act
        car.brake(slowDownBy);


        // assert
        int actualSpeed = car.getSpeed();
        assertEquals(expectedSpeed, actualSpeed);
    }
}