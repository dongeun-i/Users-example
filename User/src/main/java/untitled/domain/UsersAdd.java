package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class UsersAdd extends AbstractEvent {

    private Long id;

    public UsersAdd(Users aggregate) {
        super(aggregate);
    }

    public UsersAdd() {
        super();
    }
}
