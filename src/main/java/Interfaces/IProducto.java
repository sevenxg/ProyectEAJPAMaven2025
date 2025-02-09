package Interfaces;

import java.util.List;

import model.TblProducto;

public interface IProducto {
	// declaramos los m�todos para hacer el CRUD
	void RegistrarProducto(TblProducto tblproducto);
	void ActualizarProducto(TblProducto tblproducto);
	void EliminarProducto(TblProducto tblproducto);
	List<TblProducto> ListadoProducto();
	TblProducto BuscarProducto(TblProducto tblproducto);

} // fin de la interface producto
