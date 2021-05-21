package org.almansa.designpattern.gof.structural.composite.fastlookup;

public class NaverUrlHandlerResolver implements URLHandlerResolver {
	@Override
	public boolean support(String url) {
		return url.contains("naver");
	}

	@Override
	public Object getHandlerName(String url) {
		return new NaverController(url);
	}
	
}