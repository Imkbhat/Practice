package com.kiran.thread.interthreadcommunication;

import java.util.LinkedList;
import java.util.Queue;

public class InterThreadComDemo {
	
	static class Buffer {
		int size;
		Queue<Integer> list = null;
		
		public Buffer(int size) {
			this.size = size;
			list = new LinkedList<Integer>();
		}
		
		public void produce() throws InterruptedException {
			int value = 0;
			while(true) {
				synchronized (this) {
					while(list.size() >= size) {
						wait();
					}
					System.out.println("producer has produced value "+value);
					list.add(value);
					value++;
					
					Thread.sleep(1000);
					notify();
				}
			}
		}
		
		public void consume() throws InterruptedException {
			while(true) {
				synchronized (this) {
					while(list.size() == 0) {
						wait();
					}
					int val = list.poll();
					System.out.println("Consumer has consumed "+val);
					
					Thread.sleep(1000);
					notify();
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Buffer buff = new Buffer(2);
		
		Thread producer = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					buff.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread consumer = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					buff.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		producer.start();
		consumer.start();
		
		producer.join();
		consumer.join();
	}

}
