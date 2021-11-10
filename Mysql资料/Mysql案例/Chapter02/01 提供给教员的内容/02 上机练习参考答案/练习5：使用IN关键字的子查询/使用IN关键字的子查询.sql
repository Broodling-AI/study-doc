SELECT `subjectName` FROM `subject` WHERE `gradeId` IN (
       SELECT `gradeId` FROM `grade` WHERE `gradeName`='S1'
);