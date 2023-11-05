package Lab7;

class boxing {
   public static void main(String[] args) {

      Integer i = new Integer(10);
      int i1 = i;

      System.out.println("Value of i:" + i);
      System.out.println("Value of i1: " + i1);

      Character gfg = 'a';
      char ch = gfg;

      System.out.println("Value of ch: " + ch);
      System.out.println(" Value of gfg: " + gfg);

      Float f = new Float(0.1f);
      float f1 = f;

      System.out.println("Value of f:" + f);
      System.out.println("Value of f1: " + f1);

      Double d = new Double(2.56);
      double d1 = d;

      System.out.println("Value of d:" + d);
      System.out.println("Value of d1: " + d1);

   }
}