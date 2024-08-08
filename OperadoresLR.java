public class OperadoresLR {

    public static void main(String[] args){
        boolean p, q, r;
        p = true;
        q = !p;
        // valor de q passa a ser false
        r = (p || q);
        // valor de r passa a ser true

        System.out.println("Os valores são: " + p + ", " +  q + ", " +  r);
        
    }
    
}
