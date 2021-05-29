package in.ashokit.main;

import in.ashokit.beans.PwdDecoder;
import in.ashokit.beans.PwdEncoder;

public class MyApp 
{
	public static void main(String[] args)
	{
		String encode=PwdEncoder.encode("vamsiraju927@gmail.com");
		System.out.println("Encoded value is:: "+ encode);
		String decode=PwdDecoder.decode(encode);
		System.out.println("Decoded value is ::"+decode);
	}
}
