
import java.util.*;

class Member{
    String name;
    int id;
    double salary;
    
    public Member(String n, int i, double sal){
        name = n;
        id = i;
        salary = sal;
    }
    
    public void  print(){
        System.out.println("Name: " +  name );
        System.out.println("id: " +  id );
        System.out.println("Salary: " +  Double.toString(salary) );
    }
}
class TestClass {
    public static void main(String args[] ) throws Exception {
        Member m = new Member("Ram", 1312, 871289.989);
        m.print();
    }
}
