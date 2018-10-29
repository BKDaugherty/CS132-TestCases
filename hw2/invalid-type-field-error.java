class Main {
    public static void main( String [] args ) {
	A a;
	a = new A();
	System.out.println( a.doSomething() ); 
    }
}

class A {
    int y;
    public int doSomething() {
	System.out.println( y[5] );
	System.out.println( y.length );
	return 0;
    }
}
