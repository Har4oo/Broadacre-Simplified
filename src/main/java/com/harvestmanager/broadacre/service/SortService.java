package com.harvestmanager.broadacre.service;

import com.harvestmanager.broadacre.entity.Sort;

import java.util.List;

public interface SortService {
    List<Sort> getSorts();
    Sort getSort(long id);
    Sort createSort(Sort sort);
    Sort updateSort(Sort sort, long id);
    void deleteSort(long id);
}
