package com.springboot.DependencyInjection.controllers;

import com.springboot.DependencyInjection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropretyInjectedControllerTest {

    PropretyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropretyInjectedController();

        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}