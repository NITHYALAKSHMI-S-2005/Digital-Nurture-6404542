private static void testAddCountry() {
    LOGGER.info("Start");
    Country newCountry = new Country();
    newCountry.setCoCode("XX");
    newCountry.setCoName("TestLand");

    countryService.addCountry(newCountry);

    try {
        Country fetched = countryService.findCountryByCode("XX");
        LOGGER.debug("Added Country: {}", fetched);
    } catch (CountryNotFoundException e) {
        LOGGER.error("Add test failed: {}", e.getMessage());
    }
    LOGGER.info("End");
}