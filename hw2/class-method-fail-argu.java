class Main {
    public static void main( String [] args ) {
	A a;
	a = new A();
	System.out.println( a.addY( new A() ) ); 
    }
}

class A {
    int y;
    
    
    public int addY( int toAdd ) {
	return y + toAdd;
    }

}
