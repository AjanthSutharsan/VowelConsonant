import java.util.Scanner;
public class VowelConsonant
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the string for which you want the vowels and consonants counted");
        String CountedThing = input.nextLine();

        int total1=0;
        int total2=0;
        
        
        for(int i=0;i<CountedThing.length();i++) {
            char j = CountedThing.charAt(i);
            
            if(j =='A'||j=='E'||j=='O'||j=='I'||j=='U'||j=='a'||j=='e'||j=='i'||j=='o'||j=='u'){
                total1=total1+1;
            } else if(j!=' ') {
                total2=total2+1;
            }
            
            
        }
        System.out.println("The string you typed in includes "+total1+" vowel(s) and "+total2+" cononant(s).");

    
    }
   

}
