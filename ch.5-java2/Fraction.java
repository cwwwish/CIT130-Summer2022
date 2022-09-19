public class Fraction {
   private int num;
   private int den;
  
   public Fraction() {
       num = 0;
       den = 1;
   }
  
   public Fraction(int numerator, int denominator) {
       num = numerator;
       den = denominator;
   }
   
   public int getNum() {
       return num;
   }
  
   public int getDenom() {
       return den;
   }
  
   public boolean equals(Fraction f) {
       return getNum()* f.getDenom() == f.getNum()*getDenom();
   }
  
   public String toString() {
       return num + "/" + den;
   }
}
