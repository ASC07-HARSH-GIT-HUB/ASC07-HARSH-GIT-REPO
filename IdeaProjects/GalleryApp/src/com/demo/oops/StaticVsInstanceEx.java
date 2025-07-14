package com.demo.oops;

class StateVsInstanceEx {
    public static void main(String[] args) {
        Employee.companyName = "Amazing Company";
        String companyName = Employee.companyName;
        System.out.println(companyName);
        Employee employee1 = new Employee();
        employee1.employeeName = "Peter";
        System.out.println(employee1.employeeName);
        Employee employee2 = new Employee();
        employee2.employeeName = "Praveen";
        System.out.println(employee2.employeeName);
        System.out.println("The company " + companyName + " has employees " + employee1.employeeName + " and " + employee2.employeeName);
    }
}
class Employee {
    public static String companyName;
    public String employeeName;
}

