

import org.example.Alimento;
import org.junit.After;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

public class AlimentoTest {
    static Alimento alimento= new Alimento("Arroz", 30);

    @Test
    public void construtor() {
        assertNotNull(alimento);
    }

    @Test
    public void getNutricao() {
        assertEquals(30, alimento.getNutricao());
    }

    @Test
    public void getCodigo() {
        assertDoesNotThrow(() -> alimento.getCodigo());
    }
}