# 💡 편의점 발주 프로그램 만들기

본 예제는 편의점, 음식점, 카페 등 저장 공간을 가지고 있는 곳 이라면 자유롭게 사용할 수 있는 **발주 프로그램**을 제작하여 봅니다.<br>
해당 프로그램은 물건을 등록하거나 빼는 등의 기본적인 기능만을 갖도록 합니다.<br>

(※ 반드시 객체 지향을 알아야만 JAVA 로 프로그램을 짤 수 있는 것은 아닙니다. 기본 타입, 제어문, 함수, String 을 활용해 작은 프로그램을 만들 수 있습니다. )<br>
<br>
<br>
# ✏️ [편의점에서 활용할 수 있는 프로그램 기능]<br>
본 프로그램은 아래와 같이 여섯가지 기능을 추가해 주세요.<br>
<br>
물건 정보(제품명) 등록하기<br>
물건 정보(제품명) 등록 취소하기<br>
물건 넣기 (제품 입고)<br>
물건 빼기 (제품 출고)<br>
재고 조회<br>
프로그램 종료<br>
(※ 프로그램 종료 기능을 실행하지 않는 한 계속해서 프로그램이 돌아갈 수 있도록 합니다.)<br>
<br>

## 1️⃣ 첫 번째 메서드 정의하기<br>
<br>
메서드의 목적 : 사용자가 입력한 문자열(제품명)을 배열에 저장하며, 배열의 공간을 넘기는 경우 메서드를 조기 return 시켜줍니다.<br>
메서드의 이름 : prod_input()<br>
메서드의 입력 : 사용자의 제품 등록(s), 제품 리스트(products)<br>
메서드의 출력 : 등록된 제품 리스트<br>
반환 데이터 타입 : void<br>

## 2️⃣ 두 번째 메서드 정의하기<br>
<br>
메서드의 목적 : 사용자가 입력한 제품을 제거합니다.<br>
메서드의 이름 : prod_remove()<br>
메서드의 입력 : 사용자의 제품 등록(s), 제품 리스트(products)<br>
메서드의 출력 : 제품 등록 취소 안내문구<br>
반환 데이터 타입 : void<br>
<br>

## 3️⃣ 세 번째 메서드 정의하기<br>
<br>
메서드의 목적 : 사용자가 입력한 제품의 수량을 등록합니다.<br>
메서드의 이름 : prod_amount_add()<br>
메서드의 입력 : 사용자의 제품 등록(s), 제품 리스트(products), 제품 수량(counts)<br>
메서드의 출력 : 제품의 수량이 수정(증가)된 리스트<br>
반환 데이터 타입 : void<br>
<br>

## 4️⃣ 네 번째 메서드 정의하기<br>
메서드의 목적 : 사용자가 입력한 제품의 수량을 감축합니다.<br>
메서드의 이름 : prod_amount_decrease()<br>
메서드의 입력 : 사용자의 제품 등록(s), 제품 리스트(products), 제품 수량(counts)<br>
메서드의 출력 : 제품의 수량이 수정(감축)된 리스트<br>
반환 데이터 타입 : void<br>
<br>

## 5️⃣ 다섯 번째 메서드<br>
메서드의 목적 : 사용자가 등록한 물품과 수량을 확인합니다.<br>
메서드의 이름 : prod_search()<br>
메서드의 입력 : 제품 리스트(products), 제품 수량(counts)<br>
메서드의 출력 : 현재 제품 수량 리스트<br>
반환 데이터 타입 : void<br>
<br>
