package myexception;


public class MyException {

    public static void main(String[] args) {
        try{
            int[] List;
            List = new int[10];
            System.out.println("List[10] is"+ List[10]);
        }
        catch(ArithmeticException a){
            System.out.println("Arithmetic exception");
        }
        catch(NullPointerException a){
            System.out.println("Nullpointer exception");
        }
        catch(IndexOutOfBoundsException a){
            System.out.println("indexoutofbounds exception");
        }
        catch(RuntimeException a){
            System.out.println("Runtime exception");
        }
        catch (Exception a){
            System.out.println("Exception");
        }
        finally{
            
        }
    }
    
}
