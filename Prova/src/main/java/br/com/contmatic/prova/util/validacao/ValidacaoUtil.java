package br.com.contmatic.prova.util.validacao;

public final class ValidacaoUtil {
	
	private ValidacaoUtil() {
	}
	
	public static void validarNulo(Object campo, String mensagem) {
		if (campo == null) {
			throw new IllegalArgumentException(mensagem);
		}
	}
	
	public static void validarVazio(Object campo, String mensagem) {
		if (campo.toString().trim().isEmpty()) {
			throw new IllegalArgumentException(mensagem);
		}
	}
	
	public static void validarTamanho(String campo, int min, int max, String mensagem) {
		if (campo.length() < min || campo.length() > max) {
			throw new IllegalStateException(mensagem); 
		}
	}
	
}
