package com.yasha.academy.model;

/**
 * Created by Onkar on 5/14/2017.
 */

public class LessonDocDetail
{
    private long RecId,LessionDetailId,SequenceNo;

    public String getPath() {
        return Path;
    }

    public void setPath(String path) {
        Path = path;
    }

    public long getSequenceNo() {
        return SequenceNo;
    }

    public void setSequenceNo(long sequenceNo) {
        SequenceNo = sequenceNo;
    }

    public long getLessionDetailId() {
        return LessionDetailId;
    }

    public void setLessionDetailId(long lessionDetailId) {
        LessionDetailId = lessionDetailId;
    }

    public long getRecId() {
        return RecId;
    }

    public void setRecId(long recId) {
        RecId = recId;
    }

    private String Path;
}
