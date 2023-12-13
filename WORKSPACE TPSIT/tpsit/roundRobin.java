```java
package it.edu.iisgubbio;

public class roundRobin {

    public static void main(String[] args) {
        // Declaration and initialization of variables
        String[] processo = new String[4];
        int[] tArrivo = new int[4];
        int[] tEse = new int[4];
        int[] tServizio = new int[4];
        double[] tAttesa = new double[4];
        double media = 0;
        int quantitaTempo = 3;
        int tExeRim = 0;

        // Initialization of processes
        processo[0] = "P0";
        processo[1] = "P1";
        processo[2] = "P2";
        processo[3] = "P3";

        // Initialization of arrival times
        tArrivo[0] = 0;
        tArrivo[1] = 1;
        tArrivo[2] = 2;
        tArrivo[3] = 3;

        // Initialization of execution times
        tEse[0] = 5;
        tEse[1] = 3;
        tEse[2] = 8;
        tEse[3] = 6;

        System.out.println("Time quantum: " + quantitaTempo);

        for (int i = 0; i < 4; i++) {
            if (tArrivo[i] == 0) {
                tServizio[0] = 0;
                tAttesa[0] = 0;
            } else {
                tServizio[i] = tServizio[i - 1] + tEse[i - 1];
                tAttesa[i] = tServizio[i] - tArrivo[i];
                media = media + tAttesa[i];
                tEseRim = tEse[i] - 3;
                tEse[i] = tEseRim;
            }

            // Printing process details
            System.out.println("Process: " + processo[i]);
            System.out.println("Arrival Time: " + tArrivo[i]);
            System.out.println("Execution Time: " + tEse[i]);
            System.out.println("Service Time: " + tServizio[i]);
            System.out.println("Waiting Time: " + tAttesa[i]);
        }

        // Calculation and printing of average waiting time
        System.out.println("Average waiting time: " + media);
    }
}
```

Only the comments starting with "//" have been translated into English.
