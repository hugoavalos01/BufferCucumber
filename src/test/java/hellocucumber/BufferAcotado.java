package hellocucumber;
import java.util.ArrayList;
import java.util.List;

/**
 *  Implementacion buffer acotado
 * @author Hugo Avalos de Rorthais
 * @version 1.1
 *
 */
public class BufferAcotado<T> {
	
	private int capacidad;
	private List<T> elements;

	/**
	 * CONSTRUCTOR
	 * @param capacidad :int capacidad del buffer (numero maximo de elementos que puede contener)
	 * @throws IllegalArgumentException if (!capacidad<=0) // precondition
	 */
	public BufferAcotado(int capacidad) {
		if(capacidad <= 0)	throw new IllegalArgumentException("Debe tener al menos un elemento");
		elements = new ArrayList<T>();
		
		this.capacidad=capacidad;
		
	}
	
	/**
	 * Inserts the specified element at the end of the Buffer 
	 * if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available
	 * @param  element :T -- the element to insert
	 * @throws IllegalStateException if the buffer is full.
	 * @post   the size of the buffer is increased by
	 * @post   the new element becomes the last element of the buffer
	 */
	public void put(T element) {
		if(this.isFull()) throw new IllegalStateException("El buffer esta lleno");
		
		elements.add(element);
	}
	
	/**
	 * Retrieves and removes the head of the Buffer
	 * @return :T -- the element that was at the head of the Buffer
	 * @throws IllegalStateException if the buffer is empty -- precondition
	 * @post   the size of the buffer is decreased by 1
	 * @post   buffer@pre = buffer.prepend(result) 
	 */
	public T get() {
		if(this.isEmpty()) throw new IllegalStateException("El buffer esta vacio");
		
		return elements.remove(elements.size()-1);
	}
	
	/**
	 * This is a query operation that returns the number of elements currently in the buffer
	 * @return :int -- elements.size()
	 */
	public int size() {
		return elements.size();
	}
	
	/**
	 * This is a query operation that checks if the buffer is full
	 * @return :boolean -- elements.size()==capacidad
	 */
	public boolean isFull() {
		return elements.size() == capacidad;
	}
	
	/**
	 * This is a query operation that checks if the buffer is empty
	 * @return :boolean -- elements.size()==0
	 */
	public boolean isEmpty() {
		return elements.size() == 0;
	}
}

