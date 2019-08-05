
class TestMemberOuter {
	private int var = 30;

	class Inner {
		void show() {
			System.out.println("value of private variable var  is " + var);
		}
	}

	public static void main(String args[]) {
		TestMemberOuter obj = new TestMemberOuter();
		TestMemberOuter.Inner in = obj.new Inner();
		in.show();
		
	}
}