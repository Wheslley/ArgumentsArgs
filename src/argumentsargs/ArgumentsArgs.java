package argumentsargs;

/**
 *
 * @author Wheslley Nycolas da Silva
 * @since 01/2018
 */
public class ArgumentsArgs {

    /**
     * @param args the command line arguments
     * @since 01/2018
     */
    public static void main(String[] args) {

        for (String arg : args) {
            System.out.println("Param [" + arg + "]");
        }
        
    }

}
