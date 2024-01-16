package Teoria;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main testing = new Main();
    @org.junit.jupiter.api.Test
    void somma_di_due_integer() {
        Integer result = testing.sum(1, 2);
        assertEquals(3, result, "somma di 1 e 2 deve essere 3;");
    }@org.junit.jupiter.api.Test
    void somma_di_integer_negativo() {
        Integer result = testing.sum(-1, 2);
        assertEquals(1, result, "somma di -1 e 2 deve essere 3;");
    }
    @org.junit.jupiter.api.Test
    void somma_di_null_e_integer() {
        Integer result = testing.sum(null, 2);
        // assertEquals(1, result, "somma di 1 e 2 deve essere 3;");
        assertNull(result, "se uno dei due parametri e' nll, allora il risultato e' null");
    }
    @org.junit.jupiter.api.Test
    void moltiplicazione_di_null_e_integer() {
        Integer result = testing.multiply(1, 2);
        assertEquals(2, result, "moltiplicazione di 1 e 2 deve essere 3;");
        // assertNull(result, "se uno dei due parametri e' nll, allora il risultato e' null");
    }
    @org.junit.jupiter.api.Test
    void moltiplicazione_di_due_integer_non_uno() {
        Integer result = testing.multiply(5, 2);
        assertEquals(10, result, "moltiplicazione di 1 e 2 deve essere 3;");
        // assertNull(result, "se uno dei due parametri e' nll, allora il risultato e' null");
    }
    @org.junit.jupiter.api.Test
    void moltiplicazione_con_null() {
        Integer result = testing.multiply(null, 2);
        // assertEquals(10, result, "moltiplicazione di 1 e 2 deve essere 3;");
         assertNull(result, "moltiplicazione con null deve ritornare null");
    }

}