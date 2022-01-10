public class GooSearchResult {
    private final String url;

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }


    public String parseDomain() {
        String domain = "";
        if (getUrl().contains("http://")) {
            domain = getUrl().replace("http://", "");
        } else if (getUrl().contains("https://")) {
            domain = getUrl().replace("https://", "");
        }

        if (domain.contains("/")) {
            return domain.substring(0, domain.indexOf("/"));
        } else {
            return domain.substring(0);
        }
    }
}

class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://robotics.industry.ua/news").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://software.us/secure").parseDomain());
    }
}