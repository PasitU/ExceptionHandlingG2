package exception2;


public class LAB6 {

    public static void main(String[] args){

        try{
            System.out.println(69/0);
        }
        catch(ArithmeticException e){
            StackTraceElement[] a = e.getStackTrace();
            for(int i = 0; i<a.length; i++){
            System.out.println(a[i].getClassName());
            System.out.println(a[i].getMethodName());
            System.out.println(a[i].getFileName());
            System.out.println(a[i].getLineNumber());
            }
        }
    }
    
}
