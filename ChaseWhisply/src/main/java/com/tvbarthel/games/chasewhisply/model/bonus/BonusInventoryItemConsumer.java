package com.tvbarthel.games.chasewhisply.model.bonus;

import com.tvbarthel.games.chasewhisply.model.PlayerProfile;

public interface BonusInventoryItemConsumer {
    public Bonus consume(PlayerProfile playerProfile);
}
