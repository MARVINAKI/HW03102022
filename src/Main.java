public class Main {
    public static void main(String[] args) {

    //Exercise 1
        for (int c=1;c<=10;c++) System.out.println(c);
        System.out.println();


    //Exercise 2
        for (int c=10;c>=1;c--) System.out.println(c);
        System.out.println();


    //Exercise 3
        for (int c=0;c<=17;c+=2) System.out.println(c);
        System.out.println();


    //Exercise 4
        for (int c=10;c>=-10;c--) System.out.println(c);
        System.out.println();


    //Exercise 5
        for (int c=1904;c<=2096;c+=4) {
            if (c%100==0&&c%400!=0) {
                c+=4;
            }
            System.out.println(c+" год является високосным");
        }
        System.out.println();


    //Exercise 6
        for (int c=7;c<=98;c+=7) System.out.println(c);
        System.out.println();


    //Exercise 7
        for (int c=1;c<=512;c*=2) System.out.println(c);
        System.out.println();


    //Exercise 8
        for (int c=1,vklad=0,rub=29000;c<=12;c++) {
            vklad+=rub;
            System.out.println("Месяц "+c+", сумма накоплений равна "+vklad+" рублей");
        }
        System.out.println();


    //Exercise 9
        double vklad=0;
        for (int c=1,rub=29000;c<=12;c++) {
            vklad=(vklad+rub)*1.01;
            System.out.println("Месяц "+c+", сумма накоплений равна "+(int)Math.floor(vklad));
        }
        System.out.println();

    }
}