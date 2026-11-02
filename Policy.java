
public class Policy {
    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    public Policy() {
        policyNumber = 0;
        providerName = "";
        firstName = "";
        lastName = "";
        age = 0;
        smokingStatus = "";
        height = 0;
        weight = 0;
    }

    public Policy(int number, String provider,
                  String first, String last,
                  int policyAge, String smoking,
                  double policyHeight, double policyWeight) {
        policyNumber = number;
        providerName = provider;
        firstName = first;
        lastName = last;
        age = policyAge;
        smokingStatus = smoking;
        height = policyHeight;
        weight = policyWeight;
    }

    public void setPolicyNumber(int number) {
        policyNumber = number;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setProviderName(String provider) {
        providerName = provider;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setFirstName(String first) {
        firstName = first;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String last) {
        lastName = last;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int policyAge) {
        age = policyAge;
    }

    public int getAge() {
        return age;
    }

    public void setSmokingStatus(String smoking) {
        smokingStatus = smoking;
    }

    public String getSmokingStatus() {
        return smokingStatus;
    }

    public void setHeight(double policyHeight) {
        height = policyHeight;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double policyWeight) {
        weight = policyWeight;
    }

    public double getWeight() {
        return weight;
    }

    public double getBMI() {
        return (weight * 703) / (height * height);
    }

    public double getPolicyPrice() {
        double price = 600;

        if (age > 50) {
            price += 75;
        }

        if (smokingStatus.equalsIgnoreCase("smoker")) {
            price += 100;
        }

        if (getBMI() > 35) {
            price += (getBMI() - 35) * 20;
        }

        return price;
    }
}
