import static java.lang.System.out;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class MicroBlog
{

    public static void main(String[]args)
    {
        Scanner keyboard=new Scanner(System.in);

        out.println("Welcome!");
        int id;

        

        User [] users= new User[5];
        users [0] = new User ("mcnzbyd", 0, "McKinzee Boyd", "www.blah.com", "mckinzeelboyd@gmail.com");
        users [1] = new User ("maeby" , 1,  "Mae Gawat", "www.blahblah.com", "maegawat@yahoo.com");
        users [2] = new User ("nelly1", 2, "Nelly Robertson", "www.blablabla.com", "nelly1@gmail.com");
        users [3] = new User ("mnelson", 3, "Michele Nelson", "www.abc.com", "michelenelson@gmail.com");
        users [4] = new User ("jondoe" , 4, "John Doe", "www.madeup.com" , "johndoe@yahoo.com");
        
        String post1="";//=keyboard.nextLine();
        String post2="";//=keyboard.nextLine();
        String post3="";//=keyboard.nextLine();
        String post4="";//=keyboard.nextLine();
        String post5="";//=keyboard.nextLine();

        Post [] posts = new Post[5];
        posts[0] = new Post (post1, 1);
        posts[1] = new Post (post2, 2);
        posts[2] = new Post (post3, 3);
        posts[3] = new Post (post4, 4);
        posts[4] = new Post (post5, 5);


    
        Boolean keepGoing = true;

        while (keepGoing)

        {
            
            
            
            
            
            for(int i=0; i<posts.length; i++)
            {
               out.println("Hello, please type in your user ID number.");
            
            
            id=keyboard.nextInt();
            users [id].printUser(); 
            out.println("");
            
            out.println("Enter Post");
            
            
              posts[i].getMessage();  
                
            }
            //How to print user [id] array?

            keyboard.nextLine();
            out.println("");

            
            
            //enter line to properly allow input from post1
            //post1=keyboard.nextLine();


        }
        
        // Real First and Last name
    
        //ArrayList Post = new ArrayList();

   
    
        // Username

        // formatting : @username     First Last     email@address.com
        // date, time

        
        
        // 5 total post from 3 different users
        // should have an array of posts in main();
        // loop through posts and print each one to screen
        // after posts printed, print what you know about user

    }

}