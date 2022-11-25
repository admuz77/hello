package KlasyObiekty;

public class AtlasOfPlants {
    public static void main(String[] args) {
        Plant fern = new Plant();
        fern.name = "Paproć";
        fern.description = "Roślina ozdobna, o pięknych, jasnozielonych, nerkowatych liściach ułożonych pióropuszowato na łodygach";
        fern.dailyWaterRequirement = 1;

        String fernInfo = "Kwiat to: " + fern.name + ". Opis:\n" + fern.description + ".\nDziennie zużywa " + fern.dailyWaterRequirement + " litrów wody." ;
        System.out.println(fernInfo);

        Plant cactus = new Plant();
        cactus.name = "Kaktus";
        cactus.description = "Kaktusy to jedne z najbardziej oryginalnych roślin, łatwe w hodowli, nic więc dziwnego, że są obecne w mieszkaniach wielu osób";
        cactus.dailyWaterRequirement = 0.1;

        String cactusInfo = "Kwiat to: " + cactus.name + ". Opis:\n" + cactus.description + ".\nDziennie zużywa " + cactus.dailyWaterRequirement + " litrów wody" ;
        System.out.println(cactusInfo);

        Plant orchid = new Plant();
        orchid.name = "Storczyk";
        orchid.description = "Storczyki uchodzą za kwiaty tajemnicze. Potrafią kwitnąć całymi miesiącami";
        orchid.dailyWaterRequirement = 0.5;

        String orchidInfo = "Kwiat to: " + orchid.name + ". Opis:\n" + orchid.description + ".\nDziennie zużywa " + orchid.dailyWaterRequirement + " litrów wody." ;
        System.out.println(orchidInfo);

        Double dailyWaterRequirementForAllPlants = fern.dailyWaterRequirement + cactus.dailyWaterRequirement + orchid.dailyWaterRequirement;
        System.out.println("\nRośliny te dziennie zużywają "+ dailyWaterRequirementForAllPlants);

        Double weeklyWaterRequirementForAllPlants = (fern.dailyWaterRequirement + cactus.dailyWaterRequirement + orchid.dailyWaterRequirement)*7;
        System.out.println("Rośliny te dziennie zużywają "+ weeklyWaterRequirementForAllPlants);

        Double yearlyWaterRequirementForAllPlants = (fern.dailyWaterRequirement + cactus.dailyWaterRequirement + orchid.dailyWaterRequirement)*365;
        System.out.println("Rośliny te dziennie zużywają "+ yearlyWaterRequirementForAllPlants);
    }
}
