package DataBase;

//import bean.PointEntry;
import bean.PointEntry;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class PointEntryDao {

    private SessionFactory sessionFactory;

    public PointEntryDao(){
        sessionFactory=HibernateSessionFactoryUtil.getSessionFactory();
    }


    public void save(PointEntry pointEntry){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(pointEntry);
        transaction.commit();
        session.close();
    }

    public void update(PointEntry pointEntry) {
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(pointEntry);
        tx1.commit();
        session.close();
    }

    public void delete(PointEntry pointEntry) {
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(pointEntry);
        tx1.commit();
        session.close();
    }


    public List<PointEntry> getAll() {
        Session session = sessionFactory.openSession();
        return session.createQuery("SELECT p FROM " + PointEntry.class.getSimpleName() + " p",
                PointEntry.class).getResultList();
    }



}
