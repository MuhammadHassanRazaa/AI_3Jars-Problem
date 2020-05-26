/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.jars;

import static hu.unideb.inf.jars.TrialAndError.run;

/**
 *
 * @author student
 */
public class JarMain {
    public static void main(String[] args) {
//        State start=new State();
//        Operator o23=new Operator(2,3);
//        System.out.println(o23.apply(start));
        State goal = run(new State(), Operator.OPERATORS);
        System.out.println(goal);
    }
}
