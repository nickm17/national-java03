package com.siit.generics.team;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class FootballPlayer extends Player {

    public FootballPlayer(String name) {
        super(name);
    }
}
