package org.example;
import java.util.*;
import java.util.logging.Logger;
class Basicpoint implements Cloneable{
    int x;
    int y;
    public Basicpoint(int x, int y){
        this.x=x;
        this.y=y;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public String eqqual(int x1, int y1){

        if(x==x1 && y==y1){
            return "true";
        }
        return "false";
    }
    public static void main(String[] args) throws CloneNotSupportedException{
        Scanner sc=new Scanner(System.in);
        Logger l= Logger.getLogger("com.api.jar");
        l.info("enter the value x:");
        int xaxis=sc.nextInt();
        l.info("enter the value y:");
        int yaxis=sc.nextInt();
        l.info("enter the value x1:");
        int xaxis1=sc.nextInt();
        l.info("enter the value y1:");
        int yaxis1=sc.nextInt();
        l.info("Before cloning:");
        Basicpoint bp=new Basicpoint(xaxis,yaxis);
        String a=bp.eqqual(xaxis1,yaxis1);
        l.info(a);
        l.info("After cloning:");
        Basicpoint bp1=(Basicpoint)bp.clone();
        String b=bp.eqqual(bp1.x,bp1.y);
        l.info(b);
        sc.close();
    }
}