export class entity {

    private studentName: string;
    private studentRollNo: number;
    private studentMobileNumber: number;

    constructor(name: string, rollNo: number, mobile: number) {
        this.studentRollNo = rollNo;
        this.studentName = name;
        this.studentMobileNumber = mobile;

    }

    getStudentName(): string {

        return this.studentName;

    }

    getStudentRollNo(): number {

        return this.studentRollNo;

    }

    getStudentMobileNumber(): number {

        return this.studentMobileNumber;

    }
    setStudentName(name: string): void {

        this.studentName = name;

    }
    setStudentRollNo(rollNumber: number): void {

        this.studentRollNo = rollNumber;

    }
    setStudentMobileNumber(mobileNumber: number): void {

        this.studentMobileNumber = mobileNumber;

    }


}