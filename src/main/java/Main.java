import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.sql.Date;

public class Main {

    public static void main(String[] args) {

        SessionFactory sessionFactory = Config.getSessionFactory();
        Session session = sessionFactory.openSession();

        Prisoners prisoners = new Prisoners();
        prisoners.setName("Den4");
        prisoners.setAlias("asdsad");
        prisoners.setCell_number(13);
        prisoners.setFinal_meal(2);
        prisoners.setExecution_date(new Date(1539193586));

        Transaction transaction = session.beginTransaction();

        session.persist(prisoners);

        transaction.commit();

        session.close();

    }
}
