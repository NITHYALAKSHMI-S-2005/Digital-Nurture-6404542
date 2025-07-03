private static void getAllCountriesTest() {
    LOGGER.info("Start");
    try {
        Country country = countryService.findCountryByCode("IN");
        LOGGER.debug("Country: {}", country);
    } catch (CountryNotFoundException e) {
        LOGGER.error("Error: {}", e.getMessage());
    }
    LOGGER.info("End");
}