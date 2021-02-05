package ups.edu.ec.app.gp2.CajeraJEE.MunozDomenicaCajeraJEE.ON;

import java.sql.SQLException;

import javax.inject.Inject;

import ups.edu.ec.app.gp2.CajeraJEE.MunozDomenicaCajeraJEE.Dao.CajeroDao;
import ups.edu.ec.app.gp2.CajeraJEE.MunozDomenicaCajeraJEE.util.Cajero;

public class CajeroON {
	
	@Inject
	private CajeroDao cajerodao;
	
	
private  Cajero buscarcedula(String cedula) throws Exception{
	if(cedula.length() !=10) throw new Exception("numero de cedula");
	try {
	return cajerodao.read(cedula);
	}catch(SQLException e) {
		e.printStackTrace();
		throw new Exception("Error al registrar");
	}
	
	
	
}

}
