package pl.kurs.task2;

public class Runner {
    public static void main(String[] args) {

        // Konkatenacja stringów

        long start1 = System.nanoTime();
        String result = "";
        for (int i = 0; i < 100000; i++) {
            result += i;
        }
        long stop1 = System.nanoTime();
        long t1 = stop1 - start1;

        // Konkatenacja za pomocą StringBuilder

        long start2 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
        String result2 = sb.toString();
        long stop2 = System.nanoTime();
        long t2 = stop2 - start2;
        System.out.println("Czas  wykoniania się poprzez konkatenacje " + t1);
        System.out.println("Czas wykoniania się poprzez StringBuilder "+t2);
    }


}
