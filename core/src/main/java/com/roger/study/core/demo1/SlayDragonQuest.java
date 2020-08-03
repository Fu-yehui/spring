package com.roger.study.core.demo1;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {
   /**

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream){
        this.stream=stream;
    }
**/

   public SlayDragonQuest(){

   }

    @Override
    public void embark(){
        System.out.println("biu biu biu");
    }
}
