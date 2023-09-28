package co.edu.uniquindio.subastasQuindio.model;

import co.edu.uniquindio.subastasQuindio.model.services.IUsuario;

public abstract class Usuario extends Persona implements IUsuario{

	public String nomberUsuario;
	public String contraseña;
	public String IDUsuario;


	public int usuarioHashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((IDUsuario == null) ? 0 : IDUsuario.hashCode());
		result = prime * result + ((contraseña == null) ? 0 : contraseña.hashCode());
		result = prime * result + ((nomberUsuario == null) ? 0 : nomberUsuario.hashCode());
		return result;
	}


	public boolean usuarioEquals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (IDUsuario == null) {
			if (other.IDUsuario != null)
				return false;
		} else if (!IDUsuario.equals(other.IDUsuario))
			return false;
		if (contraseña == null) {
			if (other.contraseña != null)
				return false;
		} else if (!contraseña.equals(other.contraseña))
			return false;
		if (nomberUsuario == null) {
			if (other.nomberUsuario != null)
				return false;
		} else if (!nomberUsuario.equals(other.nomberUsuario))
			return false;
		return true;
	}


	public String getNomberUsuario() {
		return nomberUsuario;
	}


	public void setNomberUsuario(String nomberUsuario) {
		this.nomberUsuario = nomberUsuario;
	}


	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}


	public String getIDUsuario() {
		return IDUsuario;
	}


	public void setIDUsuario(String iDUsuario) {
		IDUsuario = iDUsuario;
	}


}
