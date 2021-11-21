package Stack_Ejercicios;

public class Stack<E> {// usar clases genericas 

    private class Nodo{
        public E valor;
        public Nodo siguiente;

        public Nodo(E val, Nodo sig){
            this.valor = val;
            this.siguiente = sig;
        }
    }

    private Nodo tope;

    public boolean empty(){
        return this.tope == null;
    }
    public Stack(){
        this.tope = null;
    }
    public void push(E elemento){
        Nodo temporal = new Nodo(elemento, this.tope);
        tope = temporal;
    }
    public void pop(){
        if (tope!=null){
            tope = tope.siguiente;
        }
    }
    public E peek(){
        return tope == null ? null : this.tope.valor;
    }

}