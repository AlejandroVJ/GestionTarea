package com.mycompany.gestionpracticasdeempresas;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author USUARIO
 */
public class HibernateUtil {
    
    private static final SessionFactory sf; 
    
    static{
        try{
            sf = new Configuration().configure().buildSessionFactory();
            
        } catch(HibernateException ex){
            System.out.println("Error al crear SessionFactory");
            System.out.println(ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sf;
    }
    
}
