package sevirdorproxy;

public interface ProxyFilter {
	ProxyFilter getDescription();
	
	static void evaluate(String url) {
		Exception ProxyFilterException;
		throws ProxyFilterException;
	}
}
