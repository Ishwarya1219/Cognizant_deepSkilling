import React from "react";
const BlogDetails =()=>{
    const blogs=[
        {id:1,title:"Learning React"},
        {id:2,title:"JS for Beginners"},
    ];
    return (
        <div>
            <h3>Blog Details</h3>
            <ul>
                {blogs.map((blog)=>{
                    return <li key={blog.id}>{blog.title}</li>
                })}
            </ul>
        </div>
    );
};
export default BlogDetails;