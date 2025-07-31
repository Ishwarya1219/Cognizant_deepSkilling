import React from "react";
const CourseDetails =()=>{
    const courses=["Web development","Mobile Apps","AI basics"];
    return (
        <div>
            <h3>Course Details</h3>
            <ul>
                {
                    courses.map((course,idx)=>(
                        <li key={idx}>{course}</li>
                    ))
                }
            </ul>
        </div>
    );
};
export default CourseDetails;