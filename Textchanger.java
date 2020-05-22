import java.util.Scanner;
public class Textchanger {
public static void main(String args[]){
Scanner key = new Scanner(System.in);
System.out.print("Paste your text here : ");
String g = key.nextLine();
System.out.print("Find : ");
String h = key.nextLine();
System.out.print("Replace all with : ");
String f = key.nextLine();
System.out.println(g.replace(h,f));


}
}