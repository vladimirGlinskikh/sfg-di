package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello Spring! - from the Primary Bean";
    }
}
