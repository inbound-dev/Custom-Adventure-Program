/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package custom.adventure.program;

import java.util.Scanner;


/**
 *
 * @author Jordan
 */
public class CustomAdventureProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // Welcoming user to Adventure
        System.out.println("Welcome To this custom adventure");
        System.out.println("");
        
        // Initiate Scanner To begin
        Scanner input = new Scanner(System.in);
        
        
        // first user disicion
        System.out.println("Your First Disicion is");
        System.out.println("You are standing at the entrance to a path there are 2");
        System.out.println("");
        System.out.println("Right or Left?");
        
        // strings for all disicions
        String Right;
        String Canoe;
        String swim; 
        String bridge;
        String walk;
        String speed;
        
        
        Right = input.next();
        
        //turn right
        if (Right.equals("Right") || Right.equals("right")){
        
            System.out.println("You have come up to a river, how do you cross it");
            System.out.println("A old canoe you found on the path( about a mile back) or, swim");
            
            Canoe = input.next(); 
            
            //canoe across river
        if (Canoe.equals("Canoe") || Canoe.equals("canoe"))
        {
                System.out.println("45 Minutes Later....");
                System.out.println("You Are Crossing the river and suddenly it gets really windy");
                System.out.println("Do you either, keep going cautiously, or swim for it");
                
            swim = input.next();//catuiously
        
        if (swim.equals("cautiously") || swim.equals("Cautiously"))
        {
                System.out.println("you sucsessfully crossed the river");
                System.out.println("Congratulations, You Win");
             
        }
        if (swim.equals("swimforit") || swim.equals("swim for it"))
        {
            System.out.println("It was wavy........ You Died");
            //System.exit(0);
        } 
            
        }
        
         // swim across the river
        if (Canoe.equals("Swim") || Canoe.equals("swim"))   
        {
                System.out.println("While you are swimming it gets very windy.........");
                System.out.println("You Drowned");
                System.exit(0);
                
        }
         
        }
        
        // turn left
        if (Right.equals("Left") || Right.equals("left"))
        {
         System.out.println("while walking down this path you came across a reviene");
         System.out.println("Do you either use dead trees to make a makshift bridge, or do you walk one kilometer around it ");
         
         bridge = input.next();
         
         
         if (bridge.equals("bridge") || bridge.equals("Bridge"))
         {
             System.out.println("You sucsessfully created the bridge");
             System.out.println("In the middle of the bridge you hear a loud cracking noise and 3 of the 5 logs fall");
             System.out.println("do you either keep going slowly or run full speed");
             
             speed = input.next();
             if (speed.equals("slowly") || speed.equals("Slowly"))
             {
                 System.out.println("You made it");
                 System.out.println("Congratulations, You Win");
             }
             
             if (speed.equals("run") || speed.equals("Run"))
             {
              System.out.println("The logs slipped");
              System.out.println("You Died");
             }
         }
         
         if (bridge.equals("walk") || bridge.equals("Walk"))
         {
             System.out.println("While you were walking it got dark and you walked into the reviene.");
             System.out.println("You Died");
            
         }
        }
    }
    
}
