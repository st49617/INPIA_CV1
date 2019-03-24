package com.HelloWord.HelloWord.dao;


import com.HelloWord.HelloWord.IssueReportDataFactory;
import com.HelloWord.HelloWord.repository.IssueRepository;
import com.HelloWord.HelloWord.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@DataJpaTest
@Import(IssueReportDataFactory.class)
@Transactional
public class IssueRepositoryTest {

    @Autowired
    private IssueReportDataFactory issueReportDataFactory;

    @Autowired
    private IssueRepository issueRepository;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() {
        Assert.assertEquals(0, issueRepository.findAll().size());
        issueRepository.save(new IssueReport());
        Assert.assertEquals(1, issueRepository.findAll().size());
    }

    @Test
    public void test2() {

        issueReportDataFactory.saveIssueReport("e1");
        issueReportDataFactory.saveIssueReport("e1");
        issueReportDataFactory.saveIssueReport("e1");

        Assert.assertEquals(3, issueRepository.findAllByEmail("e1").size());
    }

    @Test
    public void testUser() {

        Assert.assertEquals(0, userRepository.findAll().size());
        userRepository.save(new User());
        Assert.assertEquals(1, userRepository.findAll().size());
    }

}
