package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import model.TblProducto;

public class ClassProductoImp implements IProducto {

	@Override
	public void RegistrarProducto(TblProducto tblproducto) {
		// establecemos conexion con la unidad de persistencia
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoEAJPAMaven2025");
		
		// permite gestionar entidades
		EntityManager em=emf.createEntityManager();
		// iniciamos la transacción
		em.getTransaction().begin();
		// registramos
		em.persist(tblproducto);
		// emitimos mensaje por pantalla
		System.out.println("Producto registrado en BD correctamente !!:)");
		// confirmamos
		em.getTransaction().commit();
		// cerramos la transaccion
		em.close();
		
	} // fin del metodo

	@Override
	public void ActualizarProducto(TblProducto tblproducto) {
		// TODO Auto-generated method stub
		
	} // fin del metodo

	@Override
	public void EliminarProducto(TblProducto tblproducto) {
		// TODO Auto-generated method stub
		
	} // fin del metodo

	@Override
	public List<TblProducto> ListadoProducto() {
		// establecemos conexion con la unidad de persistencia
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoEAJPAMaven2025");
		// gestionamos las entidades
		EntityManager em=emf.createEntityManager();
		// iniciamos la transacción
		em.getTransaction().begin();
		// recuperamos el listado de la base de datos
		List<TblProducto> listadoproductos=em.createQuery("select p from TblProducto p", TblProducto.class).getResultList();
		// confirmamos
		em.getTransaction().commit();
		// cerramos
		em.close();
		// retornamos el listado
		return listadoproductos;
	} // fin del metodo

	@Override
	public TblProducto BuscarProducto(TblProducto tblproducto) {
		// TODO Auto-generated method stub
		return null;
	} // fin del metodo

} // fin de la clase
