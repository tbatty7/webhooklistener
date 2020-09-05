package com.battybuilds.webhooklistener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Controller {

    @PostMapping("/webhooks")
    public ResponseEntity recieveWebhook(@RequestBody String body) {
        log.error("-------------> Webhook body:  " + body);
        return ResponseEntity.ok("Lookin good!");
    }
}
