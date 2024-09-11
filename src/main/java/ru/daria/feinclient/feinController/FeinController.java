package ru.daria.feinclient.feinController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.daria.feinclient.feinService.FeunService;

@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor
public class FeinController {
    private final FeunService feunService;

    @GetMapping("/{volume}")
    public Long calculateOxideForPaint(@PathVariable Long volume) {
        return feunService.calculationOfTheOxade(volume);
    }
}
