

public class Deque<E> {// usar clases genericas 

    class Nodo{
        public E valor;
        public Nodo siguiente;
        public Nodo anterior;

        public Nodo(E val){
            this.valor = val;
            this.siguiente = this.anterior =null;
        }
    };

    Nodo front;
    Nodo back;

    public Deque(){
    	 front =back = null;
    }
    public boolean empty(){
    	return (front == null); 
    }
    void pushFront(E elemento){
    	  Nodo newNode = new Nodo(elemento);
          if (newNode == null)
            System.out.print("vacio");
          else {
            if (front == null)
              back = front = newNode;

            else {
              newNode.siguiente = front;
              front.anterior = newNode;
              front = newNode;
            }

          }
        }
   void pushBack(E elemento){
    	  Nodo newNode = new Nodo(elemento);
          if (newNode == null)
            System.out.print("vacio");
          else {
            if (back == null)
              front = back = newNode;
              else {
              newNode.anterior= back;
              back.siguiente = newNode;
              back= newNode;
            }
          }
        
    
    }
    public void popFront(){

        if (empty())
          System.out.print("vacio");
         else {
          front = front.siguiente;
          if (front == null)
            back = null;
          else
            front.anterior= null;
        }
      }
    void popBack(){

        if (empty())
          System.out.print("vacio");
        else {

          back = back.anterior;
          if (back == null)
            front = null;
          else
            back.siguiente = null;
        }
        
      }

    public E peekBack(){
    	if (empty())
    		return null;
    	return back.valor;
    }
    public E peekFront(){
    	if (empty())
    		return null;
        return front.valor;
    }
    public static void main(String[] args) {     
    	Deque<Integer> lista = new Deque<Integer>();
    	lista.pushBack(47);
    	lista.pushBack(40);
    	lista.pushBack(7);
    	lista.pushBack(15);
    	lista.pushBack(77);
    	lista.pushBack(41);
    	lista.pushBack(5);
    	lista.pushBack(37);
    	
    	while (!lista.empty()) {
 	 			System.out.print(lista.peekBack() + " ");
 	 			lista.popBack();
 	 		}
 	 
    }

}