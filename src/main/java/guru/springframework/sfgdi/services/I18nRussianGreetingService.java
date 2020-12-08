package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"RU", "default"})
@Service("i18nService")
public class I18nRussianGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Привет Spring - RU";
    }
}
