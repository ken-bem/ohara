package com.godda.ohara.models.organization.organizations.pirates;

import com.godda.ohara.models.organization.Organization;
import com.godda.ohara.models.ship.Ship;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PirateCrew extends Organization {


    private Character captain;
    private BigDecimal bounty;


    private List<Ship> ships = new ArrayList<>();

    private String jollyRoger;


}
