package com.rubix.hrm.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.rubix.hrm.models.BankDetails;
import com.rubix.hrm.services.BankDetailsServices;


public class BankDetailsController {
	@Autowired
	private BankDetailsServices bankDetailsService;

	@PostMapping
	public String savedetails(@RequestBody BankDetails bankDetails) {
		Optional<BankDetails> comDb = bankDetailsService.create(bankDetails);
		if (comDb.isPresent()) {
			return "The bank data has been saved successfully!";
		} else {
			return "bank data already exist in records";
		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<BankDetails> getDetailsById(@PathVariable("bankId") int id) {
		Optional<BankDetails> bank = bankDetailsService.retrieveOne(id);
		if (bank.isPresent()) {
			return new ResponseEntity<>(bank.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping
	public List<BankDetails> getBankDetails() {
		return bankDetailsService.retrieve();
	}

	@PutMapping
	public String updateBankData(@RequestBody BankDetails bankDetails) {
		Optional<BankDetails> comobj = bankDetailsService.update(bankDetails);
		if (comobj.isEmpty()) {
			return "The Bank data does not exist in records!";
		} else {
			return "The Bank data has been updated successfully!";
		}
	}

	@DeleteMapping("/{id}")
	public String deleteBankDataById(@PathVariable("id") int id) {
		return bankDetailsService.delete(id);
	}

}
