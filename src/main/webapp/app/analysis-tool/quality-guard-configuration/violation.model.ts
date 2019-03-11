import { BaseEntity } from './../../shared';
import { ConditionViolation } from './condition-violation.model';

export const enum GuardStatus {
    'SUCCESS',
    'WARNING',
    'ERROR'
}

export class Violation implements BaseEntity {
    constructor(
        public id?: number,
        public incidentStartDate?: string,
        public incidentEndDate?: string,
        public violationStatus?: GuardStatus,
        public qualityGuard?: BaseEntity,
        public conditionViolations?: ConditionViolation[],
    ) {
    }
}
