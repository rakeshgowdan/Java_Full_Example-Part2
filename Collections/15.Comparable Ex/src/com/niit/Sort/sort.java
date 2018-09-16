package com.niit.Sort;

import java.util.ArrayList;
import java.util.Collections;

public class sort{  
public static void main(String args[]){  
ArrayList<student> al=new ArrayList<student>();  
al.add(new student(101,"Vijay",23));  
al.add(new student(106,"Ajay",27));  
al.add(new student(105,"Jai",21));  
  
Collections.sort(al);  
for(student st:al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
}  
}  