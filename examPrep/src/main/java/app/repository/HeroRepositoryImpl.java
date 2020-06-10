package app.repository;

import app.domain.entities.Hero;

import javax.persistence.EntityManager;

public class HeroRepositoryImpl  implements HeroRepository{
    private final EntityManager entityManager;

    public HeroRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(Hero hero) {
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(hero);
        this.entityManager.getTransaction().commit();
    }
}
