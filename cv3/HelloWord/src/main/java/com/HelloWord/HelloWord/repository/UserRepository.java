package com.HelloWord.HelloWord.repository;

import com.HelloWord.HelloWord.dao.IssueReport;
import com.HelloWord.HelloWord.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
}
