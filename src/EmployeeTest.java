import java.io.*;
public class EmployeeTest{

    public static void main(String[] args){
        //使用构造器构建两个对象
        Employee empOne = new Employee("Staff1");
        Employee empTwo = new Employee("Staff2");

        //调用这两个对象的成员方法
        empOne.empAge(26);
        empOne.empDesignation("高级程序员");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("菜鸟程序员");
        empTwo.empSalary(5000);
        empTwo.printEmployee();
    }
}