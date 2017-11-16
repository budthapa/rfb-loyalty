import { BaseEntity } from './../../shared';

export class RfbUser implements BaseEntity {
    constructor(
        public id?: number,
        public username?: string,
        public locationId?: number,
    ) {
    }
}
