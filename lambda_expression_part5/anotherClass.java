public class anotherClass{

	public Inner get_class(){
		return new Inner(){
			void get(){
				System.out.println("I am anonymous");
			}
		};
	}
}