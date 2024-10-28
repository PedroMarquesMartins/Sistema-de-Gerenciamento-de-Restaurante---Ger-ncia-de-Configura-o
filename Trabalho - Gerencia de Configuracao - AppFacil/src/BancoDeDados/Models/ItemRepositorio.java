package BancoDeDados.Models;

import Entidades.Item;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class ItemRepositorio {

    public void salvar(Item item) {
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(item);
        tx.commit();
        em.close();
    }

    public List<Item> listar() {
        EntityManager em = JPAUtil.getEntityManager();
        List<Item> items = em.createQuery("SELECT i FROM Item i", Item.class).getResultList();
        em.close();
        return items;
    }

    public void deletar(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Item item = em.find(Item.class, id);
        if (item != null) {
            em.remove(item);
        }
        tx.commit();
        em.close();
    }

    public void atualizar(Item item) {
        EntityManager em = JPAUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.merge(item);
        tx.commit();
        em.close();
    }
}
