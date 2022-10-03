package com.properties;

public class FileReaderManager {
	private FileReaderManager() {
		// TODO Auto-generated constructor stub
	}
	public static FileReaderManager getinstance() {
		FileReaderManager helper=new FileReaderManager();
		return helper;
	}
	public ConfigurationReader getinstanceCR() throws Throwable {
		ConfigurationReader reader=new ConfigurationReader();
		return reader;

	}

}
