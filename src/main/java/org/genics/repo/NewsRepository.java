package org.genics.repo;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NewsRepository implements PanacheRepositoryBase<News, Long> {
}
