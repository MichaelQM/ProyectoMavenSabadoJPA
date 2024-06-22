package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.ICliente;
import model.TblCliente;

public class ClassClienteImp  implements ICliente  {

	@Override
	public void RegistrarCliente(TblCliente cliente) {
		//establecer conexion con la unidad de persistencia...
		EntityManagerFactory fabr=Persistence.createEntityManagerFactory("ProyectoMavenSabadoJPA");
	    //permite gestionar entidades
		EntityManager em=fabr.createEntityManager();
		//iniciar transaccion
		em.getTransaction().begin();
		//registramos
		em.persist(cliente);
		//emitimos mensaje por consola
		System.out.println("cliente registrado en la BD correctamente");
		//confirmamos
		em.getTransaction().commit();
		//cerramos la transaccion
		em.close();
	}  //fin del metodo registrar...

	@Override
	public void ActualizarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		
	}   //fin del metodo actualizar cliente..

	@Override
	public void EliminarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		
	}   //fin del metodo eliminar cliente...

	@Override
	public TblCliente BuscarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}  //fin del metodo buscar cliente...

	@Override
	public List<TblCliente> ListadoCliente() {
		// TODO Auto-generated method stub
		return null;
	}   //fin del metodo listado cliente.. 

}
