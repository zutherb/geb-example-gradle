import geb.Page

class ProductDetailPage extends Page {
    static at = { title == "Pizza Supermario" }
//    static content = {
//        results(wait: true) { $("a.addToBasket") }
//        firstResultLink = results(0)
//    }
}