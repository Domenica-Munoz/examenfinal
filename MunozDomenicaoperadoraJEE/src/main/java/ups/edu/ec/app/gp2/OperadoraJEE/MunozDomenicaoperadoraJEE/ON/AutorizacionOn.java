package ups.edu.ec.app.gp2.OperadoraJEE.MunozDomenicaoperadoraJEE.ON;

import javax.inject.Inject;

import ups.edu.ec.app.gp2.OperadoraJEE.MunozDomenicaoperadoraJEE.Dao.AutorizacionDao;
import ups.edu.ec.app.gp2.OperadoraJEE.MunozDomenicaoperadoraJEE.utils.Autorizacion;
import ups.edu.ec.app.gp2.OperadoraJEE.MunozDomenicaoperadoraJEE.utils.movimiento_credito;

public class AutorizacionOn {
	
	@Inject
	AutorizacionDao daoautorizacion;
	
	int login=0;
	int pass=0;
	int intentos=1;
	int maximo=3;
	
	public void registrarautorizacion(String autorizacion) {
		
		while((login!=1000)||(pass!=1234)&&(intentos<maximo)) {
			
			if(intentos==3) {
				System.out.print("acceso denegado");
				intentos=intentos-maximo;
			}
			intentos++;
		}
	
		System.out.println("acceso dado");
		
	}

	
	
	
	public void ingresar(Autorizacion codigo) {
		daoautorizacion.insert(codigo);
		
	}
	
	
	
	
	
	
}
