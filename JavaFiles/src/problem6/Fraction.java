package problem6;

public class Fraction implements java.io.Serializable{
    int enumerator;
    int denominator;

    public Fraction(int enumerator, int denominator) {
        this.enumerator = enumerator;
        this.denominator = denominator;
    }

    public void printFraction() {
        System.out.println(this.enumerator + "/" + this.denominator);
    }
}
