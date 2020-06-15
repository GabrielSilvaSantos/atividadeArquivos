package view;

import java.io.File;
import java.io.IOException;

import controller.Arquivos;
import interfaces.Leitura;

public class Principal {

	public static void main(String[] args) {
		String path = new File("").getAbsolutePath() + "\\Arquivos";
		String nome = "relatorio";
		Leitura documento = new Arquivos();
		try {
			documento.convertArq(path, nome);
			documento.openFile(path, nome);
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
