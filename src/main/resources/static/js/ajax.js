$(function(){
    $("#more").click(function(){
        console.log("clicked");
        var next_page = parseInt($(this).attr("current-page"))+1;

        $.ajax({
        method: "GET",
        url:"/post",
        data: {"page": next_page}
        })

        .done(function(response) {
                for(var post of response){     // 응답받은 글 리스트 요소를 0번쨰 부터 순회
                    $("#more-posts").append("<div class =\"post-preview\" >" +
                        "<a href = \"/post/" + post.id + "\">" +
                        "<h2 class = \"post-title\">" +
                        post.title +
                        "</h2>\n" +
                        "<h3 class =\"post-subtitle\">"  +
                        post.content +
                        "</h3></a><p class = \"post-meta\"> Posted by" +
                        post.username +
                        "</p></div><hr class =\"my-4\" />");
                }

             });
             $(this).attr("current-page", next_page);     // current-page값을 next_page 데이터로 변경하겠다.
        });

        $("#create_button").click(function(){
            var title = $("#post-title").val();
            var username = $("#post-username").val();
            var content = $("#post-content").val();

            $.ajax({
                method: "POST",
                url: "/post",
                date: JSON.stringify({
                    "title" : title,
                    "username" : username,
                    "content" : content
                }),
                contentType: "application/json"
            })

            .done(function(response){
                console.log("Post creation success!");
                window.location.href = "/";

            });
        });


    $(".comment-edit").hide();

    $(".comment-edit-form-button").click(function(){
        $(this).closest(".comment_text").find(".comment-edit").show();
    });

    $(".comment-edit-cancel-button").click(function(){
        $(this).closest(".comment_text").find(".comment-edit").hide();
    });




});