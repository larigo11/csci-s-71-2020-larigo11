/******************************************************************************
 * @author  Eric Laribee, erl235@g.harvard.edu, elarib01@gmail.com
 * @since   06/22/2020 <p>
 *
 * class:   CSCI S-71 Assignment 1 <br>
 * desc:    Class definition for a simple Hello World application
 *
 *****************************************************************************/
public class HelloWorld {

    /**
     * main - The application entry.
     * This application is self-contained within main. One or more arguments
     * are accepted from the command line, expecting the user to enter their
     * name.  The application will say "Hello" to the user. The application
     * prints only "Hello" if no arguments are provided.
     * @param args Array of command line argument strings
     */
    public static void main(String[] args) {
        System.out.print("Hello,");
        for (String s : args) {
            System.out.print(' ' + s);
        }
        System.out.print("!\n");
    }
}
