package com.example.moviezip.domain;

import com.example.moviezip.dao.ReviewDao;
import com.example.moviezip.dao.UserDao;
import com.example.moviezip.dao.mybatis.MybatisReviewDao;
import com.example.moviezip.dao.mybatis.MybatisUserDao;
import com.example.moviezip.service.ReviewImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ExtendWith(SpringExtension.class) // JUnit 5에서 Spring 테스트와의 통합을 위해 사용
public class ReviewTest {
    @Autowired
    ReviewDao reviewDao;

    @Autowired
    private MybatisReviewDao mybatisReviewDao;

    @Test
    public void testReview() throws Exception{
        System.out.println("테스트");
        ReviewImpl rvImpl = new ReviewImpl(mybatisReviewDao);

        /* insertTest */
        /*
        Review review = new Review("0511", 1,2);

        rvImpl.insertMyReview(review); */

        /* deleteTest */
        /*
        rvImpl.deleteReview(81);
         */

        /* ReviewListTest */
        /*
        List<Review> rvlist = rvImpl.getReviewList(1);

        for (Review review : rvlist ) {
            System.out.println(review.getRvTitle()+", "+review.getContent());
        }
        */

        /* reviewDetailTest */
        /*Review review = rvImpl.getReviewDetail(83);
        System.out.println(review.getContent()+", "+review.getRvId());*/

        /* updateReviewTest */
        Review newRv = new Review("이 부분을 수정", 3, 1);
        newRv.setRvId(83);
        int updatedRv = rvImpl.updateReview(newRv);
        System.out.println(updatedRv);

    }
}
