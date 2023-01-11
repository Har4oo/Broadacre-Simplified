package com.harvestmanager.broadacre.service.implementation;

import com.harvestmanager.broadacre.entity.Sort;
import com.harvestmanager.broadacre.repository.SortRepository;
import com.harvestmanager.broadacre.service.SortService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SortServiceImplementation implements SortService {
    private SortRepository sortRepository;

    @Override
    public List<Sort> getSorts() {
        return sortRepository.findAll();
    }

    @Override
    public Sort getSort(long id) {
        return sortRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid id " + id));
    }

    @Override
    public Sort createSort(Sort sort) {
        return sortRepository.save(sort);
    }

    @Override
    public Sort updateSort(Sort sort, long id) {
        sort.setSortId(id);
        return sortRepository.save(sort);
    }

    @Override
    public void deleteSort(long id) {
        sortRepository.deleteById(id);
    }
}
