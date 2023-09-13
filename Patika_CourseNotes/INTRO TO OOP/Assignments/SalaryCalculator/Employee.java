package Assignments.SalaryCalculator;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        return this.salary >= 1000 ? this.salary * 0.03 : 0;
    }

    public int bonus() {
        return 40 < this.workHours ? (this.workHours - 40) * 30 : 0;
    }

    public double raiseSalary() {
        int currentYear = 2023;
        int process = currentYear - hireYear;

        if (process < 10)
            return this.salary * 0.05;
        else if (currentYear > 9 && currentYear < 20)
            return this.salary * 0.10;
        else if (process > 19)
            return this.salary * 0.15;
        else
            return 0;

    }

    public String toString() {
        return "Name: " + this.name +
                "\nSalary: " + this.salary +
                "\nWork Hours: " + this.workHours +
                "\nHire Year: " + this.hireYear +
                "\nRaise Salary: " + this.raiseSalary() +
                "\nSalary with tax and bonus: " + (this.salary - this.tax() + this.bonus()) +
                "\nTotal Salary: " + (this.salary - this.tax() + this.bonus() + this.raiseSalary());
    }
}
