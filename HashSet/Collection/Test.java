package Collection;

public class Test {

	static int x;
	public static void main(String[] args) {
		System.out.println(x);
		Test t = new Test();
		t.x = 100; 
		System.out.println(t.x);
		System.out.println(Test.x);
		
		
		t.m1();
	}
	public void m1() {
		System.out.println(x);
	}

}
