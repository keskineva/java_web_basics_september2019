package app.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Hero extends BaseEntity {

    private String name;
    private HeroClass heroClass;
    private int level;

    public Hero() {
    }

    @Column(name = "name", unique = true, nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "class", nullable = false)
    public HeroClass getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(HeroClass heroClass) {
        this.heroClass = heroClass;
    }

    @Column(name = "level", nullable = false)
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
