package com.mgp.springbootscala.repo

import com.mgp.springbootscala.domain.Company
import org.springframework.data.repository.CrudRepository
import java.lang.Long

trait CompanyRepo  extends CrudRepository[Company, Long]{
}
