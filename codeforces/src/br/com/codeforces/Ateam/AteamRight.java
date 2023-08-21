package br.com.codeforces.Ateam;

import java.util.Scanner;

public class AteamRight {

    static Scanner scan = new Scanner(System.in);

//    public static void main(String[] args) {
//
//        int n = scan.nextInt();
//        scan.nextLine(); // Consumir a quebra de linha após o número
//
//        int numberOfProblemsInteger = 0;
//        
//        for (int i = 0; i < n; i++) {
//            String viewLine = scan.nextLine();
//            int qtdNums = 0;
//
//            for (int j = 0; j < viewLine.length(); j++) {
//                if (viewLine.charAt(j) == '1') {
//                    qtdNums++;
//                }
//            }
//
//            if (qtdNums >= 2) {
//                numberOfProblemsInteger++;
//            }
//        }
//
//        System.out.println(numberOfProblemsInteger);
//    }
    

        public static void main(String[] args) {
             int a,b, c, m, n = 0;
            m= scan.nextInt();
             for(int i=0;i<m;i++){
                 a= scan.nextInt();
                 b= scan.nextInt();
                 c= scan.nextInt();
                 if(a==1&&b==1||a==1&&c==1||b==1&&c==1){
                     n++;
             }
        }
             System.out.println(n);
        }
    
}
