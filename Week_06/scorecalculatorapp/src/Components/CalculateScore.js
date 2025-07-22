import '../Stylesheets/mystyle.css'

const percentToDecimal=(decimal)=>{
    return (decimal.toFixed(2)+'%')
}
const calcScore =(total,goal) =>{
     return percentToDecimal(total/goal)
}

export const CalculateScore =({Name,School,Total,goal})=>(
    <div className='formatstyle'>
        <h1><font color="Brown">Student Details:</font></h1>
        <div className='Name'>
            <b><span>Name:</span>
            <span>{Name}</span>
            </b>
        </div>
        <div className='School'>
            <b><span>School:</span>
            <span>{School}</span>
            </b>
        </div>
        <div className='Total'>
            <b><span>Total:</span>
            <span>{Total}</span>
            </b>
        </div>
        <div className='Score'>
            <b><span>Score:</span>
            <span>{calcScore(
                Total,goal
            )}</span>
            </b>
        </div>
    </div>
)