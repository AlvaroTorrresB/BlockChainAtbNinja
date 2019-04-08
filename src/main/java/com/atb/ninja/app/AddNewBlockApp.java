package com.atb.ninja.app;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import com.atb.ninja.domain.Block;
import com.atb.ninja.domain.Data;
import com.atb.ninja.srv.BlockSrv;
import com.atb.ninja.srv.impl.BlockSrvImpl;

public class AddNewBlockApp {

	public static void main(String[] args) {
		
		try
		{
		BlockSrv srv=new BlockSrvImpl();
		//Generacion del bloque 2
		Block block3=new Block();
		    //Asignaci�n del Hash del ultimo bloque de la cadena
			block3.setLinkHash("53d39ae9e5398cae1c83d16993868ab9d06ecb21858e7c6124c633f8adc68521");  
			block3.setData(new Data("REF00004"));   //Asignaci�n de la informaci�n del bloque
			block3=srv.linkBlockToTheChain(block3); //Generaci�n del hash del bloque y vinculaci�n a la cadena
			
		//Sacamos por consola la informaci�n de la cadena
		System.out.println(block3.toString());
		}
		catch (NoSuchAlgorithmException e ) 
		{
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
	}

}
