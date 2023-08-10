import { service } from "./service";
import { entity } from "./entity";

export class implementaion implements service {

    createStudent(e: entity): entity {


        return e;
    }

    readStudent(a: Array<entity>): void {
    }
}