import static java.lang.System.out;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Post
{
    private String post;
    private int postOrder;
    private  String addlink;
Scanner keyboard = new Scanner (System.in);
   public Post(String post, int postOrder) {//Display username
   this.postOrder=postOrder;
   this.post=post;
   
   this.addlink=addlink;
   
   
   
       
   // integer for order in which it was posted
  
   // post message
   // any additional links provided by poster
}

public  void getMessage()
{
    post=keyboard.nextLine();
    out.println(postOrder + ":" + post);
    out.println("");
    out.println("Additional Links?");
    addlink=keyboard.nextLine();
    out.println("");
}
}