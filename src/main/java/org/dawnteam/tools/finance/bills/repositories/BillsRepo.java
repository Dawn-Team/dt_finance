package org.dawnteam.tools.finance.bills.repositories;

import org.dawnteam.tools.finance.bills.entities.Bill;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Project dt_finance
 * <p>
 * Description: Repository for bills.
 * <p>
 * Created At: 2018-10-06 14:59
 *
 * @author Arvin
 * @version 1.0
 * @since 1.8
 **/
@Repository("bills-repo")
public interface BillsRepo extends PagingAndSortingRepository<Bill,String> {
}
