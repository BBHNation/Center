package com.binhan.center.infrastructure;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.MappedSuperclass;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

@Getter
@Setter
@ToString
@MappedSuperclass
@EqualsAndHashCode(of = {"id"})
public abstract class Id implements Serializable {

    @javax.persistence.Id
    @GenericGenerator(name = "ID", strategy = "org.hibernate.id.UUIDGenerator")
    @GeneratedValue(generator = "ID")
    @Column(length = 36, updatable = false)
    private String id;
}
