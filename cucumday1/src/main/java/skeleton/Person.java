package skeleton;

public class Person {
	private int distance;
	private String message;

	public void setDistance(Integer int1) {
		distance=int1;
		// TODO Auto-generated method stub
		
	}

	public void setMessage(String string) {
		message=string;
		if(distance>0&&distance<30)
		message=string;
		else
		message=null;
		
		// TODO Auto-generated method stub
		
	}

	public String getMessage() {
		
		// TODO Auto-generated method stub
		return message;
	}

}
