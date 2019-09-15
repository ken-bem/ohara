package com.godda.ohara.models.organization;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Organization {

    private Long id;
    private String name;
    private String image;

    private List<Character> members = new ArrayList<>();
    private Map<Character, String> formerMember = new HashMap<>();

    private List<Organization> affiliations = new ArrayList<>();

}
