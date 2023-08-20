package visao;

import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Paciente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import servicos.PacienteServicos;
import servicos.ServicosFactory;

public class GuiJTableBuscaPacienteTest {

    ArrayList<Paciente> p;
    PacienteServicos ps;

    public GuiJTableBuscaPacienteTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        p = new ArrayList<>();
        ps = ServicosFactory.getPacienteServicos();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void existirPaciente() throws SQLException {
        String query = "Maria";
        p = ps.buscarPacienteFiltro("WHERE NOME LIKE '%" + query + "%'");
        assertNotSame(p.size(), 0);
    }

}
