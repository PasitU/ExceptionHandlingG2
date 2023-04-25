package myexception;


public class Lab3 {
    public static void main(String[] args) {
        try{
            System.out.println("statement1");
            System.out.println("statement2" + 69/0);
            System.out.println("statement3");
        }
        catch(IndexOutOfBoundsException ex){
        }
        finally{
        System.out.println("statement4");
    }
        System.out.println("statement5");
    }
}
