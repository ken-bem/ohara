package com.godda.ohara.models.devilFruit;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class DevilFruit {

    private long id;
    private Map<String, String> names = new HashMap<>();

    private FruitType type;


}
