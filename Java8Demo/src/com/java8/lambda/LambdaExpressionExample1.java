package com.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class LambdaExpressionExample1 {

	public static void main(String[] args) {

		List<Product> list=new ArrayList<Product>();  
        list.add(new Product(1,"Samsung A5",17000f));  
        list.add(new Product(3,"Iphone 6S",65000f));  
        list.add(new Product(2,"Sony Xperia",25000f));  
        list.add(new Product(4,"Nokia Lumia",15000f));  
        list.add(new Product(5,"Redmi4 ",26000f));  
        list.add(new Product(6,"Lenevo Vibe",19000f));  
        
        Stream<Product> flist=list.stream().filter(p->p.price>=25000);
        flist.forEach(p->System.out.println(p));
       
        List<Integer> intList=list.stream().filter(p->p.id<=4).map(p->p.id).collect(Collectors.toList());
     //   jFrameDemo();
       // intList.forEach(i->System.out.println(i));
        
        //Table 
        //Stream.iterate(1,element->element+1).filter(element->element%5==0).limit(10).forEach(System.out:: prinltn));
        Stream.iterate(2, element->element+1).filter(element->element%5==0).limit(10).forEach(System.out::println);
	}

	private static void jFrameDemo() {

		 JTextField tf=new JTextField();  
	        tf.setBounds(50, 50,150,20);  
	        JButton b=new JButton("click");  
	        b.setBounds(80,100,70,30);  
	          
	        // lambda expression implementing here.  
	        b.addActionListener(e-> {tf.setText("hello swing");});  
	          
	        JFrame f=new JFrame();  
	        f.add(tf);f.add(b);  
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	        f.setLayout(null);  
	        f.setSize(300, 200);  
	        f.setVisible(true);  
	}

}
