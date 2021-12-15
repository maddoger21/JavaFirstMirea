package ru.mirea.task23;

public class Food {
    public  String name;
    public  int EnergyRege;
    public  int HealthRegen;
    public  int HungryRegen;
    public  int cost;

    public Food(String name, int energyRege, int healthRegen, int hungryRegen, int cost) {
        this.name = name;
        EnergyRege = energyRege;
        HealthRegen = healthRegen;
        HungryRegen = hungryRegen;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergyRege() {
        return EnergyRege;
    }

    public void setEnergyRege(int energyRege) {
        EnergyRege = energyRege;
    }

    public int getHealthRegen() {
        return HealthRegen;
    }

    public void setHealthRegen(int healthRegen) {
        HealthRegen = healthRegen;
    }

    public int getHungryRegen() {
        return HungryRegen;
    }

    public void setHungryRegen(int hungryRegen) {
        HungryRegen = hungryRegen;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        else if (obj == null)
            return false;
        else if (getClass() != obj.getClass())
            return false;

        Food other = (Food) obj;
        if (name != other.getName())
            return false;
        else if (EnergyRege != other.getEnergyRege())
            return false;
        else if (HealthRegen != other.getHealthRegen())
            return false;
        else if (HungryRegen != other.getHungryRegen())
            return false;
        else if (cost != other.getCost())
            return false;
        return true;

    }
    @Override
    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        result = 31 * result + EnergyRege;
        result = 31 * result + HealthRegen;
        result = 31 * result + HungryRegen;
        result = 31 * result + cost;
        return result;
    }
}
