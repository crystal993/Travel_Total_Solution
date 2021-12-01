# Travel_Total_Solution - 편행 : 편한여행 

  ![](https://images.velog.io/images/ggg5483/post/822a7a35-4087-4c89-8d71-7f629bc4b1cf/%ED%8E%B8%E8%A1%8C-_-%ED%8E%B8%ED%95%9C%EC%97%AC%ED%96%89-Chrome-2021-09-20-18-35-20.gif)

## 기간 : 7/25 ~ 8/19

지난 7월 말부터 8월 19일까지 약 <span style='background-color:	#fff5b1'> **4주간 '편행: 편한여행'이라는 여행 교통편, 숙박 업소 데이터를 크롤링과 공공데이터 api를 활용하여 데이터 수집 후 내가 가진 예산을 입력하면 여행지를 갈 수 있도록 하는 예약 웹사이트** </span>를 개발했습니다. 총 4명이서 기획부터 DB설계, 개발을 진행하였다. 

## 1. 개발 동기 

<span style='background-color:	#fff5b1'>내가 가진 돈이 10만원 밖에 없는데 내일 당장 훌쩍 여행을 떠나고 싶을 때</span>가 다들 있었을 것이다. 

당장 떠나고 싶어서 숙소 예약, 교통편 예약 따로 따로 보다가 여행 가는 거 자체를 포기한 적이 한 두번이 아니었다.. 숙소와 교통편은 얼마나 많은지..🤣 나같은 결정 장애들은 어디로 갈지 고르는 것도 너무 힘들다..😢 

그래서 <span style='background-color:	#fff5b1'>즉흥 여행러들을 위한 사이트</span>를 만들면 어떨까?! 생각했다. 
**편行: 편한 여행** 에서 <span style='background-color:		#dcffe4'>2가지</span>를 포인트로 잡았다. 
> 1.  **심플함**
> 2.  **선택의 폭을 줄여주자!**

👉 여행계획을 세우는 게 즐거운 사람들도 있겠지만 계획 세우기 어렵고 스트레스인 사람들을 위한 사이트이다.

### 🚀 1) 국내여행이 대세
초기 컨셉을 위와 같이 잡았기 때문에 <span style='background-color:	#fff5b1'> **여행 지역 범위를 결정할 필요** </span>가 있었다. <span style='background-color:	#fff5b1'> **해외?** **국내?** **해외+국내?** </span> 어디로 할까 고민하다가 <span style='background-color:#dcffe4'> **국내여행** </span> 만으로 결정했다. 이유는 밑의 슬라이드에 쓴 것과 같이 <span style='background-color:#dcffe4'> ** 코로나로 인해 향후 몇년간은 국내여행이 증가할 것이기 때문이다. **

![](https://images.velog.io/images/ggg5483/post/ddc4408f-8a67-484f-b6b8-5fca079c0d82/image.png) 

### 🤦‍♀️ 2) 1박 2일로 당장 여행 떠나고 싶은 여행러들을 위한 사이트

![](https://images.velog.io/images/ggg5483/post/eb47ff0a-ab33-49b7-b222-dc8baefde34f/image.png) 

👉 웹사이트를 이용할 타겟층이다. 
> 1. 적은 예산일지라도 1박 2일 국내여행을 훌쩍 떠나고 싶은 사람
> 2. 여행 계획을 세우는 게 스트레스인 사람

<br>

## 2. 도입 효과

![](https://images.velog.io/images/ggg5483/post/3203af8c-319b-472f-a42b-3b050be11cee/image.png)

👉 도입효과는 다음과 같이 2가지에 초점을 맞추었다. 


<br>

## 3. 설계
아래는 카카오 오븐으로 UI화면만 설계 해놓은 페이지입니다. 웹사이트 이용도 어려우면 절대 안되므로 정말 <span style='background-color:#dcffe4'>**단순**</span>하고 <span style='background-color:#dcffe4'>**직관적**</span>으로 알아볼 수 있도록 메인페이지를 설계 했다. 

![](https://images.velog.io/images/ggg5483/post/9db8fd1e-ed54-41b6-bb7a-be33b0cfb373/image.png)


> 1. '출발지' 와 '예산'만 입력해서 검색 

![](https://images.velog.io/images/ggg5483/post/196e1354-874c-4e9a-b840-a81c92ec33b8/image.png)


> 2. 검색하면 나오는 페이지. 
교통편 + 숙소 평점을 기준으로 한번에 결제 

👉 간단하게 한 거라 실제로 구현된 페이지와 많이 차이가 난다.

<br>


## 4. 기술 스택  

개발에 앞서 기술 스택을 다음과 같이 정했다. 

![](https://images.velog.io/images/ggg5483/post/6728ed1e-f126-4813-abc7-3f8e72cb1e4b/image.png)

- **Front**
	- HTML, CSS, Javascript, Bootstrap 
- **Back **
	- Java - version11, SpringBoot, **Oracle**, Maven, Python- numpy, pandas

<BR> 

  
## 5. 주요 기능 

> 1. <span style='background-color: #fff5b1'>웹 스크롤링</span> - 숙박, 항공의 데이터 확보를 자동화 
> 2. <span style='background-color: #fff5b1'> 공공 API</span> - 버스, 기차 데이터 확보 
> 3. <span style='background-color: #fff5b1'> 여행지 랜덤 검색 추천 서비스</span> - DB에서 검색한 조건에 맞는 여행지 랜덤 추천
> 4. <span style='background-color: #fff5b1'>리뷰 게시판 CRUD </span>  - 회원의 여행지 리뷰 게시판
> 5. <span style='background-color: #fff5b1'>동행 커뮤니티 게시판 CRUD</span> - 동행인을 구하는 동행게시판
> 6. 로그인/회원가입 - 일반회원, 관리자 
  
⭐ 가장 중요한 건 3번 <span style='background-color: #fff5b1'> 여행지 랜덤 검색 추천 서비스</span>기능이다. 
  
⭐ 그리고 5번 <span style='background-color: #fff5b1'>동행 커뮤니티 게시판</span> 기능 또한 굉장히 중요하다고 생각했다.  <span style='background-color:	#fff5b1'>즉흥 여행을 가는 만큼 여행 동행인도 구할 수 있도록 기능을 추가</span>했다. 

### 6. 구현 화면   
#### 1) 📌 메인 검색 페이지 
  ![](https://images.velog.io/images/ggg5483/post/822a7a35-4087-4c89-8d71-7f629bc4b1cf/%ED%8E%B8%E8%A1%8C-_-%ED%8E%B8%ED%95%9C%EC%97%AC%ED%96%89-Chrome-2021-09-20-18-35-20.gif)

👉 메인 검색 페이지에서 출발지와 예산을 검색한다. 
예시로 서울을 선택하고, 예산 100,000(십만원)을 입력했다.
  
#### 2)  여행지 추천 페이지  
  ![](https://images.velog.io/images/ggg5483/post/e4d8209b-5fb8-40ca-9d33-687532872a11/recommend-Chrome-2021-09-20-18-50-25.gif)

👉 여행지 추천 검색 쿼리문을 통해 내가 입력한 예산 내에서 평점 순이 높은 교통편과 숙박업소를 추천해준다.
  
#### 3) 📌 결제 - import API 이용
  ![](https://images.velog.io/images/ggg5483/post/8b1b461f-4867-4d36-9946-d3a289c5d322/import%202021-09-20%2018-57-07.gif)

👉 import API를 이용해서 결제 금액만큼 결제 되도록 했다. 자체적으로 서비스하려면 교통편, 숙소도 자동으로 결제가 되어야 하는데 그렇지는 않다. import API를 이용해 결제시스템 연동만 해놓았다.
  
#### 4) 📌 로그인 / 회원가입 
  ![](https://images.velog.io/images/ggg5483/post/58cd50a7-de68-473e-be0e-8944b408cb97/%ED%8E%B8%E8%A1%8C-_-LOGIN-Chrome-2021-09-20-19-02-17.gif)

👉 로그인과 회원가입은 부트스트랩을 이용해서 만들었다.  
  
#### 5) 📌 동행 커뮤니티 게시판 / 리뷰 게시판
  ![](https://images.velog.io/images/ggg5483/post/47fd1870-b923-47f0-aeb1-c83b2cf16403/%ED%8E%B8%E8%A1%8C-_-%ED%8E%B8%ED%95%9C%EC%97%AC%ED%96%89-%EB%8F%99%ED%96%89%EA%B2%8C%EC%8B%9C%ED%8C%90-2021-09-20-21-14-17.gif)

👉 동행 게시판과 리뷰게시판은 ui구성이 같다.

#### 5-1) 📌 동행 커뮤니티/리뷰 게시판 등록 (C) 
![](https://images.velog.io/images/ggg5483/post/173fed37-6a81-4cb4-8471-d0b63e71169b/%ED%8E%B8%E8%A1%8C-_-%ED%8E%B8%ED%95%9C%EC%97%AC%ED%96%89-%EB%8F%99%ED%96%89%EB%93%B1%EB%A1%9D-2021-09-20-21-18-37.gif)
#### 5-2) 📌 동행 커뮤니티/리뷰 게시판 수정 (U)
  ![](https://images.velog.io/images/ggg5483/post/cdb99028-9923-4e1f-853b-a6aea47ddca8/%ED%8E%B8%E8%A1%8C-_-%ED%8E%B8%ED%95%9C%EC%97%AC%ED%96%89-Chrome-2021-09-20-21-21-29.gif)
#### 5-3) 📌 동행 커뮤니티/리뷰 게시판 삭제 (D)
  ![](https://images.velog.io/images/ggg5483/post/652980a4-0a3d-476e-863f-d1335302b456/%ED%8E%B8%E8%A1%8C-_-%ED%8E%B8%ED%95%9C%EC%97%AC%ED%96%89-Chrome-2021-09-20-21-20-14.gif)

</br><br>
    
## 7. 문서 링크 

> - UI 기획서 : [링크](https://ovenapp.io/view/0QwZ3HKIhTv8DH9DWWox7Vwygo4xqAq8/lOMda) 
> - DB 명세서 : [링크](https://docs.google.com/spreadsheets/d/1g_t0QmnPzwaUX6by8_o_uBFfi-iaQyS5/edit?usp=sharing&ouid=109196121163795027186&rtpof=true&sd=true)  
> - 편행 기획서 : [링크](https://docs.google.com/presentation/d/1dR-VKNQkscXL7rqkBwjmH19Dllh1ithL/edit?usp=sharing&ouid=109196121163795027186&rtpof=true&sd=true)
> - 편행 repo : [링크](https://github.com/crystal993/Travel_Total_Solution) 


