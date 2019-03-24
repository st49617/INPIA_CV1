package com.HelloWord.HelloWord;

import com.HelloWord.HelloWord.dao.IssueReport;
import com.HelloWord.HelloWord.dao.User;
import com.HelloWord.HelloWord.repository.IssueRepository;
import com.HelloWord.HelloWord.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class IssueReportDataFactory {

    @Autowired
    private IssueRepository issueRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private Creator creator;

    public void saveIssueReport(String email) {
        IssueReport report = new IssueReport();
        report.setEmail(email);

//        User u = new User();
        User u = (User) creator.save(new User());
        u.setLogin("Pepa");
        userRepository.save(u);

        report.setUser(u);
        issueRepository.save(report);
    }

    public void saveIssueReport() {
        String email = "e0";
        IssueReport report = new IssueReport();
        report.setEmail(email);

        User u = new User();
        u.setLogin("Pepa");
        userRepository.save(u);

        report.setUser(u);
        issueRepository.save(report);
    }

}
