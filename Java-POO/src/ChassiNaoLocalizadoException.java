
public class ChassiNaoLocalizadoException extends Exception{
	private long chassiNaoLocalizado = 0;
	
	public long getchassiNaoLocalizado() {
		return chassiNaoLocalizado;
	}
	public ChassiNaoLocalizadoException(long chassiNaoLocalizado) {
		super("Erro : tentativa de chassi nao localizado");
		this.chassiNaoLocalizado = chassiNaoLocalizado;
	}

}
