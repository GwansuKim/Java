/**
 * empList.js
 */

//목록 출력하기
function showIndex() {
  fetch("../empListJson")
    .then((resolve) => resolve.json())
    .then((result) => {
      result.forEach(function (item, idx, arry) {
        let tr = makeTr(item);
        list.append(tr);
      });
    })
    .catch((reject) => {
      console.log(reject);
    });
}
showIndex();

// 체크 박스 -> 전체 체크 박스 반영
let chkCnt = document.querySelectorAll('tbody input[type="checkbox"]');

// 저장버튼에 submit 이벤트 등록
document
  .querySelector("form[name='empForm']")
  .addEventListener("submit", addMember);

// 전체 선택 체크 박스
document
  .querySelector('thead input[type="checkbox"]')
  .addEventListener("change", allCheckChange);

// 전체 삭제 버튼
let cnt = document
  .querySelector('input[id="delSelectedBtn"]')
  .addEventListener("click", deleteCheckedFnc);

// 데이터 1건(1명의 데이터)을 이용해서 tr 요소 생성
function makeTr(item) {
  let titles = ["id", "lastName", "email", "hireDate", "job"];
  let tr = document.createElement("tr");

  titles.forEach(function (title) {
    let td = document.createElement("td");
    td.innerText = item[title];
    tr.append(td);
  });
  let td = document.createElement("td");
  let btn = document.createElement("button");
  btn.innerText = "삭제";
  btn.addEventListener("click", removeBtn);
  td.append(btn);
  tr.append(td);
  let btn1 = document.createElement("button");
  btn1.innerText = "수정";
  btn1.addEventListener("click", modifyTrFunc);
  td.append(btn1);
  tr.append(td);
  //체크박스
  td = document.createElement("td");
  let chk = document.createElement("input");
  chk.setAttribute("type", "checkbox");
  chk.addEventListener("change", checkChange);
  td.append(chk);
  tr.append(td);
  // tr반환
  return tr;
}

// 삭제 버튼 이벤트 콜백 함수
function removeBtn() {
  fetch("../empListJson?del_id=" + this.closest("tr").children[0].innerText, {
    method: "DELETE",
  })
    .then((resolve) => resolve.json())
    .then((result) => {
      if (result.cnt == 1) {
        alert("삭제 완료");
        this.closest("tr").remove();
      } else if (result.failCnt == 1) {
        alert("삭제중 오류 발생");
      }
    })
    .catch((reject) => console.log(reject));
}

// 저장 처리 함수
function addMember(evt) {
  evt.preventDefault();
  console.log("여기에 출력");
  let id = document.querySelector(`input[name="emp_id"]`).value;
  let name = document.querySelector(`input[name="last_name"]`).value;
  let email = document.querySelector(`input[name="email"]`).value;
  let hDate = document.querySelector(`input[name="hire_date"]`).value;
  let job = document.querySelector(`input[name="job_id"]`).value;

  if (!id || !name || !email || !hDate || !job) {
    alert("필수 입력값을 확인");
    return;
  }
  fetch("../empListJson", {
    method: "POST",
    headers: { "CONTENT-TYPE": "application/x-www-form-urlencoded" }, //key=val&key1-val1
    body:
      "param=insert&id=" +
      id +
      "&name=" +
      name +
      "&email=" +
      email +
      "&hDate=" +
      hDate +
      "&job=" +
      job,
  })
    .then((resolve) => resolve.json())
    .then((result) => {
      if (result.retCode == "Success") {
        alert("정상처리");
        list.append(
          makeTr({
            id: id,
            lastName: name,
            email: email,
            hireDate: hDate,
            job: job,
          })
        );
        document.querySelector(`input[name="emp_id"]`).value = "";
        document.querySelector(`input[name="last_name"]`).value = "";
        document.querySelector(`input[name="email"]`).value = "";
        document.querySelector(`input[name="hire_date"]`).value = "";
        document.querySelector(`input[name="job_id"]`).value = "";
      } else if (result.retCode == "Fail") {
        alert("처리실패");
      }
    })
    .catch((reject) => {
      console.log(reject);
    });
}

// 수정화면 함수
function modifyTrFunc() {
  // this => 수정 버튼
  let allBtn = document.querySelectorAll("tbody button");
  for (let i = 0; i < allBtn.length; i++) {
    allBtn[i].disabled = true;
  }

  let thisTr = this.closest("tr");
  let id = thisTr.children[0].innerText;
  let name = thisTr.children[1].innerText;
  let email = thisTr.children[2].innerText;
  let hDate = thisTr.children[3].innerText;
  let job = thisTr.children[4].innerText;

  let newTr = document.createElement("tr");

  let td = document.createElement("td");
  td.innerText = id;
  newTr.append(td);
  let list = [name, email, hDate, job];
  list.forEach(function (title) {
    td = document.createElement("td");
    let input = document.createElement("input");
    input.style = "width: 100px";
    input.value = title;
    td.append(input);
    newTr.append(td);
  });
  td = document.createElement("td");
  let btn = document.createElement("button");
  btn.innerText = "삭제";
  btn.disabled = true;
  td.append(btn);
  newTr.append(td);
  let btn1 = document.createElement("button");
  btn1.innerText = "변경";
  btn1.addEventListener("click", updateBtn);
  td.append(btn1);
  td = document.createElement("td");
  let chk = document.createElement("input");
  chk.setAttribute("type", "checkbox");
  td.append(chk);
  newTr.append(td);

  thisTr.replaceWith(newTr);
}

// 수정처리 함수
function updateBtn() {
  let thisTr = this.closest("tr");
  let id = thisTr.children[0].innerText;
  let name = thisTr.children[1].children[0].value;
  let email = thisTr.children[2].children[0].value;
  let hDate = thisTr.children[3].children[0].value;
  let job = thisTr.children[4].children[0].value;

  let item = {
    id: id,
    lastName: name,
    email: email,
    hireDate: hDate,
    job: job,
  };
  fetch("../empListJson", {
    method: "POST",
    headers: { "CONTENT-TYPE": "application/x-www-form-urlencoded" }, //key=val&key1-val1
    body:
      "param=update&id=" +
      id +
      "&name=" +
      name +
      "&email=" +
      email +
      "&hDate=" +
      hDate +
      "&job=" +
      job,
  })
    .then((resolve) => resolve.json())
    .then((result) => {
      if (result.retCode == "Success") {
        alert("정상처리");
        let tr = makeTr(item);
        thisTr.replaceWith(tr);
        let allBtn = document.querySelectorAll("tbody button");
        for (let i = 0; i < allBtn.length; i++) {
          allBtn[i].disabled = false;
        }
      } else if (result.retCode == "Fail") {
        alert("처리중 오류 발생");
      }
    });
}

// 전체 체크 함수
function allCheckChange() {
  document.querySelectorAll('tbody input[type="checkbox"]').forEach((chk) => {
    chk.checked = this.checked;
  });
}

// 개별 체크 함수
function checkChange() {
  let firChkBox = document.querySelector('thead input[type="checkbox"]');

  let othChkBox = document.querySelectorAll('tbody input[type="checkbox"]');

  for (let i = 0; i < othChkBox.length; i++) {
    if (othChkBox[i].checked != true) {
      firChkBox.checked = false;
      return;
    }
  }
  firChkBox.checked = true;
}

// 체크된 항목 전체 삭제
function deleteCheckedFnc() {
  let tr = document.querySelectorAll('tbody input[type="checkbox"]:checked');
  let str = "";
  for (let i = 0; i < tr.length; i++) {
    str += tr[i].closest("tr").children[0].innerText + ",";
  }
  fetch("../empListJson?del_id=" + str, {
    method: "DELETE",
  })
    .then((resolve) => resolve.json())
    .then((result) => {
      if (result.failCnt == 0) {
        alert(result.cnt + "건 삭제 완료");
      } else {
        alert(result.failCnt + "건 삭제 중 오류 발생");
      }
      document.querySelector("tbody").innerHTML = "";
      showIndex();
    })
    .catch((reject) => {
      console.log(reject);
    });
}
