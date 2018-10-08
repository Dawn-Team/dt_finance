package org.dawnteam.tools.finance.bills.services;

import org.dawnteam.tools.finance.bills.entities.Bill;
import org.springframework.stereotype.Service;

/**
 * Project dt_finance
 * <p>
 * Description: Enrollment of the bills
 * <p>
 * Created At: 2018-10-06 15:02
 *
 * @author Arvin
 * @version 1.0
 * @since 1.8
 **/
public interface EnrollBillService {


    /**
     * Bill Enrollment
     *
     * @param bill the bill to enroll
     *
     * @return the uuid of the recorded bill.
     */
    public String enroll(Bill bill);
}
