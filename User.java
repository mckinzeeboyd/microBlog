
import static java.lang.System.out;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class User{
    private String username;
    private int id;
    private String name;
    private String avatar;
    private String email;
    
    
    
    Scanner keyboard = new Scanner (System.in);
    //constructor methods help construct objects and always have the same name as their class
    //constructor methods come by default for all classes in which a constructor is not defined
    
    public User ( String username, int id, String name, String avatar, String email){
    
        this.username=username; //why do we have to call this instance of these variables?
        this.id=id;
        this.name=name;
        this.avatar=avatar;
        this.email=email;
        
        
    
    
    // include web avatar for picture

    
}

public void printUser()
{
    out.println(id + ":" + username);
    
    
    out.println(name);
    out.println(avatar);
    out.println(email);
}
}
