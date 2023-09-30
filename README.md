# Quiz-App
This is API for Quiz , built from Spring Boot

# API Image : 

![image](https://github.com/Abdeali099/Quiz-App/assets/99460106/835a8ca1-2c22-46f1-9a0c-057307e5443c)

# API : 

<h3> For Questions :  <h3>
  
<strong>1) Add Question </strong> <pre> http://localhost:8080/api/question/add  </pre>
<br>
<strong>2) Get All Questions </strong>  <pre> http://localhost:8080/api/question/allQuestion </pre>
<br>
<strong>3) Get Question By Category </strong>  <pre> http://localhost:8080/api/question/category/{category} </pre>
<br>
<strong>4) Update Question </strong>  <pre> http://localhost:8080/api/question/update  </pre>
<br>
<strong>5) Delete Question </strong>  <pre> http://localhost:8080/api/question/delete/{id} </pre>
<br>

<h3> For Quiz  :  <h3>
  
<strong>1) Create Quiz </strong>  <pre> http://localhost:8080/api/quiz/create?category={category}&numQ={no_of_questions}&title={quiz_title}  </pre>
<br>
<strong>2) Get Quiz </strong>  <pre> http://localhost:8080/api/quiz/get/{id} </pre>
<br>
<strong>3) Submit Quiz </strong>  <pre> http://localhost:8080/api/quiz/submit/{id} </pre>
