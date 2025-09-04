import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSample {
    
    public static void main(String[] augs){
    List<String>places=new ArrayList<>();

//要素の追加
places.add("アイスランド");
places.add("スペイン");
places.add("ナポリ");
places.add("リスボン");
places.add("ヨセミテ国立公園");

//forEachを使った単純な出力
System.out.println("■Stream forEachにいる取得:");
places.stream().forEach(place->System.out.println(place));

//filterを使って特定の条件に一致する要素のみを抽出
System.out.println("■「ン」で終わる場所のみ抽出:");
places.stream()
      .filter(place->place.endsWith("ン"))
      .forEach(place->System.out.println(place));

//mapを使って各要素を加工
System.out.println("■各場所の長さを表示:");
places.stream()
      .map(place->place+"の長さを:"+place.length())
      .forEach(place->System.out.println(place));

//sortedを使ってソート
System.out.println("■ソート:");
places.stream()
      .sorted()
      .forEach(place->System.out.println(place));

//collectを使って結果を別のリストに格納
List<String>filteredPlaces=places.stream()
        .filter(place->place.contains("ス"))
        .collect(Collectors.toList());
System.out.println("「ス」を含む場所:"+ filteredPlaces);
    }
}
