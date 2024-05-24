
public class Program1 {
	public static void main (String args[]) {
	    double a1 = 5, b1= 1, k1= 1, a2= 1, b2= 1 , k2=12;
	    Cramer_solver Cramer_solver = new Cramer_solver (a1, b1, k1, a2, b2, k2);
	    Cramer_solver.print_Equation ();

	    double[] results= new double [2];
	    results=Cramer_solver.result();

	    System.out.println(results[0]);
	    System.out.println(results[1]);
	}

}

class Cramer_solver {
    public double a1, b1, k1, a2, b2, k2, D, Dx, Dy;
    
    public Cramer_solver(double a1, double b1, double k1, double a2, double b2, double k2) {
        this.a1 = a1;
        this.b1 = b1;
        this.k1 = k1;
        this.a2 = a2;
        this.b2 = b2;
        this.k2 = k2;
    }
    public void print_Equation() {
        System.out.println(a1 + " x + " + b1 + " y = "+ k1);
        System.out.println(a2 + " x + " + b2 + " y = "+ k2);
    }
    public double Calculate_D (double a1, double b1, double a2, double b2) {
        D = ((a1*b2)-(b1*a2));
        return D;
    }
    public double Calculate_Dx (double b1,double b2, double k1, double k2) {
        Dx = ((k1*b2)-(k2*b1));
        return Dx;
    }
    public double Calculate_Dy (double a1, double a2, double k1, double k2) {
        Dy = ((k1*a2)-(k2*a1));
        return Dy;
    }
    public double[] result () {
        double[] t= new double [2];
        Calculate_D(a1,b1,a2,b2);
	    Calculate_Dx(b1,b2,k1,k2);
	    Calculate_Dy(a1,a2,k1,k2);
        t[0]= Dx/D;
        t[1]= Dy/D;
        return t; 
    }
}

