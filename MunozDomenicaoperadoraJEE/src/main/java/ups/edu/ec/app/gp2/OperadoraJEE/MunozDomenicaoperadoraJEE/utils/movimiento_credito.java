package ups.edu.ec.app.gp2.OperadoraJEE.MunozDomenicaoperadoraJEE.utils;

import java.sql.Date;

public class movimiento_credito {

	private int codigo;
	private String concepto;
	private Date fecha;
	private double importe;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	
}
