package br.com.usjt.exercicio5.item1;

public class TesteIOFacade {
	public static void main(String[] args) {
		IOFacade facade = new IOFacade();
		byte[] byteArray = {1,2,3,4,5,6,7,8,9,10};
		facade.criarArquivoBinario("facade.bin", byteArray);
		facade.lerArquivoBinario("facade.bin");
		
		facade.criarArquivoTexto("facade.txt", "12345678910");
		facade.lerArquivoTexto("facade.txt");
		
	}
}
