package com.stupendousware.portfolio.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.stupendousware.portfolio.ApplicationConfiguration;
import com.stupendousware.portfolio.models.Portfolio;

@Controller
public class PortfolioController {
    @Autowired
    public ApplicationConfiguration applicationConfiguration;

    @QueryMapping
    public List<Portfolio> allPortfolios() {
        System.out.println("applicatoin version:" + applicationConfiguration.getVersion());
        Portfolio commonPortfolio = Portfolio.createPortfolio("Common person portfolio of 100-200SGD");
        commonPortfolio.createUser("doe", "john");
        Portfolio managerPortfolio = Portfolio.createPortfolio("A banker portfolio of 500-1M sgd");
        managerPortfolio.createUser("doe.2", "john.2");

        return Arrays.asList(commonPortfolio, managerPortfolio);
    }
}
