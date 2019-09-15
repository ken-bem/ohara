package com.godda.ohara.models.story.arc;

import com.godda.ohara.models.story.saga.Saga;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class StoryArc {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    @ManyToOne
    private Saga saga;

    @OneToOne
    private StoryArc previousArc;


}
