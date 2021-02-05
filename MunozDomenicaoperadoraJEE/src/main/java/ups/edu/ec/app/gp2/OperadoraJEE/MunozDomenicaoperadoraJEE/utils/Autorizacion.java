package ups.edu.ec.app.gp2.OperadoraJEE.MunozDomenicaoperadoraJEE.utils;

public class Autorizacion {
	
	private String cedula_cliente;
	private int numero_factura;
	private double valor_factura;
	private String clave_acceso;
	
	
	public String getCedula_cliente() {
		return cedula_cliente;
	}
	public void setCedula_cliente(String cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}
	public int getNumero_factura() {
		return numero_factura;
	}
	public void setNumero_factura(int numero_factura) {
		this.numero_factura = numero_factura;
	}
	public double getValor_factura() {
		return valor_factura;
	}
	public void setValor_factura(double valor_factura) {
		this.valor_factura = valor_factura;
	}
	public String getClave_acceso() {
		return clave_acceso;
	}
	public void setClave_acceso(String clave_acceso) {
		this.clave_acceso = clave_acceso;
	}
	
	
	

}
