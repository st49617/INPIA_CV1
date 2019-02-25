package cz.branda.npia.cv2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class Application {

    @Autowired
    List<MessageService> mailService;

    public Application() {
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("cz.branda.npia.cv2");
        Application app = context.getBean(Application.class);
        app.proccessMesage("message");
    }

    public void proccessMesage(String message) {
        for (MessageService emailService : mailService) {
            emailService.sendMessage(message);
        }
    }

    @PostConstruct
    public void endMessage() {
        System.out.println(" - Konec - ");
    }
}
