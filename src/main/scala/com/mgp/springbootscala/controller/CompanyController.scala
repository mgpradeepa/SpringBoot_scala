package com.mgp.springbootscala.controller

import com.mgp.springbootscala.repo.CompanyRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping (Array("/companies"))
class CompanyController  @Autowired()(private val companyRepo: CompanyRepo){

  @RequestMapping(Array("list"))
  def listTheCompanies(model : Model): String ={
    val companies = companyRepo.findAll()
    model.addAttribute("companies", companies)
    "companies/list"
  }
}
