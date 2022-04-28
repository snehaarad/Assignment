var circle = /** @class */ (function () {
    function circle(radius, id, distance) {
        this.radius = radius;
        this.id = id;
        this.distance = distance;
    }
    circle.prototype.disp = function () {
        this.Circumference = 2 * this.id * this.radius;
        this.times = this.distance / this.Circumference;
        console.log("Ring rotations=" + this.times);
    };
    return circle;
}());
var C = new circle(9, 15 / 4, 140);
C.disp();
