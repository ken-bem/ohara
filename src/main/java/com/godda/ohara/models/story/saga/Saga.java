package com.godda.ohara.models.story.saga;

import com.godda.ohara.models.story.arc.StoryArc;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Saga {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "saga")
    private List<StoryArc> storyArcs = new ArrayList<>();

    public void addStoryArc(StoryArc arc){
        arc.setSaga(this);
        this.storyArcs.add(arc);
    }

}
