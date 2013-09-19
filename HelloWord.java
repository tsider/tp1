

public class HelloWord {

	protected String name;
	
	//public helloword(){}
	public HelloWord (String name){
	
	this.name=name;

	}
	
	public String getname() {
		return name;
	}

	public void setNom(String name) {
		this.name = name;
	}

	public void print(){
	//String affi= "Helloword"+this.name;
	System.out.println("Helloword   "+"  "+this.name);
	}
}
	

