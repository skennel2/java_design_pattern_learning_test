package org.almansa.designpattern.gof.structural.composite.fastlookup;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestClient {
	@Test
	public void test() {
		UrlResolverComposite resolvers = new UrlResolverComposite();
		resolvers.addResolver(new FaceBookUrlHandlerResolver());
		resolvers.addResolver(new NaverUrlHandlerResolver());
		
		Object resolver = resolvers.getHandlerName("www.naver.com");
		assertEquals(resolver != null, true);
		
		Object resolver2 = resolvers.getHandlerName("www.gitlab.com");
		assertEquals(resolver2 == null, true);
	}
}
