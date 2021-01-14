package com.siit.generics.team;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data //Equivalent to @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode
public abstract class Player {
    private String name;
}
