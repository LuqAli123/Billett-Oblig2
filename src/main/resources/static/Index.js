function regKinobillett() {
    const billett = {
        film: $("#film").val(),
        antall: $("#antall").val(),
        navn: $("#fornavn").val(),
        etternavn: $("#etternavn").val(),
        telefon: $("#telefonnr").val(),
        epost: $("#epost").val()
    };
    $.post("/lagre", billett, function (){
        hentAlle();
    });

    $("#film").val();
    $("#antall").val();
    $("#fornavn").val();
    $("#etternavn").val();
    $("#telefonnr").val();
    $("#epost").val();
}

function hentAlle(){
    $.get("/hentAlle",function (billetter){
        formaterData(billetter);
    })
}

function formaterData(billetter){

}