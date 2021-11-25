package EdyodaPractice.Collections;

import java.util.*;

 public class Employee implements Comparable<Employee>
{
    Integer empId;
    Float salary;
    Date dob;
    Date dateOfJoining;
    String name;


    public Employee() {
    }

    public Employee(int empId, float salary, Date dob, Date dateOfJoining, String name) {
        this.empId = empId;
        this.salary = salary;
        this.dob = dob;
        this.dateOfJoining = dateOfJoining;
        this.name = name;

    }
    public Integer getEmpId() {
        return empId;
    }

    public Float getSalary() {
        return salary;
    }

    public Date getDob() {
        return dob;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public String getName() {
        return name;
    }

    public void printDateofjoin()
    {
        System.out.println("Dateofjoin:"+dateOfJoining);
    }
    public void printNamesAndDateofjoining()
    {
        System.out.println("dateofjoin:"+dateOfJoining+",name:"+name);
    }
    public void printsalnameanddat4eofjoin(){
        System.out.println("sal:"+salary +",dateofjoin:"+dateOfJoining +",name:"+name);
    }


    class Department
    {
        String deptName;
        Date deptDate;

        public Department(String deptName, Date deptDate) {
            this.deptName = deptName;
            this.deptDate = deptDate;
        }

        public String getDeptName() {
            return deptName;
        }

        public Date getDeptDate() {
            return deptDate;
        }

    }


    public String toString()
    {
        return "\nID="+empId+",salary="+salary+",DOB="+dob+",dateOfJoining="+dateOfJoining+",Name="+name;
    }
    public int compareTo(Employee o)
    {

        return this.empId.compareTo(o.empId)+(this.salary.compareTo(o.salary))+(this.dob.compareTo(o.dob))
                +(this.dateOfJoining.compareTo(o.dateOfJoining))+(this.name.compareTo(o.name));
    }

//sort based on date of joining
    public static void main(String[] args) {
        Employee e1 = new Employee(1, 15000, new Date(23 - 6 - 1996), new Date(22 - 8 - 2021), "Shinchan");
        Employee e2 = new Employee(2, 25000, new Date(23 - 5 - 97), new Date(23 - 9 - 21), "Doramon");
        Employee e3 = new Employee(3, 35000, new Date(24 - 4 - 96), new Date(24 - 12 - 21), "Tom");
        Employee e4 = new Employee(4, 12000, new Date(25 - 3 - 95), new Date(25 - 10 - 21), "Jerry");
        List<Employee> l = new ArrayList<Employee>();
        l.add(e1);
        l.add(e2);
        l.add(e3);
        l.add(e4);
        Collections.sort(l);
        System.out.println(l);
        System.out.println("===========");
        System.out.println(e1.compareTo(e2));
        System.out.println(e2.compareTo(e3));

    }
}



