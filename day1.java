package java_code;

public class test {

	public static void main(String[] args) {
		clas1 ob1=new clas1();
		
		ob1.sets("jay");
		ob1.setx(44);
		
		System.out.println(ob1.getdatax());
		System.out.println(ob1.getdatas());
	}

}

class clas1 {
	private int x;
	private String s;
	
	void setx(int x) {this.x=x;}
	void sets(String s) {this.s=s;}
	
	int getdatax(){
		return this.x;
	}
	String getdatas() {
		return this.s;
	}
}
