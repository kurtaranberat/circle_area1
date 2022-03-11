import  java.util.Scanner;
public class number {

    public  static  void  main(String[]args) {
      Scanner brt=new Scanner( System.in);
      System.out.print("dairenin yarıcapını gır =");
      int r =brt.nextInt();
      final  double pı =3.14;
      int  cap = (int) (2*pı*r);
      int alan =  (int)(pı*r*r);

      System.out.println("dairenin alanı ="+alan);
      System.out.println("dairenin cevresı ="+cap);
    }
}

