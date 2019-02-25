package cz.branda.npia.cv2;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService{

    @Override
    public void sendMessage(String message) {
        System.out.println("Mail: " + message);
    }
}
