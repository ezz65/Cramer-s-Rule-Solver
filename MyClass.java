public class MyClass {
    public static void main(String args[]) {
        
        double a1 = 5 ,b1 = 1,a2 =1 ,b2 = 1,k1 = 1,k2 = 12;
        System_equations sys = new System_equations(a1, b1, k1, a2, b2,k2);
        sys.show();
        double[] array = new double[2];
        array = sys.CalculateX_Y();
        System.out.println(array[0]);
        System.out.println(array[1]);

    }
}
 class System_equations{
     public double a1,a2,b1,b2,k1,k2,D,Dx,Dy;
     public System_equations(double a1,double b1,double k1,double a2, double b2, double k2) {
         this.a1=a1;
         this.a2=a2;
         this.b1=b1;
         this.b2=b2;
         this.k1=k1;
         this.k2=k2;
     }
       public void show () {
            System.out.println(a1+" x + " + b1+ " y = "+ k1);
            System.out.println(a2+" x + " + b2+ " y = "+ k2);

        }
      public double CalculateD(double a1,double b1,double a2,double b2 ){
         D=((a1*b2)-(a2*b1));
         return D;
     }
      public double CalculateDx(double b1,double b2, double k1, double k2){
        Dx= ((k1*b2)-(k2*b1));
        return Dx;
     }
      public double CalculateDy(double a1,double a2, double k1, double k2){
         Dy= ((k1*a2)-(k2*a1));
         return Dy;
     }
      public double[] CalculateX_Y(){
         double[] t= new double [2];
         CalculateD(a1,b1,a2,b2);
         CalculateDx(b1,b2,k1,k2);
         CalculateDy(a1,a2,k1,k2);
        
        t[0]=Dx/D;
        t[1]=Dy/D;
         return t;
     }
 }
