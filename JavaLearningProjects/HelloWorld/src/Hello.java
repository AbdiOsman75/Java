public class Hello {

    public static void main(String[] args){
        //Print Hello using System.out.Println();, also sout is the shorthand
        System.out.println("Hello, Abdishakur!");

        // Variable type has to be declare but expression is not critical
        int myFirstNumber = (10+5)+(2*10);
        int mySecondNumber = 12;
        //  int myThirdNumber = 6;
        // Mathematical operations work on numeric variables.
        int myThirdNumber = myFirstNumber*2;
        int myTotal = myFirstNumber+mySecondNumber+myThirdNumber;
        System.out.println(myTotal);
        /* Challenge: Create a new variable called myLastOne,
        with the value to be 1000 less the current value of myTotal,
        and the data type should also be an int. And then you want to print out
        the value of myLastOne on the line after you declare it.
         */
        int myLastOne = myTotal-1000;
        System.out.println(myLastOne);
    }
}