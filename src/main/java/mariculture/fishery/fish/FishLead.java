package mariculture.fishery.fish;

import static mariculture.core.lib.MCLib.dropletAir;
import static mariculture.core.lib.MCLib.dropletLead;
import static mariculture.core.lib.MCLib.dropletRegen;
import mariculture.api.core.Environment.Salinity;
import mariculture.api.fishery.RodType;
import mariculture.api.fishery.fish.FishSpecies;

public class FishLead extends FishSpecies {
    @Override
    public int getTemperatureBase() {
        return 5;
    }

    @Override
    public int getTemperatureTolerance() {
        return 7;
    }

    @Override
    public Salinity getSalinityBase() {
        return Salinity.BRACKISH;
    }

    @Override
    public int getSalinityTolerance() {
        return 0;
    }

    @Override
    public boolean isDominant() {
        return true;
    }

    @Override
    public int getLifeSpan() {
        return 11;
    }

    @Override
    public int getFertility() {
        return 2000;
    }

    @Override
    public void addFishProducts() {
        addProduct(dropletLead, 5D);
        addProduct(dropletAir, 10D);
        addProduct(dropletRegen, 1D);
    }

    @Override
    public RodType getRodNeeded() {
        return RodType.SUPER;
    }
}
