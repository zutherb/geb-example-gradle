import geb.Page

class OrderConfirmationPage extends Page {
    static at = {
        title == "Pizza Supermario"
        $("span.feedbackPanelINFO")[1].text() == "Your Order was submitted. You can taste the best pizzas in the world in a few minutes."
    }

}