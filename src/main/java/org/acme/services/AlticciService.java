package org.acme.services;

import javax.enterprise.context.ApplicationScoped;
import javax.sound.midi.Sequence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;


import org.jboss.logging.annotations.Param;

import io.quarkus.cache.CacheKey;
import io.quarkus.cache.CacheResult;
@ApplicationScoped
public class AlticciService {
	
	@CacheResult(cacheName = "alticci-cache") 
	public int getValueInIndex(int index) {
		if(index==0) {
			return 0;
		}else if(index==1||index==2) {
			return 1;
		}else {
			return getValueInIndex(index-3)+getValueInIndex(index-2);
		}
	}

}