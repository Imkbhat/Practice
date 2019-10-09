package com.kiran.designpatterns.breaksingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import com.kiran.designpatterns.Singleton;
import com.kiran.designpatterns.SingletonSerial;

public class Serialization {

	public static void main(String[] args) {
		SingletonSerial singleton1 = SingletonSerial.getInstance();
		
		try {
			ObjectOutput os = new ObjectOutputStream(new FileOutputStream("abc.ser"));
			os.writeObject(singleton1);
			os.close();
			
			ObjectInput is = new ObjectInputStream(new FileInputStream("abc.ser"));
			SingletonSerial singleton2 = (SingletonSerial)is.readObject();
			is.close();
			
			System.out.println(singleton1);
			System.out.println(singleton2);
			
			System.out.println(singleton1.equals(singleton2));
			
		} catch(Exception ex) {
			
		}
	}

}
