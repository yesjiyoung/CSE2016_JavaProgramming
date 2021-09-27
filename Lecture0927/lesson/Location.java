package Lecture0927.lesson;

/** Location 클래스  : 위도 경도 표현 및 다른 위치까지의 거리 계산*/
public class Location {
	/**생성자 : 초기화한다*/
	/**속성값들(Fields)*/
	public double latitude;
	public double longitude;
	
	/**디폴트 생성 메서드(생성자) :*/
	public Location() {
		this.latitude = 37.32;
		this.longitude = 126.83;
	}
	/**메서드들(Methods) : 이 클래스가 할 수 있는 일들*/
	public  Location(double lat, double lon) { /**생성 메서드(생성자) : 새로운 객체를 만들기 위한 메서드*/
		this.latitude = lat;
		this.longitude = lon;
	}
	
	public double distance(Location other) {
	// 현재 위치와 다른 위치 other 사이의 거리 계산 후 반환 
	// this.long(lat)it'd와 other.long(lat)itude를 가지고 계산
		double RadiusEarth = 6371.0;   // 지구의 반지름
		double lat1 = this.latitude;
        double lon1 = this.longitude;
        double lat2 = other.latitude;
        double lon2 = other.longitude;
        return RadiusEarth*Math.acos(Math.cos(Math.toRadians(90-lat1))*Math.cos(Math.toRadians(90-lat2))+Math.sin(Math.toRadians(90-lat1))*Math.sin(Math.toRadians(90-lat2))*Math.cos(Math.toRadians(lon1-lon2)));
	}
}
