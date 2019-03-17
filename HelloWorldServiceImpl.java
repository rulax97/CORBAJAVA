import java.io.*;
import java.util.*;
//*Autor: Raul Ernesto Perez Barcenas*//
//*Matricula: 148661*//
//*Version: 1.0*//
//*Asignatura: Programacion Integrativa (UACJ)*//
public class HelloWorldServiceImpl extends HelloWorldServicePOA
{
	public HelloWorldServiceImpl()
	{
		super();
	}
	public String message(String msg)
	{
		//return "Hello "+who+" from your friend CORBA server :-)";
		String data="";
		String u_1="",u_2="",u_3="",u_4="",u_5="",u_6="";
		char[] comp = msg.toCharArray();
		int compare = (int) comp[0];
		if(compare==85)
		{
			data=msg;
			try
			{
				u_1=data.substring(0,1);
				u_2=data.substring(1,9);
				u_3=data.substring(9,17);
				u_4=data.substring(17,23);
				u_5=data.substring(23,31);
				u_6=data.substring(31,35);
				BufferedWriter out = new BufferedWriter (new FileWriter("medicion.csv", true));
				out.write(u_1);
				out.write(",");
				out.write(u_2);
				out.write(",");
				out.write(u_3);
				out.write(",");
				out.write(u_4);
				out.write(",");
				out.write(u_5);
				out.write(",");
				out.write(u_6);
				out.write("\n");
				out.close();
			}
			catch (IOException e)
			{
				System.out.println("Excepcion ocurrida: " + e);
			}
		}
		if(compare==82)
		{
			data=msg;
			try
			{
				BufferedWriter out = new BufferedWriter (new FileWriter("transaccion.csv", true));
				out.write(data.substring(0,1));
				out.write(",");
				out.write(data.substring(1,9));
				out.write(",");
				out.write(data.substring(9,17));
				out.write(",");
				out.write(data.substring(17,21));
				out.write("\n");
				out.close();
			}
			catch (IOException e)
			{
				System.out.println("Excepcion ocurrida: " + e);
			}
		}
		return "Esto me enviaste "+msg+". \nAtte. El Servidor de CORBA.";
	}
}
