package secondweek;

import java.util.List;

public interface ITimer {
	// 이미지(image MEDIUMBL CB), 
	// 버튼, 
	// 남은시간(deadline DATETIME - now LocalDate), 
	// 현재가격(bidprice)을 하나의 판넬로

	List<Product> selectProduct();
	void updatePrice(int setNo, String bid);
//	void insertParticipate(int userNo, int auctionNo);
	void insertParticipate(int userNo, int auctionNo, int price);
}