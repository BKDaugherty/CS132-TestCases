class Main {
    public static void main( String [] args ) {
	A a;
	System.out.println( a.addToB( 7 ) ); 
    }
}

class A {
    B b;
    
    public int addToB( int toAdd ) {
	return b.addZ( toAdd );
    }
}

class B {
    int z;

    public int addZ( int toAdd ) {
	return z + toAdd;
    }
}
