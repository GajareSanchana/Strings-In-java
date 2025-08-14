//input a string and update all the even positions in the string to character 'a'. consider 0-based indexing

public class updateEvenPositionString{
    public static void main(String[] args) {
      String s="Physics Wallah Skills"; 
      String str="";
      for(int i=0;i<s.length();i++){
        if(i%2==0)str+='a';
        
        else str+=s.charAt(i);
        }
        s=str;
        System.out.println(s);
      } 
    }
