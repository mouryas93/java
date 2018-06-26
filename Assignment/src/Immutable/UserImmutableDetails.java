package Immutable;

public final class UserImmutableDetails implements Cloneable {
private final int a;
private final String b;

public UserImmutableDetails(int a,String b){
	this.a=a;
	this.b=b;
}

public int getA() {
	return a;
}

public String getB() {
	return b;
}

}
