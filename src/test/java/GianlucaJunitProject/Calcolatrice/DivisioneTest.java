package GianlucaJunitProject.Calcolatrice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DivisioneTest {
	private static int countTest = 0;

	@BeforeClass
	public static void inizioEsecuzioneTestUnita() {
		System.out.println("Inizio dei test dell'unita Divisione" + "\n");
		countTest = 1;
	}

	@Before
	public void inzioEsecuzioneMetodo() {
		System.out.println("inizio esecuzione test n " + countTest + "\n");
	}

	@Test
	public void scenarioUnoDivisioneTest() throws ErroreCalcolatriceException {
		Calcolatrice c1 = new Calcolatrice();
		assertEquals("Result", 2.0, c1.divisione(6.0, 3.0));

	}// chiusura 1 scenario

	@Test(expected = ErroreCalcolatriceException.class)
	public void scenarioDueDivisioneTest() throws ErroreCalcolatriceException {
		Calcolatrice c1 = new Calcolatrice();
		assertEquals("Result", 2.0, c1.divisione(null, 3.0));
	}

	@Test(timeout = 5000) // deve eseguire il metodo entro 5 secondi
	public void scenarioTreDivisioneTest() throws ErroreCalcolatriceException {
		Calcolatrice c1 = new Calcolatrice();
		assertEquals("Result", 2.0, c1.divisione(6.0, 3.0));
	}

	@Test(expected = ErroreCalcolatriceException.class)
	public void scnarioQuattroDivisioneTest() throws ErroreCalcolatriceException {
		Calcolatrice c1 = new Calcolatrice();
		assertEquals("Result", 0.0, c1.divisione(10.0, 0.0));
	}

	@After
	public void fineEsecuzioneMetodo() {
		System.out.println("fine esecuzione test n " + countTest + "\n");
		countTest++;
	}

	@AfterClass
	public static void fineEsecuzioneTestUnita() {
		System.out.println("fine dei test dell'unita Divisione" + "\n");
	}

}
