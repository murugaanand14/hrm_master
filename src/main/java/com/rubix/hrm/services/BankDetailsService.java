package com.rubix.hrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.rubix.hrm.models.BankDetails;
import com.rubix.hrm.repository.BankRepository;


public class BankDetailsService {
	@Autowired
	private BankRepository bankRepository;

	public Optional<BankDetails> create(BankDetails bankDetails) {
		if (bankRepository.existsById(bankDetails.getBankId())) {
			return Optional.empty();
		} else {
			return Optional.of(bankRepository.save(bankDetails));
		}
	}

	public List<BankDetails> retrieve() {
		return bankRepository.findAll();
	}

	public Optional<BankDetails> retrieveOne(int bankId) {
		return bankRepository.findById((long) bankId);
	}

	public Optional<BankDetails> update(BankDetails bank) {
		if (bankRepository.existsById((bank.getBankId()))) {
			return Optional.of(bankRepository.save(bank));
		} else {
			return Optional.empty();
		}
	}

	public String delete(int bankId) {
		if (bankRepository.existsById((long) bankId)) {
			bankRepository.deleteById((long) bankId);
			return bankId + " deleted successfully!";
		} else {
			return "The bank data does not exist in records!";
		}
	}

}
