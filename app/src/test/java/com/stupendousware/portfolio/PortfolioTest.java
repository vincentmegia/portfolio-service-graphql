packag:q
com.stupendousware.portfolio;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.stupendousware.portfolio.models.Portfolio;

import graphql.Assert;

public class PortfolioTest {
    @Test
    public void PortfolioNotNullTest() {
        List<Portfolio> portfolios = new ArrayList<>();
        portfolios.add(Portfolio.createPortfolio("john-doe-portfolio"));
        portfolios.add(Portfolio.createPortfolio("john-doe-2-portfolio"));

        Assert.assertTrue(portfolios.size() == 2);
    }
}
