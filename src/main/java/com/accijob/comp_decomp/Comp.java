/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accijob.comp_decomp;

/**
 *
 * @author 100RB
 */
//package comp_decomp;
import java.io.*;
import java.util.*;
import java.util.zip.GZIPOutputStream;

public class Comp {
	public static void method(File file) throws IOException{
		String fileDirectory=file.getParent();
		
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(fileDirectory+"/CompressedFile.gz");
		GZIPOutputStream gzip = new GZIPOutputStream(fos);
		
		byte[] buffer = new byte[1024];
		int len;
		
		while((len=fis.read(buffer))!=-1)
		{
			gzip.write(buffer, 0, len);
		}
		gzip.close();
		fos.close();
		fis.close();
	}
	public static void main(String args[]) throws IOException
	{
		File path = new File("C:\\Users\\100RB\\Downloads\\Compressor\\compressordecompressor\\Testfile");
		method(path);
	}
}
