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
> StringPlusCalculator : 입력한 문자열을 계산 가능한 숫자 리스트로 전환, 숫자 리스트를 더하여 반환
- [x] 빈 문자열 또는 null이 입력되면 0을 반환
- [ ] 숫자 하나를 문자열로 입력하면 해당 숫자를 반환
- [x] 커스텀 구분자를 입력했는지 구분
- [ ] 입력된 구분자로 문자열을 분리
- [x] [예외] 문자열 리스트 중 숫자가 아닌게 있다면 예외 발생
- [x] [예외] 문자열이 숫자가 아니면 예외 발생

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
