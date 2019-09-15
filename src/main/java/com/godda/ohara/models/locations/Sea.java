package com.godda.ohara.models.locations;

import lombok.Data;

import javax.persistence.OneToMany;
import java.util.List;

@Data
public class Sea {

    @OneToMany(mappedBy = "sea")
    public List<Island> islands;
}
