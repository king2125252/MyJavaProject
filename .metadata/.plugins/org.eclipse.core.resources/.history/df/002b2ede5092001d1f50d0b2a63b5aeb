$('#Aloc_name').keyup(function (e) {
  let errorMsg = $('#loc-errorMsg')
  if (($(this).val()).trim().length === 0) {
    errorMsg.css('color', 'red');
    errorMsg.text('❌請勿空白');
    setAllValid('locName', false);
  } else {
    errorMsg.text('✅');
    setAllValid('locName', true);
  }
});

$('#Alongitude').keyup(function (e) {
  let regExp = /^[0-9.]+$/;
  let val = $(this).val();
  let errorMsg = $('#long-errorMsg');
  if (val.trim().length === 0) {
    errorMsg.css('color', 'red');
    errorMsg.text('❌請勿空白');
    setAllValid('longitude', false);
  } else if (!regExp.test(val)) {
    errorMsg.css('color', 'red');
    errorMsg.text('❌格式錯誤');
    setAllValid('longitude', false);
  }else{
    errorMsg.text('✅');
    setAllValid('longitude', true);
  }
});

$('#Alatitude').keyup(function (e) {
  let regExp = /^[0-9.]+$/;
  let val = $(this).val();
  let errorMsg = $('#alati-errorMsg');
  if (val.trim().length === 0) {
    errorMsg.css('color', 'red');
    errorMsg.text('❌請勿空白');
    setAllValid('latitude', false);
  } else if (!regExp.test(val)) {
    errorMsg.css('color', 'red');
    errorMsg.text('❌格式錯誤');
    setAllValid('latitude', false);
  }else{
    errorMsg.text('✅');
    setAllValid('latitude', true);
  }
});

$('#Aaddress').keyup(function (e) {
  let errorMsg = $('#address-errorMsg')
  if (($(this).val()).trim().length === 0) {
    errorMsg.css('color', 'red');
    errorMsg.text('❌請勿空白');
    setAllValid('address', false);
  } else {
    errorMsg.text('✅');
    setAllValid('address', true);
  }
});

$('#Aphone').keyup(function (e) {
  let regExp = /^-?[0-9]+$/;
  let val = $(this).val();
  let errorMsg = $('#phone-errorMsg');
  if (!regExp.test(val)) {
    errorMsg.css('color', 'red');
    errorMsg.text('❌格式錯誤');
    setAllValid('phone', false);
  }else{
    errorMsg.text('✅');
    setAllValid('phone', true);
  }
});

let cdtMap = new Map();
function setAllValid(key, value){
  cdtMap.set(key, value);

  if(cdtMap.size === 5){
    let num = 0;
    for(let value of cdtMap.values()){
      if(value === true){
        num++;
      }
    }
    if(num === 5){
      $("#send").prop("disabled", false);
    }else{
      $("#send").prop("disabled", true);
    }
    console.log(num);
  }
}


