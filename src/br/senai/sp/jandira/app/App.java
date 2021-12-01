package br.senai.sp.jandira.app;

public class App {

	public static void main(String[] args) {

		String caminho = "C:\\Users\\21276440\\Desktop\\Testearquivos\\Teste.txt";
		String conteudo = "FPOO -  SENAI - DS1T";

		String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam facilisis, lacus in vestibulum vulputate, dolor dolor dapibus eros, vel aliquet ante nulla ac nisl. Praesent condimentum neque augue, at fermentum magna pretium a. Phasellus eget nisi a ligula bibendum molestie. Vivamus eu magna in lectus laoreet elementum quis non orci. Sed accumsan urna sit amet accumsan ornare. Sed non libero rutrum, suscipit elit eget, facilisis diam. Nullam in justo eu purus molestie cursus. Cras sit amet tempus lorem, sed ullamcorper purus. Etiam eget massa tristique purus efficitur tempor. Maecenas sed elementum dolor. Fusce quis porta nisi.";

		System.out.println(caminho);

		Arquivo objArquivo = new Arquivo();
		
		String conteudoArquivo = objArquivo.ler(caminho);
		conteudoArquivo += "\n" + lorem;
		
		objArquivo.escrever(caminho, conteudoArquivo);
		System.out.println(conteudoArquivo);
		
		
	}

}
