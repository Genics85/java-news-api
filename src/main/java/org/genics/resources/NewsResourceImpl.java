package org.genics.resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.genics.repo.News;
import org.genics.repo.NewsCreateDto;
import org.genics.services.NewsService;
import org.genics.utils.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.util.List;

@Path("/news")
@Produces(MediaType.APPLICATION_JSON)
public class NewsResourceImpl implements NewsResource {

    @Inject
    NewsService newsService;
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @POST
    @Override
    public ApiResponse<News> create(NewsCreateDto news) {
        logger.info("htt request : create news");
        News something = newsService.create(news);
        return new ApiResponse<>(something);
    }

    @DELETE
    @Path("/{id}")
    @Override
    public ApiResponse<Boolean> delete(@PathParam("id") Long id) {
        logger.info("http request : delete news");
        Boolean response = newsService.delete(id);
        return new ApiResponse<>(response);
    }

    @GET
    @Override
    public ApiResponse<List<News>> getAll() {
        logger.info("http request : get all news");
        List<News> news = newsService.getAll();
        return new ApiResponse<>(news);
    }

    @GET
    @Path("/{id}")
    @Override
    public ApiResponse<News> get(@PathParam("id") Long id) {
        logger.info("http request : get news");
        News news= newsService.get(id);
        return new ApiResponse<>(news);
    }

    @PUT
    @Override
    public ApiResponse<News> update(News news) {
        logger.info("http request : update news");
        News newss = newsService.update(news);
        return new ApiResponse<>(newss);
    }
}
