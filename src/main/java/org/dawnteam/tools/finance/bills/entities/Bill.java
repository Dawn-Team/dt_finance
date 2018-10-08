package org.dawnteam.tools.finance.bills.entities;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.UUID;

/**
 * Project dt_finance
 * <p>
 * Description: entity for a bill
 * <p>
 * Created At: 2018-10-06 14:51
 *
 * @author Arvin
 * @version 1.0
 * @since 1.8
 **/
@Entity
@Data
public class Bill implements Serializable {
    private String uuid = UUID.randomUUID().toString();
}
