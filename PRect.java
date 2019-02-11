/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author theblackdevil
 */
public class PRect {
    double length,width,hight;
    String name;
public PRect(){
    
}

public PRect(String name,double length,double width,double hight){
this.name=name;
this.length=length;
this.width=width;
this.hight=hight;
}

double getHight(){
    return (double)this.hight;
}

double getLength(){
    return (double)this.length;
}

String getName(){
   return this.name; 
}

double getWidth(){
    return (double)this.width;
}

double getBArea(){
return (double)(this.getLength()*this.getWidth());
}

double getSArea(){
return (double)(this.getHight()*this.getBCircum());
}

double getTArea(){
return (double)(this.getSArea()+(this.getBArea()*2));
}

double getBCircum(){
    return (double)(2*(this.width+this.length));
}

double getTSize(){
return (double)(this.getLength()*this.getWidth()*this.getHight());
}

    @Override
    public String toString(){
return "PRect : "+this.getName()+", Area : "+this.getTArea()+", Size : "+this.getTSize();
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        PRect prects[]=new PRect[5];
        double min=Double.MAX_VALUE,max=Double.MIN_VALUE;
        PRect minPRect=null,maxPRect=null;
        for(int i=1;i<=5;i++){
            System.out.println("Enter PRect #"+i+" specs\nLength.\nWidth\nHight");
            prects[i-1]=new PRect(i+"",scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
            if(prects[i-1].getTArea()>max){
            max=prects[i-i].getTArea();
            maxPRect=prects[i-1];
            }
            if(prects[i-1].getTArea()<min){
            min=prects[i-i].getTArea();
            minPRect=prects[i-1];
            }
        }
        
        for(int i=0;i<4;i++){
            if(prects[i].getTSize()<prects[i+1].getTSize()){
                PRect temp=prects[i];
                prects[i]=prects[i+1];
                prects[i+1]=temp;
            }
        }
        
        System.out.println("Min : "+minPRect+"\nMax : "+maxPRect+"\nSorted ASC Volumes"+Arrays.toString(prects));
    }
    
}
