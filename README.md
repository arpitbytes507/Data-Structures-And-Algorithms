# Java
Java Syntax :
    Every line of code that runs in Java must be inside a class. And the class name should always start with an uppercase first letter.
    Note : (Java is a case-sensitive launguage as Arpit and arpit have two different meanings.)
    Save the file with the class name.
    Java program has class name and that every program must contain main method.

    Note : 1.The curly braces {} marks the beginning and the end of a block of code.
           2.System is a built-in Java class that contains useful members, such as out, which is short for "output". The println() method, short for "print line", is used to print a value to the screen end the statement with ";"(semicolon).

Java Output : 1.use System.out.println -> prints new line
              2.use System.out.print -> to print 
              3.use "" , '' to print string or numbers 
              4.we can also perform the mathematical operation in output

Comments : 1.use // for the single line of comments
           2.use /* */ for the multi-line comments
           
Variables : String : stores text 
            int : stores integer from -123 to 123
            float : stores floating point decimal numbers
            char : store single characters
            boolean : stores values true or false

Declaration of Variables : type variable_name = value; 
                           to print variables directly write in braces the name of variables
                           use / then ' , "" to print

Conditional Statements : 1.if-else : if(condition){
                                       return
                                    }else{
                                        return
                                    }
                        2.elseif : if(consition 1){
                                      return
                                   }else if(condition 2){
                                    return;
                                   }
                        3.Ternary operator : variable = (condition) ? true : false;

Loops : they execute the block of code until the condition is true
    1. while : while(condition){
        statement;
    }
    2. do while : do{
        statement;
    }while(condition)
    it executes the code one time if the condition is false also
    3. for : for(statement 1 ; statement 2 ; statement 3){
        Statement 1 is executed (one time) before the execution of the code block.
        Statement 2 defines the condition for executing the code block.
        Statement 3 is executed (every time) after the code block has been executed.
    }
    4. nested loop : loop under loop
    5. for each : for(type variablename : arrayname){
        code to be executed
    }

Switch : we use switch instead of writing too many if..else statement.
    Syntax : switch(expression) {
                case x:
                  // code block
                  break;
                case y:
                  // code block
                  break;
                default:
                  // code block
             } 

Break : It is use to jump out of a loop.
Continue : It is use to skip a specific iteration if the condition occurs is true.
Method : A method is a block of code which only runs when called. They are also known as functions.
         The data is pass in the form of parameters.
         A method must be inside a class.
         public class Main {
            static void myMethod() {
                // code to be executed
            }
         }
         myMethod : It is the name of method.
         static : It implies that method belongs to main class and it's an object.
         void : It means method does not return any value.
        After this then call that method.
Parameters : Information can be passed to methods as a parameter. Parameters act as variables inside the method.When a parameter is passed to the method, it is called an argument.
You can have as many parameter as you want.

Method Overloading : Multiple methods have same name but different parameters.
Scope : variables are only accessible inside the region they are created. This is called scope.
Scanner : The scanner class is use to get user input and it is use in java.util package.
          To use it define the object of the scanner class and then use it.
