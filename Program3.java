//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
class Program3{
    public static void main (String[] args){
        //make a scanner
        Scanner myScanner = new Scanner(System.in);
        //create variables
        int length = 0;
        int width = 0; 
        int area = 0; 
        int perimeter = 0;
        //ask user for input and store
        System.out.println ("Enter Length: ");
        length = myScanner.nextInt(); 
        
        System.out.println ("Enter Width: ");
        width = myScanner.nextInt();
        //calculate area and perimeter
        area = (length*width) ; 
        perimeter= (2*length + 2*width);
        //show output 
        System.out.println("Length is "+ length);
        System.out.println("Width is " + width);
        System.out.println("Area is " + area);
        System.out.println("Perimeter is " + perimeter);
    }
}

//Paste console output below:
/*
Enter Length: 
10
Enter Width: 
10
Length is 10
Width is 10
Area is 100
Perimeter is 40

*/
