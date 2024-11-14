//UNSOLVED YET

public class Main {
  public static String checkPalindrome(int start,int end,char[] inputChar, int k, int numberOfProcess, int ctr){
       	String returnValue = "";
        
        //check apakah angka start dan end sama
        if(inputChar[start]!=inputChar[end] || k>0){
        	//tidak sama, ubah value bila k tersedia
            if(inputChar[start]>inputChar[end]){
            	inputChar[end]=inputChar[start];
            }else if(inputChar[start]<inputChar[end]){
            	inputChar[start]=inputChar[end];
            }
            k--;
        }else if(inputChar[start]!=inputChar[end] && k<0){
        	return String.valueOf("-1");
        }
        
        if(numberOfProcess>0 && k>0){
        	returnValue = checkPalindrome((start+1),(end-1),inputChar,k,(numberOfProcess-1),(ctr+1));
            if(!returnValue.equals("-1")){
        		returnValue = String.valueOf(inputChar);
        	}
        }
        
        return returnValue;
  }
  
  public static void main(String[] args) {
  	 String inputString = "53428";
     int ctr = 0;
     int k = 2;
     int numberOfProcess = inputString.length()/2;
     
     char[] inputChar = inputString.toCharArray();
     
     String palindrome = checkPalindrome(
     	0,
        (inputString.length()-1),
        inputChar,
        k,
        (numberOfProcess-1),
        ctr
     );
     
     System.out.println("Output : " + palindrome);
  }
}
