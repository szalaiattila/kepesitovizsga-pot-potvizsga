public int getNumberOfUpperCase(Path path)
{

int nagybetu = 0;
try {
List<String> osszes = Files.readAllLines(path);
for(int i = 0;i<osszes.size();i++) {
char[] c = osszes.get(i).toCharArray();
for(int j = 0;j < c.length;j++) {
if(Character.isUpperCase(c[i])) {
nagybetu++;
}
}

}
}
catch(IOException e) {

e.printStackTrace();
}
return nagybetu;
}
}
