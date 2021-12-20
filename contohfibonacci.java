import java.util.Scanner;

public class contohfibonacci {
	static int fibo(int y){
	    if(y == 0 || y == 1){
	      return y;
	    } else {
	      return (fibo(y-1) + fibo(-2));
	    }
	  }
	  public static void main(String[]args){

	    int i, j = 0;
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Masukkan jumlah deret bilangan fibonacci: ");
	    int y = scan.nextInt();

	    System.out.print("Hasil bilangan fibonacci: ");
	    for (i = 0; i < y; i++){
	      System.out.print(fibo(j)+", ");
	      j++;
	    }
	    System.out.println();
	  }
	}