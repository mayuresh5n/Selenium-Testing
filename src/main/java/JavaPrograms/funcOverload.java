package JavaPrograms;

//If a same class have multiple methods with same name its called function overloading or method
//overloading.We diffeerentiate based upon the argument passed

public class funcOverload {

    public static void main(String[] args) {

        funcOverload ol=new funcOverload();
        ol.getData("Hello");
        ol.getData("Name",4);
        ol.getData("swf",56);

    }
    public void getData(String s){
   //     s="Nazare";
        System.out.println(s);
    }
    public void getData(String x,int J){
        System.out.println(x);
        System.out.println(J);

    }
    public void getData(String a,int J,int c){
        System.out.println(a);
        System.out.println(J);
    }
    public void audioSystem() {
        System.out.println("Bang and Olufson");
    }
}
