

class fraction {
    private int num,den;
    public fraction() {
    num=den=1;
}

public fraction(int num,int den) {
    this.num=num;
    this.den=den;
}

public int getNumerator() {
    return num;
}

public int getDenominator() {
    return den;
}

public void setNumerator(int num) {
    this.num=num;
}

public void setDenominator(int den) {
    this.den=den;
 } 
}
