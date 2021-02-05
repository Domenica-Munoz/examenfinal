package ups.edu.ec.app.gp2.CajeraJEE.MunozDomenicaCajeraJEE.Dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ups.edu.ec.app.gp2.CajeraJEE.MunozDomenicaCajeraJEE.util.Cajero;

public class CajeroDao {
	@Inject
	private Connection con;
	@Inject
	private EntityManager em;
	
	
   public boolean insert(Cajero entity) {
	   em.persist(entity);
	return true;
	   
   }
   
  public void update(Cajero cajero) throws SQLException {
	  em.merge(cajero);
	  
  }
  
  public List<Cajero>getCajero(String cedula) throws SQLException{
	  String jpql="select c from Cajero c where c.cedula=?";
	  Query q= em.createQuery(jpql, Cajero.class);
	  q.setParameter(1, cedula);
	  
	return (List<Cajero>)q.getResultList();
	  	  
  }
 public Cajero read(String cedula)throws SQLException {
	return em.find(Cajero.class, cedula);
	 
 }
}
