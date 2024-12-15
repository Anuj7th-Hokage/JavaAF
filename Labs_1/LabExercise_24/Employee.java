package Labs_1.LabExercise_24;import java.util.Set;class Employee implements Comparable<Employee> {    int id;    String name;    double salary;    Set<String> skills;    public Employee(int id, String name, double salary, Set<String> skills) {        this.id = id;        this.name = name;        this.salary = salary;        this.skills = skills;    }    @Override    public String toString() {        return "Employee{" +                "id=" + id +                ", name='" + name + '\'' +                ", salary=" + salary +                ", skills=" + skills +                '}';    }    @Override    public int compareTo(Employee o) {        return Integer.compare(this.id, o.id);    }}