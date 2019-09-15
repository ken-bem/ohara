package com.godda.ohara.models.locations;

import lombok.Data;

import javax.persistence.ManyToOne;

@Data
public class Island {

    @ManyToOne
    private Sea sea;
}
