$(document).ready(function () {

    $('.delete-batch').on('click', function () {
        var path = /*[[@{/}]]*/'remove';
        var id = $(this).attr('batchId');

        bootbox.confirm({
            message: "Czy napewno chcesz usunąć tę partię",
            buttons: {
                cancel: {
                    label: "Cofnij"
                },
                confirm: {
                    label: "Usuń"
                },
            },
            callback: function (confirmed) {
                if(confirmed) {
                    $.post(path+"?id="+id, function (res) {
                        location.reload();
                    });
                }
            }
        });
    });
});