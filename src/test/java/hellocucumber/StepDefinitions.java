package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

	private BufferAcotado<Integer> b; //, bVacio;
	private int sizeB, sizeC;

	@Given("Creo un buffer")
	public void init() {
		b = new BufferAcotado<Integer>(5);
	}

	// Excepcion al crear el buffer con una capacidad negativa
	@When("La capacidad es negativa")
	public void bufferNeg() {

	}

	@Then("Lanza la excepcion IllegalArgument")
	public void IllegalArgument() {
		assertThrows(IllegalArgumentException.class, () -> {
			new BufferAcotado<Integer>(-5);
		});
	}

	// Comprobamos el metodo put
	@When("Insertamos un objeto {int}")
	public void put(int a) {
		sizeB = b.size();
		b.put(a);
		
	}

	@Then("Aumenta el tamaño")
	public void bufferSize() {
		Assertions.assertEquals(sizeB+1, b.size());
	}
	
	//Se lanza una excepcion si intentamos introducir en un buffer lleno
	@When("Buffer esta lleno")
	public void llenarBuffer() {
		for (int i = 0; i < 5; i++) {
			b.put(i);
		}
	}
	
	@Then("Se lanza una excepcion")
	public void LlenoException() {
		Assertions.assertThrows(IllegalStateException.class, () -> b.put(1));
	}
	
	//Si el buffer esta lleno devuelve true, sino false
		@Then("Esta lleno")
		public void isFull() {
			Assertions.assertTrue(b.isFull());
		}
	
	//Comprobamos el metodo get
	@When("Sacamos un numero")
	public void get() {
		sizeC = b.size();
		b.get();
	}
	
	@Then("Se decrementa el tamaño")
	public void getSize() {
		Assertions.assertEquals(sizeC-1, b.size());
	}
	
	//Excepcion si hacemos get y esta  vacio
	@When("Sacamos un numero pero el buffer esta vacio")
	public void vaciar() {
		
	}
	
	@Then("Se lanza excepcion")
	public void vacioExcepction() {
		Assertions.assertThrows(IllegalStateException.class, () -> b.get());
	}
	
	@Then("Esta vacio")
	public void isEmpty() {
		Assertions.assertTrue(b.isEmpty());
	}
	

}
