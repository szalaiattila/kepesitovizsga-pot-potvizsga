import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Zoo {
Connection myConn;
String URL;
String username;
String password;
Set<Zooanimal> gyujto = new HashSet<Zooanimal> ();
public Zoo()
{

}
public Zoo(String URL,String username,String password)
{
this.URL = URL;
this.username = username;
this.password = password;
}
public void getAnimals() {
try {

   Connection conn = DriverManager.getConnection(URL, username, password);

   if (conn != null) {
       System.out.println("Connected");
   }
} catch (SQLException ex) {
   ex.printStackTrace();
}
 
}
public void addAnimal(Zooanimal animal)
{

gyujto.add(animal);

}
public Zooanimal getHeaviestAnimalInTheZoo() {
Zooanimal legnehezebb = new Zooanimal();
int max;
for(int i = 0;i < gyujto.size();i++) {

}
return legnehezebb;
}

public int countWeights() {
int ossz = 0;
Zooanimal[] allatok;
for(int i = 0;i < gyujto.size();i++) {

ossz += gyujto[i].Weight;
}
return ossz;
}
public Zooanimal findExactAnimal(Zooanimal animal) {
Zooanimal megvan = new Zooanimal();
if(gyujto.contains(animal))
{
megvan = animal;
}
return megvan;
}
public Zooanimal findExactAnimalByName(String name) {
Zooanimal megvan = new Zooanimal();
for(int i = 0;i < gyujto.size();i++) {
if(gyujto.contains(gyujto.get(i).Name))
{
megvan = animal;
}
}

return megvan;
}
}
