package net.jahez;

import com.example.base.MobileDriverManager;
import net.jahez.pik.PikApp;
import org.openqa.selenium.html5.Location;

public class JahezModule {

    public final PikApp pikApp;

    public JahezModule() {
        pikApp = new PikApp();
        Location location = new Location(24.774265, 46.738586, 909);
        MobileDriverManager.getDriver().setLocation(location);
    }
}
