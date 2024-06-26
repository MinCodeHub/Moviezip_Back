package com.example.moviezip.dao.mybatis.mapper;

import com.example.moviezip.domain.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MovieMapper {
    //영화 검색
    List<Movie> searchMovieByKeyword(@Param("keyword") String keyword);

    List<Movie> getRecentMovie();

    Movie getMoviedetail(int movie_id);

    Movie getMovieTitle(String movie_title);
    Movie getAllMoviedetail(int movie_id);
}
