package com.bitlabs.ProductInfo;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int pid,price,quantity;
        String pname;
        Dao d=new DaoImpl();
        ProductInfo pi=new ProductInfo();
        Scanner sc=new Scanner(System.in);
        
        boolean pro=true;
        try {
        	while(pro) {
        		System.out.println("1 for insert\n 2 for searchById\n 3 for viewAll and 4 for exit");
        		System.out.println("Enter choose for menu");
        		int choose=sc.nextInt();
        		switch(choose) {
        		case 1:
        		System.out.println("enter product id");
        		int pid1=sc.nextInt();
        		pi.setPid(pid1);
        		System.out.println("enter product price");
        		int price1=sc.nextInt();
        		pi.setPrice(price1);
        		System.out.println("enter product quantity");
        		int quantity1=sc.nextInt();
        		pi.setQuantity(quantity1);
        		System.out.println("enter product name");
        		String name=sc.next();
        		pi.setPname(name);
        		d.insert(pi);
        		break;
        		case 2:
        			System.out.println("enter product id");
        			int pn=sc.nextInt();
        			d.searchById(pn);
                    
        			break;
        		case 3:
        			d.viewAll();
        			break;
        			default:
        				pro=false;
        				break;
        		}
        		
        		
        	}
        }
        catch(Exception e) {
        	System.out.println(e);
        }
    }
}
