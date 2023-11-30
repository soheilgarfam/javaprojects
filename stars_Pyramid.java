import java.util.Scanner;

public class stars_Pyramid{

    


    public static void buildStars(int x){
        

        for (int line = 0; line < x; line++) {

            
            for (int space = x - line ; space > 0; space--) {
                System.out.print(" ");
            }

            
            for (int stars
             = 0 ; stars
             <= line; stars
            ++) {
                System.out.print("*");
                System.out.print(" ");
                

            }

            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("give me a number : ");

        int x = myObj.nextInt(); 
        myObj.close();
        



       buildStars(x);
        





        



    }



    
}
