package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void appHasAGreeting() {
        MonopolyCircularList<String> player = new MonopolyCircularList<>();
        assertEquals(player.getSize(), 40);

    }
}
