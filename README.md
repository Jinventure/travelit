# Travelit

"Travalit"이라는 단어는 "travel"과 "lit"을 합성어입니다.    
이는 여행이 매우 활기차고 열정적인 경험이라는 것을 나타냅니다. 이 단어는 여행이 즐거운, 활기찬 경험으로 기억되는 것을 의미할 수 있습니다.  

</br>

## 주제 선정 이유


여가 활동과 개인 시간의 중요성이 나날이 증가함에 따라 여행을 취미로 하는 인구 수가 지속적으로 증가하는 추세이다.  
이에 더해 각 지자체마다 인구감소로 인한 지역 소멸을 막기 위해 다양한 관광단지, 체험 프로그램들을 유치함으로써 외부 관광객들의 유입을 통한 지역 경제 활성화를 꾀하고 있어, 이전과 다르게 수많은 관광자원과 체험 프로그램이 전국에 골고루 분포되어 있다.  

다수의 여행지가 곳곳에 분포됨에  따라 개개인의 여행 루트, 목적 또한 다양해지며 정형화된 패키지 상품이 점점 사라지고 자유여행 기반의 여행 상품, 일일 클래스 상품, 액티비티, 티켓 등으로 여행 관련 상품 시장이 세분화되고 있다.  
이에 일정을 관리하기 위한 여행 플래너, 여행지 정보 등의 일정 및 데이터 관리 및 공유가 활발해짐에 따라 이를 위한 서비스를 구현해 보고자 한다.  


</br>


## 개발기간
- 2024.05-14 ~ 2024-06-05 ( 예정 )

</br>

---

## 기술스택

### ***FrontEnd***
![HTML5](https://img.shields.io/static/v1?style=for-the-badge&color=E34F26&message=HTML5&logo=HTML5&logoColor=white&label=)
![CSS3](https://img.shields.io/static/v1?style=for-the-badge&color=1572B6&message=CSS&logo=CSS3&logoColor=white&label=)
![JAVASCRIPT](https://img.shields.io/static/v1?style=for-the-badge&color=F7DF1E&message=JAVASCRIPT&logo=JavaScript&logoColor=white&label=)
![jQuery](https://img.shields.io/static/v1?style=for-the-badge&color=F7DF1E&message=jQuery&logo=jQuery&logoColor=white&label=)


### ***BackEnd***
![Java](https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white)
![SpringBoot](https://img.shields.io/static/v1?style=for-the-badge&color=6DB33F&message=spring+boot&logo=springboot&logoColor=white&label=)
![Thymeleaf](https://img.shields.io/static/v1?style=for-the-badge&color=005F0F&message=Thymeleaf&logo=Thymeleaf&logoColor=white&label=)
![Gradle](https://img.shields.io/static/v1?style=for-the-badge&color=02303A&message=Gradle&logo=Gradle&logoColor=white&label=)
![MyBatis](https://img.shields.io/badge/MyBatis-663399?style=for-the-badge&logo=MyBatis&logoColor=white)
![MySQL](https://img.shields.io/static/v1?style=for-the-badge&color=003545&message=MySQL&logo=MySQL&logoColor=white&label=)  

### ***Infra***
![AWS EC2](https://img.shields.io/static/v1?style=for-the-badge&color=FF9900&message=aws+ec2&logo=amazonec2&logoColor=black&label=)
![AWS S3](https://img.shields.io/static/v1?style=for-the-badge&color=569A31&message=aws+s3&logo=amazons3&logoColor=black&label=)
![AWS RDS](https://img.shields.io/static/v1?style=for-the-badge&color=527FFF&message=AWS+RDS&logo=amazonrds&logoColor=black&label=)


## 버전 정보  
- HTML5
- CSS3
- JDK17  
- SpringBoot 3.2.5
- MyBatis 3.0.3
- MySQL 8.0.36

</br>

<details>
<summary>🌳 폴더 구조</summary>

```
src─|
    java
    ├─common : Exception관련 파일이나 공통 클레스(aop, validation, converter, image upload) 파일로 구성
    ├─config : 각종 설정파일 구성
    ├─controller : 컨트롤러 파일 보관
    |    ├─ member (회원 패키지)
    |    ├─ product (상품 패키지)
    |    ├─ planner (플래너 패키지)
    |    ├─ location (지역 정보 패키지)
    ├─domain : mapper의 반환 값으로 사용될 클래스 구성
    |    ├─ member
    |    ├─ product
    |    ├─ planner
    |    ├─ location
    ├─dto
    |    ├─ request (request 즉, 요청 객체로 사용자가 서버쪽으로 데이터를 전달할 때 받을 DTO 선언)
    |        |    ├─ member (회원 패키지)
    |        |    ├─ product (상품 패키지)
    |        |    ├─ planner (플래너 패키지)
    |        |    ├─ location (지역 정보 패키지)
    |    ├─ response (response 즉, 응답 객체로 DB의 데이터를 해당 DTO로 받아서 최종적으로 사용자에게 반환할 DTO 선언)
    |        |    ├─ member (회원 패키지)
    |        |    ├─ product (상품 패키지)
    |        |    ├─ planner (플래너 패키지)
    |        |    ├─ location (지역 정보 패키지)
    ├─mapper : 매퍼 파일 보관
    |    ├─ member
    |    ├─ product
    |    ├─ planner
    |    ├─ location
    ├─security : spring security 파일 구성
    ├─service : 서비스 파일 보관
    |    ├─ member
    |    ├─ product
    |    ├─ planner
    |    ├─ location
    resources
    ├─mapper
    |    ├─ member
    |    ├─ product
    |    ├─ planner
    |    ├─ location
    |
    ├─ static
    │          ├─ css (css 파일 보관)
    │          │    ├─ member
    │          │    ├─ product
    │          │    ├─ planner
    │          │    ├─ location
    │          │
    │          │
    │          ├─ image (image 파일 보관)
    │          │    ├─ member
    │          │    ├─ product
    │          │    ├─ planner
    │          │    ├─ location
    │          │
    │          │
    │          ├─ js (js 파일 보관)
    │               ├─ member
    │               ├─ product
    │               ├─ planner
    │               ├─ location
    |
    |
    ├─ template
    |    ├─ member
    |    ├─ product
    |    ├─ planner
    |    ├─ location
    |    ├─ fragments
```
</details>

## 구성원(이름순)

<table>
	<tbody>
		<tr>
			<th><img width="150px" src="https://github.com/pjiny92.png" alt="박혜진"/></th>
			<th><img width="150px" src="https://github.com/sksrpf1126.png" alt="임성현"/></th>
			<th><img width="150px" src="https://github.com/HeegeneChae.png" alt="채희진"/></th>
			<th><img width="150px" src="https://github.com/JinyDev95.png" alt="최원진"/></th>
		</tr>
		<tr>
			<th><a href="https://github.com/pjiny92" target="_blank">박혜진</a></th>
			<th><a href="https://github.com/sksrpf1126" target="_blank">임성현</a></th>
			<th><a href="https://github.com/HeegeneChae" target="_blank">채희진</a></th>
			<th><a href="https://github.com/JinyDev95" target="_blank">최원진</a></th>
		</tr>
	</tbody>
</table>
