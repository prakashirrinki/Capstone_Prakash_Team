package com.wipro.mbcms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.wipro.mbcms.entities.InvoiceEntity;

public interface InvoiceRepository extends JpaRepository<InvoiceEntity, Long>{

}
