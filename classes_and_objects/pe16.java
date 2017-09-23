
import java.util.*;

class Member{
    int grade;
    
    public Member(int g){ 
        grade = g;
    }
    
    // public void  print(){
    //     System.out.println("Name: " +  name );
    //     System.out.println("id: " +  id );
    //     System.out.println("Salary: " +  Double.toString(salary) );
    // }
}
class pe16 {
    public static void main(String args[] ) throws Exception {

        System.out.println("Enter the num of student : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Member[] m = new Member[num];
        for(int i=0;i<num;i++){
            System.out.println("Enter the grade of student : " + i);
            m[i] = new Member(sc.nextInt());    
        }

        int max = 0;
        int min = 100;
        double avg = 0;
        int sum = 0;
        for(int i=0;i<num;i++){
            sum += m[i].grade;
            if(m[i].grade > max){
                max = m[i].grade;
            } 
            if(m[i].grade < min){
                min = m[i].grade;
            }
        }
        avg = sum/num;
        System.out.println("max : " + max);
        System.out.println("min : " + min );
        System.out.println("avag : " + avg);
        // m.print();
    }
}
