public class Test {
    public static void main(String[] args) {
        int k=1;
        for(int i=0;i<5;i++){
            System.out.println("i="+i);
            for(int j=0;j<i;j++){
                System.out.print("j="+j);
                System.out.print("K="+k);
                System.out.print("\t");
                k++;

            }
            System.out.println(" ");
        }


    }
}
/*

1        i1
2 3        i2
4 5 6         i3
7 8 9 10         i4

 */