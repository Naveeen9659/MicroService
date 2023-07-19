package com.example.studentmark.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.studentmark.entity.Marksheet;

public interface MarksheetRepository extends JpaRepository<Marksheet, Integer> {
	@Query(value = "select sem1total from mark_sheet where roll_number=?", nativeQuery = true)
	public int getSem1Total(int rollNumber);

	@Query(value = "select sem2total from mark_sheet where roll_number=?", nativeQuery = true)
	public int getSem2Total(int rollNumber);
}
