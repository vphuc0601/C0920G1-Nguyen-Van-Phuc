
function Confirm() {
    let name=document.getElementById("name").value;
    let cmnd=document.getElementById("cmnd").value;
    let birthday=document.getElementById("birthday").value;
    let mail=document.getElementById("mail").value;
    let adress=document.getElementById("adress").value;
    let custom=document.getElementById("custom").value;
    let sever=document.getElementById("sever").value;
    let type=document.getElementById("type").value;
    let price=document.getElementById("price").value;
    alert(
        "Họ và tên:"+name+"\n"+
        "CMND:"+cmnd+"\n"+
        "Ngày sinh:"+birthday+"\n"+
        "Email:"+mail+"\n"+
        "Địa chỉ:"+adress+"\n"+
        "Custom:"+custom+"\n"+
        "Dịch vụ:"+sever+"\n"+
        "Loại:"+type+"\n"+
        "Bảng giá:"+price
    );
}