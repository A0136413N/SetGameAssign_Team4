/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setgame_assignment_team4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author SA_Team04 
 */
public class SetGame_Assignment_Team4 {

    static ArrayList<Cards> cardList;
     static Cards[] cardList1;
     
    public static void main(String[] args) throws IOException {
        
    String[] shape={"Oval    ","Squiggle","Diamond "};
    String[] shading={"Solid   ","Striped ","Outlined"};
    String[] color={"Red   ","Purple","Green "};
    Integer[] number={1,2,3};
    Cards c;
    //HashMap<Integer,Cards> h=new HashMap<Integer,Cards>();
   
       cardList=new ArrayList<>();
       cardList1=new Cards[12];
     
    for(int i=0;i<shape.length;i++)
    {
        for(int j=0;j<shading.length;j++)
        {
            for(int k=0;k<color.length;k++)
            {
               for(int n=0;n<number.length;n++)
               {
              //for(int i=0;i<3;i++)
               c=new Cards(shape[i],shading[j],color[k],number[n]);
               cardList.add(c);
               
            }
            }
        }
        
    }
    //Collections.shuffle(cardList); this is collection shuffle.
    
  Random random1 = new Random();
for (int b = cardList.size() - 1; b >= 0; b--) {
    int j = random1.nextInt(b + 1);

    /* swap cards i,j */
    Cards card = cardList.get(b);
    cardList.set(b, cardList.get(j));
    cardList.set(j, card);
}
   /* for(Cards card  : cardList)
    {
        System.out.println("Here you are : "+card);
    } */
    for(int i=0;i<12;i++)
{
    
    /*System.out.print(i+1+" "+cardList.get(i));
    System.out.println();
    h.put(i+1,cardList.get(i));
    cardList.remove(i);
    /*cardList1.add(cardList.get(i));
    System.out.println(i+1+" "+cardList.get(i));
    Cards ca=(Cards)cardList.get(i);
    cardList.remove(ca);*/
    
    //System.out.print(i+1+" "+cardList.get(i));
    //System.out.println();
    cardList1[i]=cardList.get(i);
    cardList.remove(i);
}
    /* HashMap 
    for(int i=0;i<12;i++)
    {
        //System.out.print(i+1+" "+cardList.get(i));
        //System.out.println();
        h.put(i,cardList.get(i));
        cardList.remove(i);
    }*/

   
   /*HashMap
    for(int i=0; i<h.size();i++)
    {
        if(i%3==0)
            System.out.println("\n");
      
        System.out.print("<");
        System.out.print(i+1);
        System.out.print("> ");
        System.out.print(h.get(i).getShape()+"\t"+h.get(i).getShading()+"\t"+h.get(i).getColor()+"\t"+h.get(i).getNumber()+"\t\t");
        
    }*/
       
    for(int i=0; i<cardList1.length;i++)
    {
        if(i%3==0)
            System.out.println("\n");
      
        System.out.print("<");
        System.out.print(i+1);
        System.out.print("> ");
        System.out.print(cardList1[i].getShape()+"\t"+cardList1[i].getShading()+"\t"+cardList1[i].getColor()+"\t"+cardList1[i].getNumber()+"\t\t");
        
    }
    System.out.println("\n\n");
    
   while(!cardList.isEmpty())
{

     System.out.println("\nChoose three cards which have different features or the same features.");
     
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         System.out.print("For First Choose : ");
         Integer int1=Integer.parseInt((in.readLine()));
         Integer no1=int1;
         
         System.out.print("For Second Choose : ");
         Integer int2=Integer.parseInt((in.readLine()));
         Integer no2=int2;
         
         System.out.print("For Thrid Choose : ");
         Integer int3=Integer.parseInt((in.readLine()));
         Integer no3=int3;
             
         Cards card1=(Cards)cardList1[int1-1];
         Cards card2=(Cards)cardList1[int2-1];
         Cards card3=(Cards)cardList1[int3-1];
         if(int1.equals(int2)||int1.equals(int3)||int2.equals(int3)){
             System.out.println("\nYour choosen numbers are repeating!!!"
                     + "Please enter different numbers again!!!");
         }
         System.out.println("\n");
         System.out.println("Your Choose Three is : \n");
         
         
         System.out.print("<");
         System.out.print(int1);
         System.out.print("> ");
         System.out.print(card1.getShape()+"\t"+card1.getShading()+"\t"+card1.getColor()+"\t"+card1.getNumber()+"\t\t");
         
        
         System.out.print("<");
         System.out.print(int2);
         System.out.print("> ");
         System.out.print(card2.getShape()+"\t"+card2.getShading()+"\t"+card2.getColor()+"\t"+card2.getNumber()+"\t\t");
         
         
         System.out.print("<");
         System.out.print(int3);
         System.out.print("> ");
         System.out.println(card3.getShape()+"\t"+card3.getShading()+"\t"+card3.getColor()+"\t"+card3.getNumber()+"\t\t");
         
         //differ color - differ shape - same no  - differ shading or same shading
        if(((!card1.getColor().equals(card2.getColor())) && (!card2.getColor().equals(card3.getColor())) && (!card1.getColor().equals(card3.getColor()))) 
            &&((!card1.getShape().equals(card2.getShape())) && (!card2.getShape().equals(card3.getShape()) && (!card1.getShape().equals(card3.getShape())))) 
            &&((card1.getNumber().equals(card2.getNumber())) && (card2.getNumber().equals(card3.getNumber())&& (card1.getNumber().equals(card3.getNumber())))))
         
                {
                    System.out.println("Congratulations! You have got one set");
                    show(no1,no2,no3);
                }
         
         //differ color - same shape   - differ no - same shading or differ shading
        else if(((!card1.getColor().equals(card2.getColor())) && (!card2.getColor().equals(card3.getColor())) && (!card1.getColor().equals(card3.getColor()))) 
                    &&((card1.getShape().equals(card2.getShape())) && (card2.getShape().equals(card3.getShape()) && (card1.getShape().equals(card3.getShape())))) 
                    &&((!card1.getNumber().equals(card2.getNumber())) && (!card2.getNumber().equals(card3.getNumber())&& (!card1.getNumber().equals(card3.getNumber())))))
                    
                {
                    System.out.println("Congratulations! You have got one set");
                    show(no1,no2,no3);
                }
         
         //differ color  - differ shape   - differ no - differ shading or same shading
        else if(((!card1.getColor().equals(card2.getColor())) && (!card2.getColor().equals(card3.getColor())) && (!card1.getColor().equals(card3.getColor()))) 
                    &&((!card1.getShape().equals(card2.getShape())) && (!card2.getShape().equals(card3.getShape()) && (!card1.getShape().equals(card3.getShape())))) 
                    &&((!card1.getNumber().equals(card2.getNumber())) && (!card2.getNumber().equals(card3.getNumber())&& (!card1.getNumber().equals(card3.getNumber())))))
                    
                        {
                            System.out.println("Congratulations! You have got one set");
                            show(no1,no2,no3);
                        }
         //differ color  - same shape   - same no - same shading or differ shading
        else if(((!card1.getColor().equals(card2.getColor())) && (!card2.getColor().equals(card3.getColor()) && (!card1.getColor().equals(card3.getColor()))) 
                    &&((card1.getShape().equals(card2.getShape())) && (card2.getShape().equals(card3.getShape())&& (card1.getShape().equals(card3.getShape()))))
                    &&((card1.getNumber().equals(card2.getNumber()))&& (card2.getNumber().equals(card3.getNumber()))&&(card1.getNumber().equals(card3.getNumber())))))
                                
                        {
                            System.out.println("Congratulations! You have got one set");
                            show(no1,no2,no3);
                        }
                    
         //differ color - same shape  - differ no  -differ shading
         else if(((!card1.getColor().equals(card2.getColor())) && (!card2.getColor().equals(card3.getColor())) && (!card1.getColor().equals(card3.getColor()))) 
                    &&((card1.getShape().equals(card2.getShape())) && (card2.getShape().equals(card3.getShape()) && (card1.getShape().equals(card3.getShape())))) 
                    &&((!card1.getNumber().equals(card2.getNumber())) && (!card2.getNumber().equals(card3.getNumber())&& (!card1.getNumber().equals(card3.getNumber()))))
                    &&((!card1.getShading().equals(card2.getShading()))&& (!card2.getShading().equals(card3.getShading()))&&(!card1.getShading().equals(card3.getShading()))))
                        {
                            System.out.println("Congratulations! You have got one set");
                            show(no1,no2,no3);
                        }
         
         //differ color - differ shape  - differ no  -same shading
         //else if(((!card1.getColor().equals(card2.getColor())) && (!card2.getColor().equals(card3.getColor())) && (!card1.getColor().equals(card3.getColor()))) 
                   // &&((!card1.getShape().equals(card2.getShape())) && (!card2.getShape().equals(card3.getShape()) && (!card1.getShape().equals(card3.getShape())))) 
                   // &&((!card1.getNumber().equals(card2.getNumber())) && (!card2.getNumber().equals(card3.getNumber())&& (!card1.getNumber().equals(card3.getNumber()))))
                   // &&((card1.getShading().equals(card2.getShading()))&& (card2.getShading().equals(card3.getShading()))&&(card1.getShading().equals(card3.getShading()))))
                        //{
                            //System.out.println("Congratulations! You have got one set");
                            //show(no1,no2,no3);
                        //}
             
         //same color - same shape - differ no - differ shading or same shading
         else if(((card1.getColor().equals(card2.getColor())) && (card2.getColor().equals(card3.getColor())) && (card1.getColor().equals(card3.getColor()))) 
                    &&((card1.getShape().equals(card2.getShape())) && (card2.getShape().equals(card3.getShape()) && (card1.getShape().equals(card3.getShape())))) 
                    &&((!card1.getNumber().equals(card2.getNumber())) && (!card2.getNumber().equals(card3.getNumber())&& (!card1.getNumber().equals(card3.getNumber()))))) 
         
                        {
                            System.out.println("Congratulations! You have got one set");
                            show(no1,no2,no3);
                        }
         
         //same color   - differ shape - same no   - same shading or differ shading
         else if(((card1.getColor().equals(card2.getColor())) && (card2.getColor().equals(card3.getColor())) && (card1.getColor().equals(card3.getColor()))) 
                    &&((!card1.getShape().equals(card2.getShape())) && (!card2.getShape().equals(card3.getShape()) && (!card1.getShape().equals(card3.getShape())))) 
                    &&((card1.getNumber().equals(card2.getNumber())) && (card2.getNumber().equals(card3.getNumber())&& (card1.getNumber().equals(card3.getNumber())))))
                        {
                            System.out.println("Congratulations! You have got one set");
                            show(no1,no2,no3);
                        }
         
         
         
         //same color  - differ shape   - differ no - same shading or differ shading
         else if(((card1.getColor().equals(card2.getColor())) && (card2.getColor().equals(card3.getColor())) && (card1.getColor().equals(card3.getColor()))) 
                    &&((!card1.getShape().equals(card2.getShape())) && (!card2.getShape().equals(card3.getShape()) && (!card1.getShape().equals(card3.getShape())))) 
                    &&((!card1.getNumber().equals(card2.getNumber())) && (!card2.getNumber().equals(card3.getNumber())&& (!card1.getNumber().equals(card3.getNumber())))))
         
                        {
                            System.out.println("Congratulations! You have got one set");
                            show(no1,no2,no3);
                        }
         
         //same color  - same shape   - same no - differ shading
         else if(((card1.getColor().equals(card2.getColor())) && (card2.getColor().equals(card3.getColor())) && (card1.getColor().equals(card3.getColor()))) 
                    &&((card1.getShape().equals(card2.getShape())) && (card2.getShape().equals(card3.getShape()) && (card1.getShape().equals(card3.getShape())))) 
                    &&((card1.getNumber().equals(card2.getNumber())) && (card2.getNumber().equals(card3.getNumber())&& (card1.getNumber().equals(card3.getNumber()))))
                    &&((!card1.getShading().equals(card2.getShading()))&& (!card2.getShading().equals(card3.getShading()))&&(!card1.getShading().equals(card3.getShading()))))
                        {
                            System.out.println("Congratulations! You have got one set");
                            show(no1,no2,no3);
                        }
         else
         {
             System.out.println("\nYour choice is wrong.Try Again.");
         }
         
    
           /* Random random2 = new Random();
            for (int b = cardList.size() - 1; b >= 0; b--) 
            {
                    int j = random1.nextInt(b + 1);

                /* swap cards i,j */
               /* Cards card = cardList.get(b);
                cardList.set(b, cardList.get(j));
                cardList.set(j, card);
            }
            if(!cardList.isEmpty())
            {
                for(int i=0;i<12;i++)
                {
    
                    if(int1-1==i)
                    {
                        cardList1[i]=cardList.get(0);
                        cardList.remove(0);
                    }
                    if(int2-1==i)
                    {
                        cardList1[i]=cardList.get(1);
                        cardList.remove(1);
                    }
                    if(int3-1==i)
                    {
                        cardList1[i]=cardList.get(2);
                        cardList.remove(2);
                    }
                }
                        System.out.println("After changing,12 cards");
                        for(int i=0;i<cardList1.length;i++)
                        {
                            System.out.println(cardList1[i]);
                        }*/
             }
               /* else
                    {
                        System.out.println("Your choosen is wroung!!!");
             
                    }*/
            }
    public static void show(int int1,int int2,int int3){
    
 
            Random random2 = new Random();
            for (int b = cardList.size() - 1; b >= 0; b--) 
            {
                    int j = random2.nextInt(b + 1);

                /* swap cards i,j */
               Cards card = cardList.get(b);
                cardList.set(b, cardList.get(j));
                cardList.set(j, card);
            }
            if(!cardList.isEmpty())
            {
                for(int i=0;i<12;i++)
                {
    
                    if(int1-1==i)
                    {
                        cardList1[i]=cardList.get(0);
                        cardList.remove(0);
                    }
                    if(int2-1==i)
                    {
                        cardList1[i]=cardList.get(1);
                        cardList.remove(1);
                    }
                    if(int3-1==i)
                    {
                        cardList1[i]=cardList.get(2);
                        cardList.remove(2);
                    }
                }
                
                        System.out.println(" After changing,12 cards ");
                        
                        for(int i=0; i<cardList1.length;i++)
                        {
                            if(i%3==0)
                                System.out.println("\n");
      
                                System.out.print("<");
                                System.out.print(i+1);
                                System.out.print("> ");
                                System.out.print(cardList1[i].getShape()+"\t"+cardList1[i].getShading()+"\t"+cardList1[i].getColor()+"\t"+cardList1[i].getNumber()+"\t\t");
        
    }
             }
    
    }
        }
