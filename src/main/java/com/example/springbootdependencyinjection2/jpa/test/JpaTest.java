package com.example.springbootdependencyinjection2.jpa.test;

import com.example.springbootdependencyinjection2.jpa.model.UserDetail;
import com.example.springbootdependencyinjection2.jpa.model.UserDetailParam;
import com.example.springbootdependencyinjection2.jpa.repository.UserDetailRepository;
import com.example.springbootdependencyinjection2.jpa.service.UserDetailService;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaTest {
    UserDetailService userDetailService = new UserDetailService();
    UserDetailRepository userDetailRepository;

    @Test
    public void testFindByCondition()  {
        int page=0,size=10;
        Pageable pageable = PageRequest.of(page, size, Sort.by(Sort.Direction.DESC,"id"));
        UserDetailParam param = new UserDetailParam();
        param.setIntroduction("Intro");
        param.setMinAge(10);
        param.setMaxAge(30);
        Page<UserDetail> page1=userDetailService.findByCondition(param,pageable);
        for (UserDetail userDetail:page1)
            System.out.println("userDetail: "+userDetail.toString());
        System.out.println("OK");
    }
}
