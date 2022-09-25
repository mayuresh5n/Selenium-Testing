package JavaPrograms;

public class pyramidNum {


    public static void main(String[] args) {
int k=1;
        for (int i=1;i<5;i++)
        {
       //     System.out.println(i);
            for(int j=i;j<5;j++)
            {
                System.out.print( k);
                System.out.print("\t");
                k++;
            }
            System.out.println("  ");
        }
    }
}