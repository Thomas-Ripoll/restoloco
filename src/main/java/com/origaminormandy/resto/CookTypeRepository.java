package com.origaminormandy.resto;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CookTypeRepository extends CrudRepository<CookType, String> {

}