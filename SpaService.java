public class SpaService
{
  private String serviceDescription;
  private double price;
  public SpaService()
  {
      serviceDescription = "XXX";
      price = 0;
  }
  public void setServiceDescription(String service)
  {
    serviceDescription = service;
  }
  public void setPrice(double servicePrice)
  {
    price = servicePrice;
  }
  public String getServiceDescription()
  {
    return serviceDescription;
  }
  public double getPrice()
  {
    return price;
  }
}
