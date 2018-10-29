class Main {
	public static void main(String[] a){

	}
}

class A {
    public B m( int x, int y, A r ) { // Duplicate locals and params (x)
	int x;
	return new B();
    }
}

class B extends A {

}
