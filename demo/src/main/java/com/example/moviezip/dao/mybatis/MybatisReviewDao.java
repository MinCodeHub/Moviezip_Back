package com.example.moviezip.dao.mybatis;

import com.example.moviezip.dao.ReviewDao;
import com.example.moviezip.dao.mybatis.mapper.ReviewMapper;
import com.example.moviezip.domain.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MybatisReviewDao implements ReviewDao {
    @Autowired
    private ReviewMapper reviewMapper;
    @Override
    public void insertMyReview(Review review) throws DataAccessException {
        reviewMapper.insertMyReview(review);
    }
    @Override
    public void deleteReview(long rvId) throws DataAccessException{
        reviewMapper.deleteReview(rvId);
    }

    @Override
    public List<Review> getReviewList(long mvId) throws DataAccessException{
        return reviewMapper.getReviewList(mvId);
    }
}
