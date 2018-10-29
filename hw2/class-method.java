class Main {
    public static void main( String [] args ) {
	A a;
	a = new A();
	System.out.println( new A().addY( 7 ) ); 
    }
}

class A {
    int y;
    int x;
    
    public int addY( int toAdd ) {
	return y + toAdd;
    }

    public int addX( int toAdd ) {
	return x + toAdd;
    }

}
