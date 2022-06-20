package bg.softuni.pathfinder.model.entity;

import bg.softuni.pathfinder.model.enums.EngineEnum;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private EngineEnum name;

    @Column(columnDefinition = "TEXT")
    private String description;

    public EngineEnum getName() {
        return name;
    }

    public void setName(EngineEnum name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
