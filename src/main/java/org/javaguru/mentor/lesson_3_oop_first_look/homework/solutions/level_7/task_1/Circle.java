package org.javaguru.mentor.lesson_3_oop_first_look.homework.solutions.level_7.task_1;

class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

}