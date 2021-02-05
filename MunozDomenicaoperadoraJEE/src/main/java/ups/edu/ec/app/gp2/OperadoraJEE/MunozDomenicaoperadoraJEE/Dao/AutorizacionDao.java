package ups.edu.ec.app.gp2.OperadoraJEE.MunozDomenicaoperadoraJEE.Dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;


import ups.edu.ec.app.gp2.OperadoraJEE.MunozDomenicaoperadoraJEE.utils.Autorizacion;

public class AutorizacionDao {
	
	@Inject
	private Connection con;
	@Inject
	private EntityManager em;
	
	
   public boolean insert(Autorizacion entity) {
	   em.persist(entity);
	return true;
	   
   }
   
  public void update(Autorizacion auto) throws SQLException {
	  em.merge(auto);
	  
  }
  
  public List<Autorizacion>getCajero(int codigo) throws SQLException{
	  String jpql="select c from Cajero c where c.cedula=?";
	  Query q= em.createQuery(jpql, Autorizacion.class);
	  q.setParameter(1, codigo);
	  
	return (List<Autorizacion>)q.getResultList();
	  	  
  }
 public Autorizacion  read(int codigo)throws SQLException {
	return em.find(Autorizacion.class, codigo);
	 
 }

}
