/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectdependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Administrator
 */
public class ObjectdependencyInjection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Triangle Id=(Triangle)context.getBean("triangleId");
        
        Id.draw();
        
    }
    
}
