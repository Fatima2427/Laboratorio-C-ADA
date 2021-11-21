
public class Queue<E> {// usar  generecidad
	    private class Nodo{
	        public E valor;

	        public Nodo siguiente;

	        public Nodo(E val, Nodo sig){
	            this.valor = val;
	            this.siguiente = sig;
	        }
	    }
	    private Nodo front;
	    private Nodo back;

	    public Queue(){
	       front =back = null;
	    }
	    public E peek(){
	        return front.valor;
	    }
	    public void push(E elemento){
	        Nodo temporal = new Nodo(elemento, null);
	        if (back == null){
	            front= back = temporal;
	        }
	        else{
	            back.siguiente = temporal;
	            back= temporal;
	        }
	    }
	    public void pop(){
	        if (front != null) {            
	            front = front.siguiente;
	            if (front == null){
	                back= null;
	            }            
	        }
	    }
	    public boolean empty(){
	        return this.back== null;
	    }

}
