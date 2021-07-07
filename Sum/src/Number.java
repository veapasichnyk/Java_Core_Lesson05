public class Number {
    private int a;
    private int b;
    private int c;

    public Number ( int a , int b ) {
        this.a = a;
        this.b = b;
    }

    public Number ( int a , int b , int c ) {
        this ( a , b );
        this.c = c;
    }

    public int Sum1 () {
        return (a + b);
    }

    public int Sum2 () {
        return (a + b + c);
    }


}