import ru.netology.sqr.SQRService;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println(service.countSquared(200, 300));
    }
}
