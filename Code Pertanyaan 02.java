import java.util.Stack;

public class Main {
  
  public static boolean checkBalance(String processedInputString){
  	char[] inputChar = processedInputString.toCharArray();
  
    Stack stack = new Stack();
    
    //loop inputed char
    for(int i=0;i<inputChar.length; i++){
        char curr = inputChar[i];
        
        if(stack.isEmpty()){
        	return false;
        }
        
        if(curr=='('|| curr=='['|| curr=='{'){
        	stack.push(curr);
            continue;
        }
        
        char pop;
        switch(curr){
        	case ')':
           		pop = (char)stack.pop();   
                if(pop=='{'|| pop=='[')   
                    return false;   
                break;  
            case ']':
            	pop = (char)stack.pop();   
                if(pop=='('|| pop=='{')   
                    return false;   
                break;
            case '}':
            	pop = (char)stack.pop();   
                if(pop=='('|| pop=='[')   
                    return false;   
                break;
        }
    }
    return true;
  }
  
  public static void main(String[] args) {
  	String inputString = "{ ( ( [ ] ) [ ] ) [ ] } ]";
    System.out.println("Input : " + inputString);
    String processedInputString = inputString.replaceAll("\\s","");
  	
    if(checkBalance(processedInputString)){
    	System.out.println("Output : YES");
    }else{
    	System.out.println("Output : NO");
    }
  }
}
