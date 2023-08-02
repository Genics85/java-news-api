package org.genics.services;

import org.genics.repo.News;
import org.genics.repo.NewsCreateDto;

import java.util.List;

public interface NewsService {
    News create(NewsCreateDto news);
    Boolean delete(Long id);
    News update(News news);
    News get(Long id);
    List<News> getAll();
}
