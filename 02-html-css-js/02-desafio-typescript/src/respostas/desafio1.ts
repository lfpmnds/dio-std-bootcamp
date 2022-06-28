// Possibilidade 1
const employee = {
    code: 10,
    name: 'John'
};

// Possibilidade 2
const employee2: {code: number, name: string} = {
    code: 10,
    name: 'John'
}

// Possibilidades 3 e 4
interface Employee {
    code: number,
    name: string
};

const employeeObj = {} as Employee;
employeeObj.code = 10;
employeeObj.name = 'John';

const employeeObj2: Employee = {
    code: 10,
    name: 'John'
}