package com.HelloWord.HelloWord.controllers;

import com.HelloWord.HelloWord.dao.IssueReport;
import com.HelloWord.HelloWord.repository.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

import java.util.List;

@Controller
public class IssueController {

    @Autowired
    private IssueRepository repository;

    @GetMapping("/issuereport")
    public String getReport(Model model) {
        model.addAttribute("issueReport", new IssueReport());
        return "issues/issuereport_form";
    }

    @PostMapping("/issuereport")
    public String postReportSubmit(IssueReport issueReport, Model model) {

        repository.save(issueReport);
        System.out.println(issueReport.getDescription());
        System.out.println(issueReport.getId());
        return "issues/issuereport_form";
    }

    @GetMapping("/issues")
    public String getIssues(Model model) {
        List<IssueReport> reports = repository.findAll();
        for (IssueReport report : reports) {
            System.out.println(report.getUrl());
        }
        model.addAttribute("issues", reports);
        return "issues/issuereport_list";
    }


}
