package br.com.usjt.exercicio5.item1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class IOFacade {
	public void criarArquivoBinario(String nome, byte[] arquivo) {
		File file = new File(nome);
		FileOutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(file);
			outputStream.write(arquivo);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			 try {
				 outputStream.close();
			 } catch (IOException e) {
				 e.printStackTrace();
			 }
		}
	}
	public void criarArquivoTexto(String nome, String texto) {
		Writer writer = null;
		FileOutputStream file = null;
		try {
			file = new FileOutputStream(nome);
			writer = new BufferedWriter(new OutputStreamWriter(file, "utf-8"));
			writer.write(texto);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			 try {
				 writer.close();
			 } catch (IOException e) {
				 e.printStackTrace();
			 }
		}	
	}
	
	public void lerArquivoBinario(String nome) {
		File file = new File(nome);
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);
			byte[] bytesArray = new byte[(int) file.length()];
			inputStream.read(bytesArray); 
			inputStream.close();
			for (byte b : bytesArray) {
				System.out.println(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void lerArquivoTexto(String nome) {
		BufferedReader reader = null;
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(nome);
			reader = new BufferedReader(new FileReader(nome));
			StringBuilder builder = new StringBuilder();
			String line = reader.readLine();
			while (line != null) {
				builder.append(line);
				builder.append(System.lineSeparator());
		        line = reader.readLine();
		    }
		    String texto = builder.toString();
		    System.out.println(texto);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			 try {
				 inputStream.close();
			 } catch (IOException e) {
				 e.printStackTrace();
			 }
		}
	}
}
