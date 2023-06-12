package kernel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class ProcessControlBlock {
	private ProcessState state;
	private int priority;
	
	private ArrayList<String> associatedFiles = new ArrayList<String>();
	
	
	public ProcessControlBlock () {
		this.state = ProcessState.NEW;
		associatedFiles = new ArrayList<String>();
		
	}
	
	
	
	public ArrayList<String> getAssociatedFiles() {
		return associatedFiles;
	}

	public void addToAssociatedFiles(String s) {
		this.associatedFiles.add(s);
	}
	
	public ProcessState getProcessState() {
		return state;
	}
	
	public void setProcessState(ProcessState state) {
		this.state = state;
	}
	
	public int getPriority() {
		return priority;
	}
	

	

	
	

}
