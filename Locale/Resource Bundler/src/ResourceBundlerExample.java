import java.util.Locale;
import java.util.ResourceBundle;
public class ResourceBundlerExample {
public static void main(String[] args) {
	
String lang="sq";
String country="AL";

Locale l=new Locale(lang,country);
ResourceBundle r=ResourceBundle.getBundle("ApplicationResources_sq_AL",l);

String Str=r.getString("hello");
System.out.println("In albanian Hello means="+Str);




}
}