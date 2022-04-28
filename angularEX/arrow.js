var marks = [60, 78, 70, 89, 88, 90, 76];
marks.sort(function (a, b) {
    if (a > b)
        return 1;
    if (a < b)
        return -1;
    return 0;
});
console.log("marks of subject is");
console.log(marks);
