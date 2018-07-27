package com.java.annotation;

import java.lang.annotation.Annotation;

public class ClassAnnotation {

	public static void main(String[] args) {
		getClassAnnotation();
		getClassAnnotationWithName(MyAnnotation.class);
		
	}

	private static void getClassAnnotationWithName(Class<MyAnnotation> class1) {
		Class aClass = TheClass.class;
		Annotation annotation = aClass.getAnnotation(MyAnnotation.class);
		System.out.println("  Class Annotation by Name ");
		if(annotation instanceof MyAnnotation){
		    MyAnnotation myAnnotation = (MyAnnotation) annotation;
		    System.out.println("name: " + myAnnotation.name());
		    System.out.println("value: " + myAnnotation.value());
		}
		
	}

	private static void getClassAnnotation() {
		Class aClass = TheClass.class;
		Annotation[] annotations = aClass.getAnnotations();

		for(Annotation annotation : annotations){
		    if(annotation instanceof MyAnnotation){
		        MyAnnotation myAnnotation = (MyAnnotation) annotation;
		        System.out.println("name: " + myAnnotation.name());
		        System.out.println("value: " + myAnnotation.value());
		    }
		}
	}

}
