package com.HelloWord.HelloWord.controllers;

import com.HelloWord.HelloWord.dao.IssueReport;
import com.HelloWord.HelloWord.repository.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IssueApiControler {

    @Autowired
    IssueRepository repository;

    @GetMapping("/api/issues/list")
    public List<IssueReport> issues() {
        return repository.findAll();
    }


}
