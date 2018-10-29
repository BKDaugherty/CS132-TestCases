class Main {
    public static void main( String [] args ) {
    }
}

class A {
    public int x() {
	return 5;
    }
}

class B extends A {
    public int x() {
	return 5 + 10;
    }
}

class C extends A{
    public int x( int y ) {
	return 5 + y;
    }
}


