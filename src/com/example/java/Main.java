package com.example.java;

import com.example.java.employeeClass.employeeClass;

public class Main {

    public static void main(String[] args) {

        employeeClass worker1 = new employeeClass(2, "Steve Worker", 145);
        employeeClass worker2 = new employeeClass(3, "Paul Worker", 274);

        worker1.printAll();
        System.out.println("\n");
        worker2.printAll();

    }
}
