import java.util.Scanner;

public class percobaan2 {
    static String deret = " ";
    static int hitungPangkat (int x, int y){
        if (y == 0) {
            deret += 1;
            return (1);
        }else {
            deret += x + "x";
            return(x * hitungPangkat(x, y-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int bilangan = 0, pangkat = 0;
        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();

        System.out.println(hitungPangkat(bilangan, pangkat));
        System.out.print(deret + "=" +hitungPangkat(bilangan, pangkat));
    }
}