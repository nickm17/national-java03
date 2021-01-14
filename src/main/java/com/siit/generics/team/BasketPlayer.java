package com.siit.generics.team;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class BasketPlayer extends Player {

    public BasketPlayer(String name) {
        super(name);
    }
}
