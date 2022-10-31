package Java40;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(double salary){
        if(this.salary<1000) return 0;
        else return this.salary*0.03;
    }

    double bonus(int workHours){
        if(this.workHours < 40) return 0;
        else return (this.workHours - 40)*30;
    }
    double raiseSalary(int hireYear){
        if(2021 - this.hireYear < 10) return this.salary*0.05;
        else if(2021 - this.hireYear < 20) return this.salary*0.1;
        else return this.salary*0.15;     
    }
    public String toString(){
        System.out.println("Vergi: " + this.tax(salary));
        System.out.println("Bonus: " + this.bonus(workHours));
        System.out.println("Maaş Artışı: " + this.raiseSalary(hireYear));
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + (this.tax(salary) + this.bonus(workHours) + this.salary));
        System.out.println("Toplam maaş: " + (this.tax(salary) + this.bonus(workHours) + this.raiseSalary(hireYear) + this.salary));
        return null;
    }

}
