package org.example.steps;

import org.example.common.PageProvider;
import org.example.pages.SearchPage;
import org.example.pages.SearchResultPage;

public class UserSteps {

    public PageProvider pageProvider;
    public SearchPageSteps atSearchPage;
    public SearchResultPageSteps atSearchResultPage;

    public UserSteps(PageProvider pageProvider) {
        this.pageProvider = pageProvider;
        atSearchPage = new SearchPageSteps(pageProvider.initPage(SearchPage.class));
        atSearchResultPage = new SearchResultPageSteps(pageProvider.initPage(SearchResultPage.class));
    }

}
