package com;

import com.vaadin.annotations.Theme;
import com.vaadin.server.UserError;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;

public class MyVaadinApplication extends UI {
    @Override
    public void init(VaadinRequest request) {
        HorizontalLayout layout = new HorizontalLayout();
        Panel panel = new Panel("PLease Login ");
        panel.setSizeUndefined(); // Shrink to fit content
        layout.addComponent(panel);

        // Create the content
        FormLayout content = new FormLayout();

        TextField tf1 = new TextField("Username");
        tf1.setRequiredIndicatorVisible(true);
        content.addComponent(tf1);

        TextField tf2 = new TextField("Password");
        tf2.setRequiredIndicatorVisible(true);
        tf2.setComponentError(new UserError("Password is required"));
        content.addComponent(tf2);



        content.setSizeUndefined(); // Shrink to fit
        content.setMargin(true);
        panel.setContent(content);
        content.addComponent(new Button("Login")  );
        setContent(panel);
    }
}
