package examen.task;

import java.io.File;

import examen.task.strategy.ArchiverStrategy;
import examen.task.strategy.impl.ZIPArchiverStrategy;


public class Archiver {
	private File file;
	
	private ArchiverStrategy defaultStrategy = new ZIPArchiverStrategy();
	
	public Archiver(File file) {
		this.file = file;
	}
	
	public File execute() {
		if (file != null) {
			return defaultStrategy.archive(file);
		} else {
			System.out.println("File for archiving cannot be null!");
			return null;
		}
	}

	public File execute(ArchiverStrategy strategy) {
		if (file != null) {
			if (strategy != null) return strategy.archive(file);
			else return defaultStrategy.archive(file);
		} else {
			System.out.println("Файл для архивации не может иметь значение Null!");
			return null;
		}
	}
}
