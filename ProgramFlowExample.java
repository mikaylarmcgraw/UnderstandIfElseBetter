//Purpose: illustrate where statements execute when a program is running. Reinforce the scope of control for the if-then-else construct. 

class ProgramFlowExample
{

    public static void main(String args[])
    {

        //no input error trapping necesssary on main arguments
        
        int a = 6;
        int b = 4;  
       
        //this is program block I am labelling "A"
        System.out.println("Program control is now in block A"); 
        System.out.println("The values of a and b are : "+a +", " +b); 
        System.out.println("Variable a is > b"); 
        System.out.println(); 
        
        if (a > b) { 
            //this is program block I am labelling "B"
            System.out.println("Program control is now in block B"); 
            System.out.println("Program control only gets here if a > b"); 
            System.out.println("The values of a and b are : "+a +", " +b); 
            System.out.println(); 
           }
           else {
            //this is program block I am labelling "C"
            System.out.println("Program control is now in block C"); 
            System.out.println("Program control only gets here if a <= b"); 
            System.out.println("The values of a and b are : "+a +", " +b); 
            System.out.println(); 
        }

        //this is program block I am labelling "D"
        System.out.println("Program control is now in block D"); 
        System.out.println("Let's increase the value of b"); 
        b = 8;
        System.out.println("The values of a and b are : "+a +", " +b); 
        System.out.println("Variable a is < b"); 
        System.out.println(); 

        if (a > b) { 
            //this is program block I am labelling "E"
            System.out.println("Program control is now in block E"); 
            System.out.println("Program control only gets here if a > b"); 
            System.out.println("The values of a and b are : "+a +", " +b); 
            System.out.println(); 
           }
           else {
            //this is program block I am labelling "F"
            System.out.println("Program control is now in block F"); 
            System.out.println("Program control only gets here if a <= b"); 
            System.out.println("The values of a and b are : "+a +", " +b); 
            System.out.println(); 
        }
    }
}
