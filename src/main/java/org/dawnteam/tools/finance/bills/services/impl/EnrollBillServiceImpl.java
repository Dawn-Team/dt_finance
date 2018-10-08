package org.dawnteam.tools.finance.bills.services.impl;

import org.dawnteam.tools.finance.bills.entities.Bill;
import org.dawnteam.tools.finance.bills.repositories.BillsRepo;
import org.dawnteam.tools.finance.bills.services.EnrollBillService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Project dt_finance
 * <p>
 * Description:
 * <p>
 * <p>
 * Created At: 2018-10-06 15:05
 *
 * @author Arvin
 * @version 1.0
 * @since 1.8
 **/
@Service("enroll-bill-service")
public class EnrollBillServiceImpl implements EnrollBillService {

    @Resource(name = "bills-repo")
    private BillsRepo billsRepo;


    @Override
    public String enroll(Bill bill) {
        return bill.getUuid();
    }
}
