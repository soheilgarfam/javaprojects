import java.util.Scanner;

public class stern {
    
    public static void erste(int x){
        

        for(int zeile = 0 ; zeile < x ;zeile++ ){
            

            for(int stern = 0 ; stern <= zeile; stern++ ){
                
                System.out.print("*");
                System.out.print(" ");
            }
            

            System.out.println();
            
        }
        
    }

    public static void zweite(int x){
        

        for (int zeile = 0; zeile < x; zeile++) {

            
            for (int space = x - zeile ; space > 0; space--) {
                System.out.print(" ");
            }

            
            for (int stern = 0 ; stern <= zeile; stern++) {
                System.out.print("*");
                System.out.print(" ");
                

            }

            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("geben sie eine nummer:");

        int x = myObj.nextInt(); 
        myObj.close();
        

       erste(x);


       System.out.println("-------------");
       System.out.println("-------------");
       System.out.println("-------------");


       zweite(x);
        





        



    }



    
}
