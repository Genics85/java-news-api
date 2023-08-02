package org.genics.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.genics.repo.News;
import org.genics.repo.NewsCreateDto;
import org.genics.repo.NewsRepository;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class NewsServiceImpl implements NewsService {

    ModelMapper mapper = new ModelMapper();
    @Inject
    NewsRepository newsRepository;

    @Override
    public News create(NewsCreateDto news) {
        News newThing = mapper.map(news,News.class);
        newsRepository.getEntityManager().persist(newThing);
        return newThing ;
    }

    @Override
    public Boolean delete(Long id) {
        News news = this.get(id);
        newsRepository.delete(news);
        return true;
    }

    @Override
    public News update(News news) {
        newsRepository.persist(news);
        return news;
    }

    @Override
    public News get(Long id) {
        return newsRepository.findById(id);
    }

    @Override
    public List<News> getAll() {
        return newsRepository.findAll().stream().collect(Collectors.toList());
    }
}
