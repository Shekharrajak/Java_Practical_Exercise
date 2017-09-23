
import java.util.*;

class Student{
    String name;
    int grade;
    
    public Student(String n, int g) throws OutOfRangeException{
        name = n;
        if(g >= 0 && g <= 100){
            grade = g;    
        }
        else{
            throw new OutOfRangeException(g);
        }
        
    }

}
class pe1 {
    public static void main(String args[] ) throws OutOfRangeException {
        System.out.println("Enter num of students : ");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        while(num>0){
            System.out.println("Enter student details: " );
            System.out.println("name : ");
            String name = sc.next();
            System.out.println("Grade : ");
            int grade = sc.nextInt();
        
            try{
                Student m = new Student(name, grade);    
            }
            catch(OutOfRangeException e){
                System.out.println("Grade is not in range 0 to  100");
                e.printStackTrace();

            }
            num = num -1;
            
        }

        System.out.println("Enter num of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter num of col : ");
        int col = sc.nextInt();
        
        int[][] mat1 = new int[row][col];
        int[][] mat2 = new int[row][col];

        System.out.println("Enter element of 1st : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat1[i][j] = sc.nextInt();
            }

        }
        System.out.println("Enter element of 2nd : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat2[i][j] = sc.nextInt() + mat1[i][j];

            }

        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat2[i][j] + " ");
                
            }

        }
    }
}
