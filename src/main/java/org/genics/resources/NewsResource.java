package org.genics.resources;

import org.genics.repo.News;
import org.genics.repo.NewsCreateDto;
import org.genics.utils.ApiResponse;

import java.util.List;

public interface NewsResource {
    ApiResponse<News> create(NewsCreateDto news);
    ApiResponse<Boolean> delete(Long id);
    ApiResponse<List<News>> getAll();
    ApiResponse<News> get(Long id);
    ApiResponse<News> update(News news);
}
