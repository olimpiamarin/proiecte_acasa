import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        short variabilaMea = 10;
//        float zecimalaMea = (float)4.5;
//        double zecimala = 11.56;
//        char litera = 'A';
//        boolean esteFals = true;
//
//        System.out.println(variabilaMea);
//        System.out.println(zecimalaMea);
//        System.out.println(zecimala);
//        System.out.println(litera);
//        System.out.println(esteFals);

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Introdu un numar:");
//        int numarDeIntrodus = scan.nextInt();
//
//            System.out.println("Valoarea este");
//            System.out.print(numarDeIntrodus);
//
//        Scanner scan1 = new Scanner(System.in);
//        System.out.println("Introdu o zecimala:");
//        double numarDeIntrodus1 = scan1.nextDouble();
//
//             System.out.println("Valoarea este");
//             System.out.print(numarDeIntrodus1);

//        class Exemplu {
//            //Fiecare variabila corespunde situatiei data de numele ei
//            //din enumerarea de mai sus
//            int a=6;
//            public void metoda(int b) {
//                a = b;
//                int c = 10;
//                for(int d=0; d < 10; d++) {
//                    c --;
//                }
//                try {
//                    a = b/c;
//                } catch(ArithmeticException e) {
//                    System.err.println(e.getMessage());
//                }
//            }
//        }

//        int i=0;
//        eticheta:
//        while (i < 10) {
//            System.out.println("i="+i);
//            int j=0;
//            while (j < 10) {
//                j++;
//                if (j==5) continue eticheta;
//                if (j==7) break eticheta;
//                System.out.println("j="+j);
//            }
//            i++;
//        }
//

//        int x = 20;
//        int y = 45;
//        if (x>=30 || y>=30) {
//            System.out.println("atunci este adevarat");
//            }
//        else {
//            System.out.println("atunci este false");
//        }

//        int nota = 9;
//
//        switch (nota){
//            case 9:
//                System.out.println("bravo");break;
//            case 7:
//                System.out.println("binisor");break;
//            case 5:
//                System.out.println("hai ca nu e rau");break;
//            case 3:
//                System.out.println("esti foarte slab pregatit");break;
//            default:
//                System.out.println("nu s-a definit nota");
//        }

//        int i =10;
//
//        while (i>=1){
//            System.out.println(i);
//            i--;
//        }

//        int i = 0;
//
//        do {
//            System.out.println(i);
//            i++
//        } while(i <= 10);


//                Scanner input = new Scanner(System.in);
//
//                System.out.println("enter number");
//                int scan = input.nextInt();
//                int[] a = {1, 3, 4, 6, 7, 8, 10, 12, 14, 23};
//
//                for(int i=0;i<a.length;i++){
//                    if(scan==a[i]){
//                        System.out.println("numar gasit pe pozitia "+i);
//                        return;
//                    }
//                }
//                System.out.println("-1");

//        int a = 20;
//        for (int i = 1; i < a; i++) {
//            if (a % i == 0) {
//                System.out.println(i);
//            }
//        }
        int a = 4;
        int b = 1;
        int rez =1;
        while(b<=a){
            rez = rez * b;
            b++;
        }
        System.out.println("rezultat "+ rez );
    }
}
