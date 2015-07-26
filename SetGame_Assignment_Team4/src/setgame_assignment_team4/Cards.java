/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setgame_assignment_team4;

/**
 *
 * @author SA_Team04 
 */
public class Cards {
    private String shape;
    private String shading;
    private String color;
    private Integer number;
   // ArrayList<Cards> cardList=new ArrayList<>();
    
    
    public Cards(String shape,String shading,String color,Integer number){
        this.shape=shape;
        this.shading=shading;
        this.color=color;
        this.number=number;
        //cardList.add(this);
       
    }

    /**
     * @return the shape
     */
    public String getShape() {
        return shape;
    }

    /**
     * @return the shading
     */
    public String getShading() {
        return shading;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @return the number
     */
    public Integer getNumber() {
        return number;
    }
    
   public Cards()
   {
   }
  

    @Override
    public String toString() {
        return shape +"\t"+ shading +"\t" + color +"\t"+ number;
    }
    public void show(){
        System.out.println(shape + "\n" + shading +"\n" + color +"\n"+ number); 
    }
}



        
        
