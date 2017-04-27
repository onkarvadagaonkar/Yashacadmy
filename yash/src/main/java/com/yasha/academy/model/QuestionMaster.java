package com.yasha.academy.model;

/**
 * Created by Onkar on 4/27/2017.
 */

public class QuestionMaster
{
    private long QuestionId,EnterBy, EnterDate, ChangedBy, ChangedDate;
    private String QuestionName, Question, Option1, Option2, Option3, Option4, Option5, Option6, Answer, Description, Marks, Attachment1, Attachment2;
    private boolean DeleteStatus;

    public boolean isCommon() {
        return IsCommon;
    }

    public void setCommon(boolean common) {
        IsCommon = common;
    }

    public long getQuestionId() {
        return QuestionId;
    }

    public void setQuestionId(long questionId) {
        QuestionId = questionId;
    }

    public long getEnterBy() {
        return EnterBy;
    }

    public void setEnterBy(long enterBy) {
        EnterBy = enterBy;
    }

    public long getEnterDate() {
        return EnterDate;
    }

    public void setEnterDate(long enterDate) {
        EnterDate = enterDate;
    }

    public long getChangedBy() {
        return ChangedBy;
    }

    public void setChangedBy(long changedBy) {
        ChangedBy = changedBy;
    }

    public long getChangedDate() {
        return ChangedDate;
    }

    public void setChangedDate(long changedDate) {
        ChangedDate = changedDate;
    }

    public String getQuestionName() {
        return QuestionName;
    }

    public void setQuestionName(String questionName) {
        QuestionName = questionName;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getOption1() {
        return Option1;
    }

    public void setOption1(String option1) {
        Option1 = option1;
    }

    public String getOption2() {
        return Option2;
    }

    public void setOption2(String option2) {
        Option2 = option2;
    }

    public String getOption3() {
        return Option3;
    }

    public void setOption3(String option3) {
        Option3 = option3;
    }

    public String getOption4() {
        return Option4;
    }

    public void setOption4(String option4) {
        Option4 = option4;
    }

    public String getOption5() {
        return Option5;
    }

    public void setOption5(String option5) {
        Option5 = option5;
    }

    public String getOption6() {
        return Option6;
    }

    public void setOption6(String option6) {
        Option6 = option6;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getMarks() {
        return Marks;
    }

    public void setMarks(String marks) {
        Marks = marks;
    }

    public String getAttachment1() {
        return Attachment1;
    }

    public void setAttachment1(String attachment1) {
        Attachment1 = attachment1;
    }

    public String getAttachment2() {
        return Attachment2;
    }

    public void setAttachment2(String attachment2) {
        Attachment2 = attachment2;
    }

    public boolean isDeleteStatus() {
        return DeleteStatus;
    }

    public void setDeleteStatus(boolean deleteStatus) {
        DeleteStatus = deleteStatus;
    }

    private boolean IsCommon;
}
