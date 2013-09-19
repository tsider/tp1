public class HelloWordGender extends HelloWord{

			
	private boolean Gender;

	//public helloword(){}
	public HelloWordGender (boolean Gender ,String name){
	super(name);
	this.Gender=Gender;

	}
	
	public void print(){
	//String affi= "Helloword"+this.name;
	if (this.Gender){

	System.out.println("Hello Master   "+"  "+this.name );}

	else {
	System.out.println("Hello Miss   "+"  "+this.name );
		}
	}

}
