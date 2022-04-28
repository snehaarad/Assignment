class circle{
    Circumference:number;
    radius:number;
    id:number;
    distance:number;
    times:number;
    constructor(radius:number,id:number,distance:number)
    {
        this.radius=radius;
        this.id=id;
        this.distance=distance;
    }
    disp()
    {
        this.Circumference=2*this.id*this.radius;
        this.times=this.distance/this.Circumference;
        console.log("Ring rotations=" +this.times);
    }
}
let C=new circle(9,15/4,140);
C.disp();