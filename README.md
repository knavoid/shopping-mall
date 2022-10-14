## 🛒 Shopping Mall Project

> Spring Boot, Spring Data JPA, Spring Security 등의 기술스택을 이용하여 하나의 쇼핑몰 서비스를 구현합니다. 사용되는 기술들에 대한 익숙한 활용과 전체적인 개발 흐름을 파악하는 것에 중점을 두고 프로젝트를 진행하였습니다.

<br>

## 🔧 Tech Stack


#### Back
- Java, Spring Boot, Spring Data JPA, Spring Security
- MySQL, Hibernate


#### Front
- HTML, CSS, Javascript, Thymeleaf

<br>

## 📱 Services


#### ✔ Member
>- 회원가입, 로그인/로그아웃
>- 역할(admin, user)에 따른 권한 설정

#### ✔ Item
>- 상품 등록 - `create`
>- 상품 조회 - `read`
>  - 조회를 위한 조건 필터링 및 검색 기능
>  - 관리자와 일반 회원에 따른 조회 
>- 상품 관리 - `update` `delete`

#### ✔ Order
>- 상품 주문 - `create`
>- 주문 내역 조회 - `read`
>- 주문 취소 - `delete`

#### ✔ Cart
>- 장바구니에 상품 추가 - `create`
>- 장바구니 조회 - `read`
>- 장바구니 상품 정보 수정 - `update`
>- 장바구니에 있는 상품 삭제 - `delete`
>- 장바구니에 있는 상품 주문

<br>

## 💾 Database Design

![](https://velog.velcdn.com/images/knavoid/post/f06d429e-3c31-4618-aa5b-3027f9cb1768/image.png)

- `member` : 쇼핑몰 회원 정보 테이블
- `item` : 상품 정보 테이블
- `item_img` : 상품 이미지 정보 테이블
- `order` : 회원들의 주문 정보 테이블
- `order_item` : 주문이 완료된 상품 정보 테이블
- `cart` : 회원들이 생성한 장바구니 정보 테이블
- `cart_item` : 장바구니에 담긴 상품 정보 테이블

<br>

## 📑 API Design

<table>
  
  <tr>
    <th align="center" width="200">Method</th>
    <th align="center" width="300">URL</th>
    <th align="center" width="300">Description</th>
  </tr>
  
  <tr>
    <td align="center">GET</td>
    <td>/</td>
    <td>메인 페이지</td>
  </tr>
  <tr>
    <td align="center" colspan=3>Member</td>
  </tr>
  <tr>
    <td align="center">GET</td>
    <td>/members/new</td>
    <td>회원가입 페이지</td>
  </tr>
  <tr>
    <td align="center">POST</td>
    <td>/members/new</td>
    <td>회원가입</td>
  </tr>
  <tr>
    <td align="center">GET</td>
    <td>/members/login</td>
    <td>로그인 페이지</td>
  </tr>
  <tr>
    <td align="center">GET</td>
    <td>/members/login/error</td>
    <td>로그인 실패 페이지</td>
  </tr>
  <tr>
    <td align="center" colspan=3>Item</td>
  </tr>
  <tr>
    <td align="center">GET</td>
    <td>/admin/item/new</td>
    <td>상품 등록 페이지 (관리자)</td>
  </tr>
  <tr>
    <td align="center">POST</td>
    <td>/admin/item/new</td>
    <td>상품 등록 (관리자)</td>
  </tr>
  <tr>
    <td align="center">GET</td>
    <td>/admin/item/{itemID}</td>
    <td>상품 수정 페이지 (관리자)</td>
  </tr>
  <tr>
    <td align="center">POST</td>
    <td>/admin/item/{itemID}</td>
    <td>상품 수정 (관리자)</td>
  </tr>
  <tr>
    <td align="center">GET</td>
    <td>/admin/items</td>
    <td>상품 관리 페이지 (관리자)</td>
  </tr>
  <tr>
    <td align="center">GET</td>
    <td>/item/{itemId}</td>
    <td>상품 상세 페이지</td>
  </tr>
  <tr>
    <td align="center" colspan="3">Order</td>
  </tr>
  <tr>
    <td align="center">POST</td>
    <td>/order</td>
    <td>상품 주문</td>
  </tr>
  <tr>
    <td align="center">GET</td>
    <td>/orders</td>
    <td>주문 내역 조회</td>
  </tr>
  <tr>
    <td align="center">POST</td>
    <td>/order/{orderId}/cancel</td>
    <td>주문 취소</td>
  </tr>
  <tr>
    <td align="center" colspan="3">Cart</td>
  </tr>
  <tr>
    <td align="center">POST</td>
    <td>/cart</td>
    <td>장바구니에 상품 추가</td>
  </tr>
  <tr>
    <td align="center">GET</td>
    <td>/cart</td>
    <td>장바구니 조회</td>
  </tr>
  <tr>
    <td align="center">PATCH</td>
    <td>/cartItem/{cartItemId}</td>
    <td>장바구니 상품 수량 변경</td>
  </tr>
  <tr>
    <td align="center">DELETE</td>
    <td>/cartItem/{cartItemId}</td>
    <td>장바구니에서 상품 제거</td>
  </tr>
  <tr>
    <td align="center">POST</td>
    <td>/cart/order</td>
    <td>장바구니 상품 주문</td>
  </tr>

</table>
