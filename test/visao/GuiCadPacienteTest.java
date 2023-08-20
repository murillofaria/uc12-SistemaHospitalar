package visao;

import dao.ConvenioDAO;
import java.sql.SQLException;
import modelo.Convenio;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static visao.GuiCadPaciente.isValidEmail;

public class GuiCadPacienteTest {

    Convenio convenio;
    ConvenioDAO convenioDao;

    public GuiCadPacienteTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        convenioDao = new ConvenioDAO();
        convenio = new Convenio();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testarEmail() {
        boolean emailInserido = isValidEmail("teste@gmail.com");
        assertTrue(emailInserido);
    }

    @Test
    public void testarConvenio() throws SQLException {
        convenio = convenioDao.buscarConvenioFiltro("b");
        assertNotNull(convenio);
        System.out.println("Nome do convênio encontrado: " + convenio.getNomeConvenio());
    }

}
