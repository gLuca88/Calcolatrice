package GianlucaJunitProject.Calcolatrice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SommaTest {
	// all'interno di questa classe noi andiamo a creare degli scenari
	// gli scenari sono metodi annotati con l'annotation tes

	// conteggiamo il num di test
	private static int countTest = 0;

	@BeforeClass
	public static void inizioEsecuzioneTestUnita() {
		System.out.println("Inizio dei test dell'unita SOMMA" + "\n");
		countTest = 1;
	}

	@Before
	public void inzioEsecuzioneMetodo() {
		System.out.println("inizio esecuzione test n " + countTest + "\n");
	}

	@Test
	public void scenarioUnoSommaTest() throws ErroreCalcolatriceException {
		Calcolatrice c1 = new Calcolatrice();
		assertEquals("Result", 5.0, c1.somma(2.0, 3.0));

	}// chiusura 1 scenario

	// scenario dove passiamo un valore null
	// deve generare un eccezione abbiamo creato la classe
	// ErroreCalcoltriceException
	@Test(expected = ErroreCalcolatriceException.class)
	public void scenarioDueSommaTest() throws ErroreCalcolatriceException {
		Calcolatrice c1 = new Calcolatrice();
		assertEquals("Result", 5.0, c1.somma(null, 3.0));
	}

	@Test(timeout = 5000) // deve eseguire il metodo entro 5 secondi
	public void scenarioTreSommaTest() throws ErroreCalcolatriceException {
		Calcolatrice c1 = new Calcolatrice();
		assertEquals("Result", 5.0, c1.somma(2.0, 3.0));
	}

	@After
	public void fineEsecuzioneMetodo() {
		System.out.println("fine esecuzione test n " + countTest + "\n");
		countTest++;
	}

	@AfterClass
	public static void fineEsecuzioneTestUnita() {
		System.out.println("fine dei test dell'unita SOMMA" + "\n");

	}

}// chiusura classe
