package org.acme.services;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import io.quarkus.cache.Cache;
import io.quarkus.cache.CacheManager;

@ApplicationScoped
public class CacheService {

    @Inject
    CacheManager cacheManager;

    public void clearAllCaches() {
        for (String cacheName : cacheManager.getCacheNames()) {
            cacheManager.getCache(cacheName).get().invalidateAll().await().indefinitely();
        }
    }

}
