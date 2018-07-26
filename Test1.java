package Test1;
import java.io.*;

public class Test1 {
public static void main(String[] args) 
throws IOException
{
	double a, b, c, delta, x1, x2;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	try {
		
	System.out.println("Program oblicza pierwiastek kwadratowy");
	System.out.println();
	System.out.println("Podaj wartoœæ a: ");
	a = Double.parseDouble(br.readLine());
	
	if (a == 0)
	{
		System.out.println("Niew³asciwy wspó³czynnik a. ");
	}
	else
	{
		System.out.println("Podaj wartoœæ b: ");
		b = Double.parseDouble(br.readLine());
		System.out.println("Podaj wartoœæ c: ");
		c = Double.parseDouble(br.readLine());
		
		delta = b*b-4*a*c;
		
		if (delta == 0)
		{
			x1 = -b/(2*a);
			System.out.printf("dla a=  " + "%4.2f,", a);
			System.out.printf("b =  " + "%4.2f,", b);
			System.out.printf("c =  " + "%4.2f\n", c);
			System.out.println("trójmian ma jeden pierwiastek podwójny x1 = ");
			System.out.printf("%4.2f.", x1);
			System.out.println("");
		}
		else
		{
			x1 = (-b-Math.sqrt(delta)) / (2*a);
			x2 = (-b+Math.sqrt(delta)) / (2*a);
			System.out.printf("Dla a = " + "%4.2f,", a);
			System.out.printf(" b = " + "%4.2f,", b);
			System.out.printf(" c = " + "%4.2f\n", c);
			System.out.println("trójmian ma dwa pierwiastki: ");
			System.out.println("x1 = ");
			System.out.printf("%4.2f\n", x1);
			System.out.println("x2 = ");
			System.out.printf("%4.2f,", x2);
			System.out.println("");
		}
	}
	
}
catch (NumberFormatException exc)
{
	System.out.println("Niew³asciwy format znaku");
}
}
}