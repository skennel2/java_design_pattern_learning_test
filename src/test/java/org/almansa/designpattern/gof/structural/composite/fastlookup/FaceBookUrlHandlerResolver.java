package org.almansa.designpattern.gof.structural.composite.fastlookup;

public class FaceBookUrlHandlerResolver implements URLHandlerResolver {
	@Override
	public boolean support(String url) {
		return url.contains("facebook");
	}

	@Override
	public Object getHandlerName(String url) {
		return new FaceBookController(url);
	}
	
}