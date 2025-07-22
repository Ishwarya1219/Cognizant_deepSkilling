import React from "react";
function PostItem({post}){
    return(
        <div>
            <h2>{post.title}</h2>
            <p>{post.body}</p>
        </div>
    );
}
export default PostItem;