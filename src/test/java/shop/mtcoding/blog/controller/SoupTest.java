package shop.mtcoding.blog.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class SoupTest {

    @Test
    public void parse_test() throws IOException {
        Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
        System.out.println(doc.title());
        Elements newsHeadlines = doc.select("#mp-itn b a");
        for (Element headline : newsHeadlines) {
            String v1 = headline.attr("title");
            String v2 = headline.absUrl("href");
            System.out.println(v1);
            System.out.println(v2);
        }
    }

    @Test
    public void parse2_test() throws IOException {

        String html = """
                <h1>HelloWorld</h1>
                <h2 id='good'>Bye</h2>
                <img src='fdasf'>
                """;

        Document doc = Jsoup.parse(html);
        //System.out.println(doc);

        Elements els = doc.select("h1");
        //System.out.println(els.get(0).text());

        Element el = doc.selectFirst("#good");
        //System.out.println(el.text());

        Elements els2 = doc.select("img");
        els2.get(0).attr("width","200px");

        System.out.println(els2);
    }
}
