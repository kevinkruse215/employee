package com.example.java.employeeClass;

public class employeeClass {

    private int employeeShift;
    private String employeeName;
    private int employeeNumber;

    public employeeClass(int employeeShift, String employeeName, int employeeNumber) {
        this.employeeShift = employeeShift;
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
    }


    public int getEmployeeShift() {
        return employeeShift;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }


    public void printAll() {
        System.out.println(employeeShift+ "\n" + employeeName +"\n"+employeeNumber);

    }
}
