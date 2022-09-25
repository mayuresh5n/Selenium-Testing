/* Findian minimum in multidimensional array
* 1 3
* 4 2
* 6 7
* */

package JavaPrograms;

public class arrayPractice {
    public static void main(String[] args) {

        int[][] multarr = {{2,3,5},
                           {4,10,9},
                           {8,5,6}};
        int minColum=0;
        int min=multarr[0][0];
      //  int max=multarr[0][0];


        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               if(multarr[i][j]>min){

                   min=multarr[i][j];
                   minColum = j;
               }
            }
        }
        int max=multarr[0][minColum];

        int k=0;
        while(k<3){
            if(multarr[k][minColum]>max){

                max=multarr[k][minColum];
            }
            k++;
        }
        System.out.println(max);

    }


}








/* String reversal*/
/*
package JavaPrograms;

public class arrayPractice {
    public static void main(String[] args) {

        String s= "Mayuresh";
       char[] charr= s.toCharArray();

       StringBuilder sb=new StringBuilder();

        for(int i=s.length()-1;i>=0;i--){

            sb.append(charr[i]);

            System.out.println(sb);
        }
    }
}
 */