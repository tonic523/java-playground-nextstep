## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## mission1
### 📌 문자열 계산기
- 사칙연산이 가능한 Calculator 클래스 구현
- Calculator를 상속받는 문자열 계산기 구현
  - 입력받은 문자열을 연산자, 피연산자의 배열로 저장
  - 배열을 앞에서부터 순서대로 계산하여 총 결과값을 구할 수 있다.

### 📌 숫자야구게임(baseball)
#### 구현할 기능 목록
- Player
  - 3자리 수를 가지고 있다.
  - 자신의 임의의 3자리 수를 설정할 수 있다.
  - 상대방이 3자리의 수를 주면 비교하여 힌트를 알려준다.

- Application
  - 입력한 문자열을 숫자 배열로 변환
  - 입력한 값이 3자리의 수이고 1~9인지 검증
  - 입력한 숫자들을 컴퓨터에게 전달
  - 컴퓨터에게 받은 힌트로 무엇을 출력할지 Prompt에 전달

- Prompt
  - 입력 UI
  - 힌트 출력 UI
  - 맞췄을 때 UI
---
## mission2
### 📌 문자열 덧셈 계산기
#### 📝 스토리보드
1. 입력
   - 기본 구분자로 ";", ":" 를 가진다.
   - 커스텀 구분자가 있다면 커스텀 구분자를 가진다.
   - 구분자로 숫자를 분리한다.
   - [예외] 숫자를 분리했을 때 숫자 이외의 값 혹은 음수라면 예외 발생
2. 출력
   - 숫자를 모두 더한 값을 출력

#### 📍 구현할 기능
> StringPlusCalculator : 입력한 문자열이 계산 가능한지 확인, 가능하면 더한 값 반환
- [x] 빈 문자열 또는 null이 입력되면 0을 반환
- [x] 입력된 문자열을 구분자, 식으로 분리
- [x] 구분자와 문자열로 숫자의 총합 구하기
- [x] [예외] 문자열 리스트 중 숫자가 아닌게 있다면 예외 발생
- [x] [예외] 문자열이 숫자가 아니면 예외 발생

### 📌 자동차 경주 게임
#### 📝 스토리보드
1. 입력
   - 자동차 이름 입력 (,로 구분)
   - [예외] 자동차 이름은 5자까지
   - 자동차들의 움직임을 시도할 횟수 입력
   - [예외] 입력한 값은 숫자여야만 한다.
2. 게임 진행
   - 입력한 횟수 만큼 자동차들이 움직인다.
   - 이 때 자동차들은 움직일지 안움직일지를 결정한다.(랜덤)
3. 종료
   - 가장 많이 움직인 차의 이름을 출력
   - 1등이 여러명이면 여러명 출력

#### 📍 구현할 기능
> Car : 이름, 위치를 가진다.
- [x] 1칸씩 위치를 이동할 수 있다.
- [x] [예외] 차의 이름은 5자까지 가능
- [x] 이름, 위치를 반환

> Game
- [ ] 입력값을 , 로 구분하여 경주할 자동차를 리스트로 가진다.
- [ ] 회수마다 움직일 자동차를 랜덤으로 선정한다.
- [ ] 경주하는 자동차 중 가장 많이 전진한 위치 값을 구한다.
- [ ] 경주하는 자동차 중 많이 전진한 위치 값을 기준으로 우승자 리스트를 구한다.
- [ ] [예외] 입력한 회수가 숫자인지 검사

> View
- [x] 경주할 차 입력시 UI
- [x] 회수 입력시 UI
- [x] 회수 마다 실행 결과 UI
- [x] 최종 우승 UI

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```
