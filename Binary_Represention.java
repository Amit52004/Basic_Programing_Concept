// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        
        int num=4;
        for(int i=17;i>=0;i--){
             int bit=(num>>i)&1;
             System.out.print(bit);
        }
        System.out.print("\n");
        
    }
}