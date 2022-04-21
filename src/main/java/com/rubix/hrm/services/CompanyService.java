package com.rubix.hrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubix.hrm.models.Company;
import com.rubix.hrm.repository.CompanyRepository;

@Service

public class CompanyService {

	@Autowired
	private CompanyRepository companyRepository;

	public Optional<Company> create(Company company) {
		if (companyRepository.existsById(company.getCompanyId())) {
			return Optional.empty();
		} else {
			return Optional.of(companyRepository.save(company));
		}
	}

	public List<Company> retrieve() {
		return companyRepository.findAll();
	}

	public Optional<Company> retrieveOne(int comId) {
		return companyRepository.findById((long) comId);
	}

	public Optional<Company> update(Company company) {
		if (companyRepository.existsById((company.getCompanyId()))) {
			return Optional.of(companyRepository.save(company));
		} else {
			return Optional.empty();
		}
	}

	public String delete(int comId) {
		if (companyRepository.existsById((long) comId)) {
			companyRepository.deleteById((long) comId);
			return comId + " deleted successfully!";
		} else {
			return "The company data does not exist in records!";
		}

	}

}
