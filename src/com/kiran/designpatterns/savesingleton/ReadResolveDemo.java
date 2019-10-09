package com.kiran.designpatterns.savesingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import com.kiran.designpatterns.SerialReadResolveSingleton;

public class ReadResolveDemo {

	public static void main(String[] args) {
		SerialReadResolveSingleton singleton1 = SerialReadResolveSingleton.singleton;
		
		try {
			ObjectOutput os = new ObjectOutputStream(new FileOutputStream("def.ser"));
			os.writeObject(singleton1);
			os.close();
			
			ObjectInput is = new ObjectInputStream(new FileInputStream("def.ser"));
			SerialReadResolveSingleton singleton2 = (SerialReadResolveSingleton)is.readObject();
			is.close();
			
			System.out.println(singleton1);
			System.out.println(singleton2);
			
			System.out.println(singleton1.equals(singleton2));
			
		} catch(Exception ex) {
			
		}
	}

}
