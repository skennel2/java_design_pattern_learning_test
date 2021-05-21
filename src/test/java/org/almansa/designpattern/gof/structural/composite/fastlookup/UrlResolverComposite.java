package org.almansa.designpattern.gof.structural.composite.fastlookup;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UrlResolverComposite implements URLHandlerResolver {

	private List<URLHandlerResolver> resolvers = new ArrayList<>();

	private Map<String, URLHandlerResolver> resolverCache = new ConcurrentHashMap<>();
	
	@Override
	public boolean support(String url) {
		return this.getResolver(url) != null;
	}

	@Override
	public Object getHandlerName(String url) {
		URLHandlerResolver resolver = this.getResolver(url);
		
		if(resolver == null) {
			return null;
		}
		
		return resolver.getHandlerName(url);
	}
	
	public URLHandlerResolver getResolver(String url) {
		URLHandlerResolver resolver = this.resolverCache.get(url);
		if(resolver == null) {
			for (URLHandlerResolver urlHandlerResolver : resolvers) {
				if(urlHandlerResolver.support(url)) {
					this.resolverCache.put(url, urlHandlerResolver);
					resolver = urlHandlerResolver;
					break;
				}
			}
		}
		
		return resolver;
	}
	
	public void addResolver(URLHandlerResolver resolver) {
		this.resolvers.add(resolver);
	}
}