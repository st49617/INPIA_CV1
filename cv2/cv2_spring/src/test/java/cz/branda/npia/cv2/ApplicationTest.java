package cz.branda.npia.cv2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplicationTest {

    Application app;

    @Before
    public void init() {
        app = new Application();
    }

    @Test(expected = IllegalArgumentException.class)
    public void proccessMesage() throws Exception {
        app.sender = new EmailService();
        app.sender.sendMessage(null);
    }

    @Test
    public void notEmpty() {
        EmailMock mock = new EmailMock();
        app.sender = mock;
        app.proccessMesage("Hello");
        assertEquals(1, mock.count);
    }

    private class EmailMock extends EmailService {
        int count = 0;

        @Override
        public void sendMessage(String message) throws IllegalArgumentException {
            count++;
            super.sendMessage(message);
        }
    }

}