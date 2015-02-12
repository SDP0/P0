/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author czamrbse9.alumnes
 */
public class Test {

    public static void main(String[] args) {
          File file = new File("test1");
          try {
              file.createNewFile();
              ComUtils cmUtils = new ComUtils(file);
              cmUtils.writeTest();
              System.out.println(cmUtils.readTest());
            }
            catch(IOException e)
            {
                System.out.println("Error Found during Operation:" + e.getMessage());
                e.printStackTrace();
            }
          
    }
    
}
    

