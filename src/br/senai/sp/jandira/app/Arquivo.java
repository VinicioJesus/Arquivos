package br.senai.sp.jandira.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {

	public boolean escrever(String caminho, String conteudo) {

		try {

			FileWriter arquivo = new FileWriter(caminho);
			PrintWriter gravarArquivo = new PrintWriter(arquivo);
			
			//append ele escreve um tanto de dados
			gravarArquivo.append(conteudo);
			gravarArquivo.close();

			return true;

		} catch (IOException e) {

			System.out.println("ERRO: " + e.getMessage());
			return false;

		}

	}

	// LÊ OS DADOS DO ARQUIVO
	public String ler(String caminho) {

		String conteudo = "";

		// RECUPERA OS DADOS DO ARQUIVO E ARMAZENA EM MEMORIA PARA A MANIPULAÇÃO
		try {
			// ABRE O ARQUIVO
			FileReader arquivo = new FileReader(caminho);
			// ARMAZENA O CONTEUDO DO ARQUIVO EM MEMÓRIA
			BufferedReader conteudoArquivo = new BufferedReader(arquivo);
			
			//RECUPERA OS DADOS DO ARQUIVO
			try {
			String linha = "";
			
			linha = conteudoArquivo.readLine();
			while(linha != null) {
				
				//conteudo = conteudo + linha;
				conteudo += linha ;
				
				linha = conteudoArquivo.readLine();
			}
			
			conteudoArquivo.close();
			return conteudo;
			}catch (IOException e) {
				
				System.out.println("ERRO: " + e.getMessage());
				return "";
			}
			
			
		} catch (FileNotFoundException e) {
			
			
			System.out.println("ERRO: " + e.getMessage());
			return conteudo;
			
		}

	}
}
