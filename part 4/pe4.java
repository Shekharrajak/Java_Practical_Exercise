
import java.util.*;

class Student{
	private int id;
	private String name;
	private int age;

	public Student(int i, String n, int a){
		id = i;
		name = n;
		age = a;
	}

	public int getId(){
		return this.id;
	}

	public void setId(int i){
		this.id = i;
	}


	public String getName(){
		return this.name;
	}

	public void setName(String n){
		this.name = n;
	}


	public int getAge(){
		return this.age;
	}

	public void setAge(int a){
		this.age = a;
	}

}
// 
class sortByAge implements Comparator<Student>{
	public int compare(Student s1, Student s2){
		if(s1.getAge() == s2.getAge()){
			return s1.getId() - s2.getId();	
		}
		return s1.getAge() - s2.getAge();
	}
}

class Pe4 {
    public static void main(String args[] ) {

        ArrayList<Student> al = new ArrayList<Student>();

        al.add(new Student(12,"Radha1", 23));
        al.add(new Student(13,"Radha2", 21));
        al.add(new Student(14,"Radha3", 41));
        al.add(new Student(14,"Radha4", 12));
        al.add(new Student(15,"Radha5", 12));

        Collections.sort(al, new sortByAge());
		System.out.println("\nSorted by age");
        for (int i=0; i<al.size(); i++)
	      {
	      	Student s = al.get(i);
	      	System.out.println("id : " + s.getId() + " name: " + s.getName() + " age: " + s.getAge());}
 
    }
}
