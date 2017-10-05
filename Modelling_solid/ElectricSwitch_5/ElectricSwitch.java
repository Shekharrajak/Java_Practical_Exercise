import java.lang.Override;

	

public class ElectricSwitch implements Switch{
	// any thing that are switchable
	public static class BulbSwith implements Switchable{

		 public void turnOff(){
			System.out.println(" i am turned off!");
		}

		 public void turnOn(){
			System.out.println(" i am turned on!");
		}
	}

	Switchable switchable ;

	boolean on ;

	public ElectricSwitch(Switchable switch_able){
		this.switchable = switch_able;
		this.on = false;

	}

	// @override()
	public boolean isOn(){
		return this.on;
	}

	public void press(){
		boolean checkOn = this.on;
		if(checkOn){
			switchable.turnOff();
			this.on = false;
		}
		else{
			switchable.turnOn();
			this.on = true;
		}
	}

	public static void main(String[] args){
		Switchable buld_switch = new BulbSwith();
		ElectricSwitch e = new ElectricSwitch(buld_switch);
		e.press();
		e.press();
	}	
}