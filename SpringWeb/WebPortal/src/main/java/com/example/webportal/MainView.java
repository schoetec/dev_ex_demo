package com.example.webportal;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.html.NativeLabel;

@Route("")
public class MainView extends VerticalLayout {

    // New header text for the landingspage
    static String LANDINGSPAGE_HEADER_TEXT = "Welcome to this DEMO WebPortal";

    private void showErrorDialog(String errorMessage) {
        Dialog dialog = new Dialog();
        dialog.setHeaderTitle("Error");
        dialog.add(new Paragraph(errorMessage));
        Button closeButton = new Button("Close", e -> dialog.close());
        dialog.getFooter().add(closeButton);
        dialog.open();
    }

    public MainView(CallController callController) {

        H1 title = new H1(LANDINGSPAGE_HEADER_TEXT);
        title.getStyle().set("text-align", "center");

        NativeLabel messageLabel = new NativeLabel("Message Received : ");
        TextField messageField = new TextField();
        messageLabel.setFor(messageField);
        messageField.setPlaceholder("Waiting for action.");
        messageField.setReadOnly(true);
        messageField.setWidth("300px");

        Button helloButton = new Button("Call Hello Endpoint", e -> {
            String response = callController.callHelloEndpoint();
            if (response.startsWith("Error:")) {
                showErrorDialog(response);
            } else {
                messageField.setValue(response);
            }
        });

        Button dateButton = new Button("Call GetDate Endpoint", e -> {
            String response = callController.callGetDateEndpoint();
            if (response.startsWith("Error:")) {
                showErrorDialog(response);
            } else {
                messageField.setValue(response);
            }
        });

        Button homeButton = new Button("Home", e -> {
            getUI().ifPresent(ui -> ui.getPage().setLocation("/"));
        });
        // Add message label and field

        // Add components to layout
        add(title, messageLabel, messageField, homeButton, helloButton, dateButton);

    }

}