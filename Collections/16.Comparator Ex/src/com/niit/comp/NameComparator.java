package com.niit.comp;

import java.util.Comparator;

class NameComparator implements Comparator<Student>{  
public int compare(Student s1,Student s2){  
return s1.name.compareTo(s2.name);  
}  
} 

/*This class provides comparison logic based on the name. 
 * In such case, we are using the compareTo() method of String class, 
 * which internally provides the comparison logic.
 */