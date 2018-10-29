class Main {
    public static void main( String [] args ) {
	A c;
	c = new C();
	System.out.println( c.z() );
    }
}

class A {
    int y;
    public int x() {
	return 5;
    }
}

class B extends A {
    public int y() {
	int l;
	l = this.x();
	return l + y;
    }
}

class C extends B {
    public int z() {
	int l;
	l = this.y();
	return l;
    }
}
