package com.madeeasy.week1.session2.assignment2;

import lombok.extern.slf4j.Slf4j;

/**
 * The type Employee.
 */
@Slf4j
public class Employee {

    protected int id;
    /**
     * Error occurred during compilation as :
     * Type mismatch: cannot convert from double to int
     * |-------> Required type is int
     * |-------> Found type is double
     * To solve this error, we have to cast the value to int
     */
    protected int age = (int) 35.5;

    String name;

    protected boolean isPermanent;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        log.info("Successfully started");
    }
}
/** o/p
 * 18:56:31.746 [main] INFO com.madeeasy.week1.session2.assignment2.Employee -- Successfully started
 */