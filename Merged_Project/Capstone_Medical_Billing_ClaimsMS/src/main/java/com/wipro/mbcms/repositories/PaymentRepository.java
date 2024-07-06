package com.wipro.mbcms.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.mbcms.entities.PatientEntity;
import com.wipro.mbcms.entities.PaymentEntity;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentEntity, Long>{
	
	List<PaymentEntity> findByInvoiceNumber(String invoiceNumber);

}
