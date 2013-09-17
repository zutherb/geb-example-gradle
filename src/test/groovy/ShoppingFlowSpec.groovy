import geb.spock.GebReportingSpec

/*
add vm params: -Dgeb.build.reportsDir="~/geb" -Dgeb.env="firefox"
 */
class ShoppingFlowSpec extends GebReportingSpec {

    def "ordering a pizza"() {
        when:
        to PizzaHomePage

        and:
        pizzaCatalogLink.click()

        then:
        at ProductCatalogPage

        and:
        pizzaDetailPageLink.click()

        then:
        at ProductDetailPage

        and:
        addToBasketLink.click()

        then:
        at ProductDetailPage

        and:
        to CheckoutPage

        then:
        at CheckoutPage

        and:
        submitOrderLink.click()

        then:
        at OrderConfirmationPage
    }

}