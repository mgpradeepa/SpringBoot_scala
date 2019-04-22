package com.mgp.springbootscala.repo

import com.mgp.springbootscala.domain.Company
import org.springframework.data.repository.CrudRepository

trait CompanyRepo  extends CrudRepository[Company, Long]{
}
