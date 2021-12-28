
import java.util.Scanner;
public class SubStringOrder{
  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n= scan.next();// cadena de letras de A-Z
        int k = scan.nextInt();
        cadenas(n, k);


    }
    static void cadenas(String n, int k) {
       String larga = "";
      String cortaCadena= larga = n.substring(0, k);
    for (int i=1; i<n.length()-k+1; i++) {
        String subCadena= n.substring(i, i+k);
        if (cortaCadena.compareTo(subCadena) > 0)
        	cortaCadena = subCadena;
        if (larga.compareTo(subCadena) < 0)
            larga = subCadena;
    }

      System.out.println(cortaCadena);

    }


}