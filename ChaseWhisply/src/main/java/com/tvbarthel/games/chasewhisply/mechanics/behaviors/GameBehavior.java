package com.tvbarthel.games.chasewhisply.mechanics.behaviors;

import com.tvbarthel.games.chasewhisply.model.DisplayableItem;

import java.util.List;

import com.tvbarthel.games.chasewhisply.mechanics.informations.GameInformation;
import com.tvbarthel.games.chasewhisply.model.TargetableItem;

public interface GameBehavior {

    public void setGameInformation(GameInformation gameInformation);

    public GameInformation getGameInformation();

    public void setCurrentPosition(float posX, float posY, float posZ);

    public float[] getCurrentPosition();

    public List<DisplayableItem> getItemsForDisplay();

    public TargetableItem getCurrentTarget();

    public void setCurrentTarget(TargetableItem t);

    public int getLastScoreAdded();

    public void removeTarget();

    public void setInterface(IGameBehavior iGameBehavior);

    public void onClick();

    public interface IGameBehavior {
        public abstract void stop();

        public abstract void onTargetKilled(TargetableItem target);

        public abstract void onSoundRequest(int soundType);
    }
}
