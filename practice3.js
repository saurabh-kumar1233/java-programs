// // let x=0;
// // for(x=0;x<=100;x++)
// // {
// //     document.write(x);
// // }
// /*x=prompt("enter your number you eant to find the even number");
// if(x%2==0)
// {
//     document.write("number is even: ");

// }
// else
// {
//     document.write("number is odd");
// }*/
// <select id="music" name="musics">
// <option selected>saurabh</option>
// <option>kanha music</option>
// <option>shiva music</option>


// </select>
function countSelected(selectObject) {
    let numberSelected = 0;
    for (let i = 0; i < selectObject.options.length; i++) {
      if (selectObject.options[i].selected) {
        numberSelected++;
      }
    }
    return numberSelected;
  }
  
  const btn = document.getElementById("btn");
  
  btn.addEventListener("click", () => {
    const musicTypes = document.selectForm.musicTypes;
    console.log(`You have selected ${countSelected(musicTypes)} option(s).`);
  });