package com.payroll.emtech.janpayroll.repository;

import com.payroll.emtech.janpayroll.model.Elps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElpsRepository extends JpaRepository<Elps,Long> {
    //all crud database methods
}
