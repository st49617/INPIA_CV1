package cz.branda.npia.cv2;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService{

    @Override
    public void sendMessage(String message) throws IllegalArgumentException {
        if(message == null){
            throw new IllegalArgumentException();
        }
        System.out.println("Mail: " + message);
    }
}
