/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.jars;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author student
 */
public class TrialAndError {
    static Random RANDOM = new Random();
    static State run(State start, Set<Operator> operators){
        //Database
        State current;
        //COntroller
        //1. initilaize the database
        
        current = start;
        while(true){
            System.out.println("Current "+current );
            //2. is it a goal state??
            if( current.isGoal()){
                //stop, success
                return current;
            }
            //3. is there any ap[plicable opertor?
            List<Operator> applicable = new ArrayList<>();
            for(Operator o: operators){
                if(o.isApplicable(current)){
                    applicable.add(o);
                }
            }
            if(applicable.isEmpty()){
                //stop, failure
                return null;
            }
            //4. 
            Operator selected = applicable.get(RANDOM.nextInt(applicable.size()));
            current= selected.apply(current);
        }
        
    }
    
}
