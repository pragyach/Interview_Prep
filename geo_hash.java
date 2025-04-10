import com.google.common.geometry.S2CellId;
import com.google.common.geometry.S2LatLng;

public class S2Example {
    public static void main(String[] args) {
        double lat = 40.7128;
        double lng = -74.0060;

        S2LatLng latLng = S2LatLng.fromDegrees(lat, lng);
        S2CellId cellId = S2CellId.fromLatLng(latLng).parent(10); // Level 10 precision

        System.out.println("S2 Cell ID: " + cellId.id());
        System.out.println("Token: " + cellId.toToken());
    }
}
