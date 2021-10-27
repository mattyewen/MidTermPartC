import java.util.Scanner;
package midtermexam_versiona_extensioncode;

/**
 *
 * @author Matthew
 */
public class TestUserProfile {
    
    public static void main (String[] args){
        /*
        The user will enter their name and choose their favourite Genre from 
        a displayed list of the possible Genres. The user will then see a message 
        that their userProfile was created.
        */
        Scanner scan = new Scanner(System.in);       
        System.out.println("Enter your Name: ");
        String userName = scan.nextLine();
        System.out.println("Select your favourite genre:\n1)Comedy\n2)Drama"
                +  "\n3)Action\n4)Mystery");
        int userGenre = scan.nextInt();
        System.out.println("Success! Your profile was created");
    }
    
}
