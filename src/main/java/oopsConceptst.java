public class oopsConceptst implements printOptions {

    public static void main(String[] args) {

        printOptions p = new oopsConcepts();
        p.NextLine();
        p.SameLine();

        int k = 3;
        for (int i = 1; i < 5; i++) {
            //System.out.println(i);
            for (int j = 1; j <= i; j++) {
                System.out.print(k);
                System.out.print("\t");
                k = k + 3;
            }
            System.out.println(" ");
        }
    }


    @Override
    public void NextLine() {
        System.out.println("This is first line: ");
        System.out.println("This is next Line");
    }

    @Override
    public void SameLine() {
        System.out.print("Im not in next line its same line\n");

    }

    public static class oopsConcepts implements printOptions {

        public static void main(String[] args) {

            printOptions p = new oopsConcepts();
            p.NextLine();
            p.SameLine();

            int k = 3;
            for (int i = 1; i < 5; i++) {
                //System.out.println(i);
                for (int j = 1; j <= i; j++) {
                    System.out.print(k);
                    System.out.print("\t");
                    k = k + 3;
                }
                System.out.println(" ");
            }
        }


        @Override
        public void NextLine() {
            System.out.println("This is first line: ");
            System.out.println("This is next Line");
        }

        @Override
        public void SameLine() {
            System.out.print("Im not in next line its same line\n");

        }
    }
}

        /* To print number pyramid

int k=1;
        for(int i=1;i<5;i++)
        {
            for (int j = 1; j<=i; j++)
            {
                System.out.print( k);
                System.out.print("\t");
                k++;
            }
            System.out.println("");
        }

    }
}
1
        2	3
        4	5	6
        7	8	9	10

                */




       /* Program to print number Pyramid
        int k = 1;
        for (int i = 0; i < 4; i++) {

            for (int j = 1; j <= 4 - i; j++) {
                System.out.print( k);
                System.out.print("\t");
                k++;

            }
            System.out.println(" ");

        }
    }

     1	2	3	4
5	6	7
8	9
10
} */

  /*

        int i=0;
        do{
            System.out.println(i++);
        }while(i<30);  //Executes atleast once.

        */
    /*While Loop
        int i=11;

        while(i>=8){

            System.out.print("\n"+i);
            i--;
        }*/