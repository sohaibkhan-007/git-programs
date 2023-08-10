
import { entity } from "./entity";
export interface service {

    createStudent(e: entity): entity;
    readStudent(a: Array<entity>): void;
    updateStudent(e: entity): entity;
    deleteStudent(id: number, a: Array<entity>): entity;

}