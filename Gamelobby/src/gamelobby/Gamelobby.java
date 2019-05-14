package gamelobby;





import java.util.*; 

class Gamelobby { 
    private Stack stack;
   private int size;

public Gamelobby(){
    this.stack = new Stack();
}
       
public void start(){
    for(int i=stack.size()-1;i<6;i++){
        Scanner scan = new Scanner(System.in);
            String string = scan.nextLine();
           System.out.println("Enter GamerTag:");
           stack.pop();
}        
    }

   

// driver code 

public static void main(String[] args){       
    Gamelobby lobby=new Gamelobby();
        lobby.start();
        
        
    
    
  
    } 
}


