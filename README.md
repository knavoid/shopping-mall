## π Shopping Mall Project

> Spring Boot, Spring Data JPA, Spring Security λ±μ κΈ°μ μ€νμ μ΄μ©νμ¬ νλμ μΌνλͺ° μλΉμ€λ₯Ό κ΅¬νν©λλ€. μ¬μ©λλ κΈ°μ λ€μ λν μ΅μν νμ©κ³Ό μ μ²΄μ μΈ κ°λ° νλ¦μ νμνλ κ²μ μ€μ μ λκ³  νλ‘μ νΈλ₯Ό μ§ννμμ΅λλ€.

<br>

## π§ Tech Stack


#### Back
- Java, Spring Boot, Spring Data JPA, Spring Security
- MySQL, Hibernate


#### Front
- HTML, CSS, Javascript, Thymeleaf

<br>

## π± Services


#### β Member
>- νμκ°μ, λ‘κ·ΈμΈ/λ‘κ·Έμμ
>- μ­ν (admin, user)μ λ°λ₯Έ κΆν μ€μ 

#### β Item
>- μν λ±λ‘ - `create`
>- μν μ‘°ν - `read`
>  - μ‘°νλ₯Ό μν μ‘°κ±΄ νν°λ§ λ° κ²μ κΈ°λ₯
>  - κ΄λ¦¬μμ μΌλ° νμμ λ°λ₯Έ μ‘°ν 
>- μν κ΄λ¦¬ - `update` `delete`

#### β Order
>- μν μ£Όλ¬Έ - `create`
>- μ£Όλ¬Έ λ΄μ­ μ‘°ν - `read`
>- μ£Όλ¬Έ μ·¨μ - `delete`

#### β Cart
>- μ₯λ°κ΅¬λμ μν μΆκ° - `create`
>- μ₯λ°κ΅¬λ μ‘°ν - `read`
>- μ₯λ°κ΅¬λ μν μ λ³΄ μμ  - `update`
>- μ₯λ°κ΅¬λμ μλ μν μ­μ  - `delete`
>- μ₯λ°κ΅¬λμ μλ μν μ£Όλ¬Έ

<br>

## πΎ Database Design

![](https://velog.velcdn.com/images/knavoid/post/f06d429e-3c31-4618-aa5b-3027f9cb1768/image.png)

- `member` : μΌνλͺ° νμ μ λ³΄ νμ΄λΈ
- `item` : μν μ λ³΄ νμ΄λΈ
- `item_img` : μν μ΄λ―Έμ§ μ λ³΄ νμ΄λΈ
- `order` : νμλ€μ μ£Όλ¬Έ μ λ³΄ νμ΄λΈ
- `order_item` : μ£Όλ¬Έμ΄ μλ£λ μν μ λ³΄ νμ΄λΈ
- `cart` : νμλ€μ΄ μμ±ν μ₯λ°κ΅¬λ μ λ³΄ νμ΄λΈ
- `cart_item` : μ₯λ°κ΅¬λμ λ΄κΈ΄ μν μ λ³΄ νμ΄λΈ

<br>

## π API Design

<table>
  
  <tr>
    <th align="center" width="200">Method</th>
    <th align="center" width="300">URL</th>
    <th align="center" width="300">Description</th>
  </tr>
  
  <tr>
    <td align="center">GET</td>
    <td>/</td>
    <td>λ©μΈ νμ΄μ§</td>
  </tr>
  <tr>
    <td align="center" colspan=3>Member</td>
  </tr>
  <tr>
    <td align="center">GET</td>
    <td>/members/new</td>
    <td>νμκ°μ νμ΄μ§</td>
  </tr>
  <tr>
    <td align="center">POST</td>
    <td>/members/new</td>
    <td>νμκ°μ</td>
  </tr>
  <tr>
    <td align="center">GET</td>
    <td>/members/login</td>
    <td>λ‘κ·ΈμΈ νμ΄μ§</td>
  </tr>
  <tr>
    <td align="center">GET</td>
    <td>/members/login/error</td>
    <td>λ‘κ·ΈμΈ μ€ν¨ νμ΄μ§</td>
  </tr>
  <tr>
    <td align="center" colspan=3>Item</td>
  </tr>
  <tr>
    <td align="center">GET</td>
    <td>/admin/item/new</td>
    <td>μν λ±λ‘ νμ΄μ§ (κ΄λ¦¬μ)</td>
  </tr>
  <tr>
    <td align="center">POST</td>
    <td>/admin/item/new</td>
    <td>μν λ±λ‘ (κ΄λ¦¬μ)</td>
  </tr>
  <tr>
    <td align="center">GET</td>
    <td>/admin/item/{itemID}</td>
    <td>μν μμ  νμ΄μ§ (κ΄λ¦¬μ)</td>
  </tr>
  <tr>
    <td align="center">POST</td>
    <td>/admin/item/{itemID}</td>
    <td>μν μμ  (κ΄λ¦¬μ)</td>
  </tr>
  <tr>
    <td align="center">GET</td>
    <td>/admin/items</td>
    <td>μν κ΄λ¦¬ νμ΄μ§ (κ΄λ¦¬μ)</td>
  </tr>
  <tr>
    <td align="center">GET</td>
    <td>/item/{itemId}</td>
    <td>μν μμΈ νμ΄μ§</td>
  </tr>
  <tr>
    <td align="center" colspan="3">Order</td>
  </tr>
  <tr>
    <td align="center">POST</td>
    <td>/order</td>
    <td>μν μ£Όλ¬Έ</td>
  </tr>
  <tr>
    <td align="center">GET</td>
    <td>/orders</td>
    <td>μ£Όλ¬Έ λ΄μ­ μ‘°ν</td>
  </tr>
  <tr>
    <td align="center">POST</td>
    <td>/order/{orderId}/cancel</td>
    <td>μ£Όλ¬Έ μ·¨μ</td>
  </tr>
  <tr>
    <td align="center" colspan="3">Cart</td>
  </tr>
  <tr>
    <td align="center">POST</td>
    <td>/cart</td>
    <td>μ₯λ°κ΅¬λμ μν μΆκ°</td>
  </tr>
  <tr>
    <td align="center">GET</td>
    <td>/cart</td>
    <td>μ₯λ°κ΅¬λ μ‘°ν</td>
  </tr>
  <tr>
    <td align="center">PATCH</td>
    <td>/cartItem/{cartItemId}</td>
    <td>μ₯λ°κ΅¬λ μν μλ λ³κ²½</td>
  </tr>
  <tr>
    <td align="center">DELETE</td>
    <td>/cartItem/{cartItemId}</td>
    <td>μ₯λ°κ΅¬λμμ μν μ κ±°</td>
  </tr>
  <tr>
    <td align="center">POST</td>
    <td>/cart/order</td>
    <td>μ₯λ°κ΅¬λ μν μ£Όλ¬Έ</td>
  </tr>

</table>
