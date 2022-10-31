package Java40;


public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public void toString(){
        public void tax(int salary){
            if(this.salary<1000) System.out.println("vergi: 0");
            else System.out.println("vergi: " this.salary*0.03);
        }

        public void bonus(int workHours){
            if(this.workHours < 40) System.out.println("bonus: 0");
            else return System.out.println("bonus: " + (this.workHours - 40)*30);
        }
        public float raiseSalary(int hireYear){
            if(2021 - this.hireYear < 10) System.out.println("Maaş artışı: " + this.salary*0.05);
            else if(2021 - this.hireYear < 20) System.out.println("Maaş artışı: " + this.salary*0.1);
            else System.out.println("Maaş artışı: " + this.salary*0.15);       
        }
    }

}
