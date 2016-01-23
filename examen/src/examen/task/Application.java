package examen.task;

import java.io.File;

import examen.task.strategy.ArchiverStrategy;
import examen.task.strategy.impl.RARArchiverStrategy;
import examen.task.strategy.impl.ZIPArchiverStrategy;

public class Application {

	public static void main(String[] args) {
		System.out.println("Application \"Archiver\" started... \n");
		
		
		File fileForArchiving = new File("C:\\test.txt");
		System.out.println("Сжатие для файла:" + fileForArchiving.getAbsolutePath());
		
		Archiver archiver = new Archiver( fileForArchiving );
		ArchiverStrategy zip = new ZIPArchiverStrategy();
		ArchiverStrategy rar = new RARArchiverStrategy();
		
		File archiveByDefStrategy = archiver.execute();
		File archiveByZIP = archiver.execute( zip );
		File archiveByRAR = archiver.execute( rar );
		
		System.out.println("\nApplication \"Archiver\" ended.");
	}
}
