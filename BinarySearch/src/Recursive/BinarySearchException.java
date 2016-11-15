package Recursive;

public class BinarySearchException extends Exception{
	
	/* Constructors*/
	public BinarySearchException(String message){
		super(message);
	}
	
	public BinarySearchException(Throwable throwable){
		super(throwable);
	}
	
	public BinarySearchException(String message, Throwable throwable){
		super(message, throwable);
	}
}
