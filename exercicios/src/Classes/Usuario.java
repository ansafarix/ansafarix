package Classes;

public class Usuario {

	String nome;
	String email;
	
	
	public Usuario(String string) {
		// TODO Auto-generated constructor stub
	}

	public boolean equals(Object objeto) {
		
		
		if (objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;
		
		
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
		
			return nomeIgual && emailIgual;
	
		}else {
			return false;
		}
		
		//na proxima aula

		
		}
		
	public int hashCode() {
		return 0;	
		}
}
