package faktöriyel_hesaplama_r;

public class Faktöriyel_hesaplama_r {
    
    public static void main(String[] args) {
        
        System.out.println(faktoriyel(5));
    }
    
    public static int faktoriyel(int number){
        
        if(number==1){
            return number;
        }
        
            return number*faktoriyel(--number);
        
    }
}
