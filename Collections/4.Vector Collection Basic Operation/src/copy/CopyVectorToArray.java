package copy;

import java.util.Vector;

public class CopyVectorToArray {
	 public static void main(String a[]){
	        Vector<String> vct = new Vector<String>();
	        vct.add("First");
	        vct.add("Second");
	        vct.add("Third");
	        vct.add("Random");
	        System.out.println("Actual vector:"+vct);
	        String[] copyArr = new String[vct.size()];
	        vct.copyInto(copyArr);
	        System.out.println("Copied Array content:");
	        for(String str:copyArr){
	            System.out.println(str);
	        }
	    }
}
