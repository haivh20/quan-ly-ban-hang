package com.raven.repository;

import com.raven.domainModel.ChatLieu;
import com.raven.domainModel.NhanVien;
import com.raven.response.ChatLieuResponse;
import com.raven.utility.HibernateUtility;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author haiz2
 */
public class ChatLieuRepo {

//    private Session session = HibernateUtility.getFACTORY().openSession();

    public List<ChatLieu> getAll() {
        List<ChatLieu> list = null;
        try (Session session = HibernateUtility.getFACTORY().openSession();) {
            TypedQuery<ChatLieu> query = session.createQuery("SELECT p FROM ChatLieu p", ChatLieu.class);
            System.out.println("queryyyyyv" + query);
            list = query.getResultList();
            System.out.println("listttttttt" +list);
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;

    }

}
