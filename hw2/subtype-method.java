class Main {
    public static void main( String [] args ) {
	C c;
	c = new C();
	System.out.println( c.x() );
	System.out.println( c.y() );
    }
}

class A {
    public int x() {
	return 5;
    }
}

class B extends A {
    public int y() {
	return 7;
    }
}

class C extends B {

}
