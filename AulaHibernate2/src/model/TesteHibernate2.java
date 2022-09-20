/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateUtil;

/**
 * 
 * @author taniabasso
 */
public class TesteHibernate2 {

    public static void main(String[] args) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Aluno al1 = new Aluno(1234, "Maria");
        Aluno al2 = new Aluno(4567, "Jose");
        Aluno al3 = new Aluno(4578, "Murilo");
        Aluno al4 = new Aluno(4545, "Julia");
        session.save(al1);
        session.save(al2);
        session.save(al3);
        session.save(al4);

        Professor prof1 = new Professor("Tania", "tania_julia@gmail", 1400);
        Professor prof2 = new Professor("Matioli", "matioli@sagrado", 1200);
        session.save(prof1);
        session.save(prof2);

        Disciplina d1 = new Disciplina("Sociologia", 45);
        Disciplina d2 = new Disciplina("filosofia", 50);
        session.save(d1);
        session.save(d2);

        session.getTransaction().commit();
        String hql = "From Aluno where nome like 'M%'";
        Query query = session.createQuery(hql);
        List <Aluno> listaAl = query.list();
        for(Aluno a: listaAl)
        {
            System.out.println("Nome: "+a.getNome());
           System.out.println("RA: "+a.getRa());
           System.out.println("=================");
        }

         session.close();
        HibernateUtil.shutdown();
    }
}
