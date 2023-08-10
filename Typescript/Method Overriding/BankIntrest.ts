class Bank {
    getRateOfIntrest(): number {

        return 0;
    }
}

class SBI extends Bank {
    getRateOfIntrest(): number {
        return 8;
    }
}

class ICICI extends Bank {
    getRateOfIntrest(): number {
        return 7;
    }
}
class Axis extends Bank {
    getRateOfIntrest(): number {
        return 9;
    }
}

class Test {

    sbi(): void {
        let s: SBI = new SBI();
        console.log(s.getRateOfIntrest());
    }
    icici(): void {
        let i: ICICI = new ICICI();
        console.log(i.getRateOfIntrest());
    }
    axis(): void {
        let a: Axis = new Axis();
        console.log(a.getRateOfIntrest());
    }
}

let i: Test = new Test();
i.axis();
i.icici();
i.sbi();
