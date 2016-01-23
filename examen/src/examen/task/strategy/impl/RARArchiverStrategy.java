package examen.task.strategy.impl;

import java.io.File;

import examen.task.strategy.ArchiverStrategy;


public class RARArchiverStrategy implements ArchiverStrategy {

	@Override
	public File archive(File file) {
		System.out.println("Система выполняет сжатие по алгоритму RAR");
		
		return file;
	}
}
