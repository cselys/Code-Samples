package com.rajan.crackingcoding.ch4;

//import 

public class Node<T>{
	public T data;
	public Node<T> next;

	public Node(){
		next = null;
	}

	public Node(T val){
		data = val;
		next = null;
	}
}
