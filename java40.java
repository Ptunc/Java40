package Java40;

public class java40 {
    public static void main(String[] args) {
        
        float tax, raiseSalary;
        int bonus;

        Employee person = new Employee("kemal", 2000, 45, 1985);

        System.out.println("adı: " + person.name);
        System.out.println("maaşı: " + person.salary);
        System.out.println("çalışma saati: " + person.workHours);
        System.out.println("Başlangıç yılı: " + person.hireYear);
        Employee.toString();
    }
}
