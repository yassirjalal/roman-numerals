package com.example.cucumber;

import com.example.RomanNumerals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsSteps {

    private RomanNumerals romanNumerals;
    private String result;

    @Given("I have a Roman numerals converter")
    public void i_have_a_roman_numerals_converter() {
        romanNumerals = new RomanNumerals();
    }

    @When("I convert {int}")
    public void i_convert(int number) {
        result = romanNumerals.convert(number);
    }

    @Then("the result should be {string}")
    public void the_result_should_be(String expected) {
        assertEquals(expected, result,
                "Expected Roman numeral to be " + expected + " but was " + result);
    }
}
