/*
 * A class i.e. created inside a method is called local inner class in java. 
 * If you want to invoke the methods of local inner class, you must instantiate
 *  this class inside the method.
 * 
 */
public class LocalInnerClassEX {
	private int data = 30;// instance variable

	void display() {
		class Local {
			void print() {
				System.out.println(data);
			}
		}
		Local l = new Local();
		l.print();
	}

	public static void main(String args[]) {
		LocalInnerClassEX obj = new LocalInnerClassEX();
		obj.display();
	}
}