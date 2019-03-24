package com.HelloWord.HelloWord.repository;

import com.HelloWord.HelloWord.dao.IssueReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IssueRepository extends JpaRepository<IssueReport, Long> {

    public List<IssueReport> findAllByEmail(String email);

}
