import geb.spock.GebReportingSpec

class ShoppingFlowSpec extends GebReportingSpec {

    def "ordering a pizza"() {
        when:
        to PizzaHomePage

        and:
        firstResultLink.click()

        then:
        at ProductCatalogPage

        and:
        firstResultLink.click()

        then:
        at ProductDetailPage

    }

}