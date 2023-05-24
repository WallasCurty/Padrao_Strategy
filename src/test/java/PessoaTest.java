import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {
    @Test
    void deveCalcularSalarioClinico() {
        Pessoa pessoa = new Pessoa();
        pessoa.salarioClinico(3000.0f, 20.0f);
        assertEquals(60000.0f, pessoa.getSalarioTotal());
    }

    @Test
    void deveCalcularSalarioPediatra() {
        Pessoa pessoa = new Pessoa();
        pessoa.salarioPediatra(3000.0f, 20.0f);
        assertEquals(75000.0f, pessoa.getSalarioTotal());
    }

    @Test
    void deveCalcularSalarioCirurgia() {
        Pessoa pessoa = new Pessoa();
        pessoa.salarioCirugia(3000.0f, 20.0f);
        assertEquals(84000.0f, pessoa.getSalarioTotal());
    }
}
