import java.io.*;
import java.util.*;
import java.lang.Math;
class prog6{
	public static void main(String args[])throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter radius of circle:");
		float r= Float.parseFloat(br.readLine());
		float area=(pi/4)*r*r;
		System.out.println("Area of circle:"+area);
}}