package com.excercise26streams.app;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Scanner;

public class WriterApp {

	public static void main(String[] args) 
	{
		
		final int LIMIT =24;
		
		File myFile = null;
		FileWriter myWriter = null;
		BufferedWriter myBuffer = null;
		Scanner input = new Scanner (System.in);
		int table= 0;
		
		
		try 
		{
			myFile = new File ("c:\\a\\b.txt");
			myWriter = new FileWriter(myFile);
			myBuffer = new BufferedWriter(myWriter);
			System.out.println("Input the multiplication table:");
			table = input.nextInt();
			for(int i=0;i<=LIMIT;i++)
			{
				System.out.println(String.format("%d X %d = %d",table,i,table*i));
				myBuffer.write(String.format("%d X %d = %d %n",table,i,table*i));
			}
			//.write("El Macho");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				myBuffer.close();
				myWriter = null;
				myFile = null;	
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
