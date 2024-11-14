import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    //INPUTED VALUES
    String inputedString = "abbcccdeefghhiiijjjkkllll";
    List queries = new LinkedList<>();
    queries.add(31);
    queries.add(14);
    queries.add(11);
    queries.add(17);
    queries.add(100);
    
    //OUTPUT VARIABLE
    List answerList = new LinkedList<>();
    
    char curr = '-';
    char prev = '-';
    List weightList = new LinkedList<>();
    List wordsList = new LinkedList<>();
    
    int startIndex =0;
    int endIndex =1;
    System.out.println("Inputed String : " + inputedString);
    System.out.println("queries : " + queries);
    
    for(int i=0; i<inputedString.length();i++){
     	if(i!=0){
        	prev = curr;
        }
        curr = inputedString.charAt(i);
       	
        if(i!=0 && curr!=prev){
            wordsList.add(inputedString.substring(startIndex,(endIndex-1)));
            startIndex=i;
        }
        endIndex++;
        
        if((i+1)==inputedString.length()){
        	wordsList.add(inputedString.substring(startIndex,endIndex-1));
        }
    }
    
  	for(int i=0; i<wordsList.size(); i++){
    	String now = wordsList.get(i).toString();
        char alphabet = now.charAt(0);
        
        int weight = (alphabet-96);
        int totalWeight = weight;
        weightList.add(totalWeight);
        
        for(int j=0; j<(now.length()-1); j++){
        	totalWeight = totalWeight+weight;
            weightList.add(totalWeight);
        }
    }
    //System.out.println("Weight List : " + weightList);
    
    for(int i=0; i<queries.size(); i++){
    	String answer = "No";
    	for(int j=0; j<weightList.size(); j++){
        	if(queries.get(i)==weightList.get(j)){
            	answer = "Yes";
                break;
            }
        }
        answerList.add(answer);
    }
    System.out.println("output : " + answerList);
  }
}
