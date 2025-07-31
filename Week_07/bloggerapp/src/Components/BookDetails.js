import React from "react";
const BookDetails =()=>{
    const books=["React basics","Advanced JS","Node.js Guide"];
    return(
        <div>
            <h3>Book Details</h3>
            <ul>
                {
                    books.map((book,index)=>(
                        <li key={index}>{book}</li>
                    ))
                }
            </ul>
        </div>
    )
};
export default BookDetails;