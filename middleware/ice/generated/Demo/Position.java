// **********************************************************************
//
// Copyright (c) 2003-2017 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.7.0
//
// <auto-generated>
//
// Generated from file `classes.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package Demo;

public class Position implements java.lang.Cloneable,
                                 java.io.Serializable
{
    public long x;

    public long y;

    public Position()
    {
    }

    public Position(long x, long y)
    {
        this.x = x;
        this.y = y;
    }

    public boolean equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        Position r = null;
        if(rhs instanceof Position)
        {
            r = (Position)rhs;
        }

        if(r != null)
        {
            if(this.x != r.x)
            {
                return false;
            }
            if(this.y != r.y)
            {
                return false;
            }

            return true;
        }

        return false;
    }

    public int hashCode()
    {
        int h_ = 5381;
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, "::Demo::Position");
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, x);
        h_ = com.zeroc.IceInternal.HashUtil.hashAdd(h_, y);
        return h_;
    }

    public Position clone()
    {
        Position c = null;
        try
        {
            c = (Position)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void ice_writeMembers(com.zeroc.Ice.OutputStream ostr)
    {
        ostr.writeLong(this.x);
        ostr.writeLong(this.y);
    }

    public void ice_readMembers(com.zeroc.Ice.InputStream istr)
    {
        this.x = istr.readLong();
        this.y = istr.readLong();
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, Position v)
    {
        if(v == null)
        {
            _nullMarshalValue.ice_writeMembers(ostr);
        }
        else
        {
            v.ice_writeMembers(ostr);
        }
    }

    static public Position ice_read(com.zeroc.Ice.InputStream istr)
    {
        Position v = new Position();
        v.ice_readMembers(istr);
        return v;
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, java.util.Optional<Position> v)
    {
        if(v != null && v.isPresent())
        {
            ice_write(ostr, tag, v.get());
        }
    }

    static public void ice_write(com.zeroc.Ice.OutputStream ostr, int tag, Position v)
    {
        if(ostr.writeOptional(tag, com.zeroc.Ice.OptionalFormat.VSize))
        {
            ostr.writeSize(16);
            ice_write(ostr, v);
        }
    }

    static public java.util.Optional<Position> ice_read(com.zeroc.Ice.InputStream istr, int tag)
    {
        if(istr.readOptional(tag, com.zeroc.Ice.OptionalFormat.VSize))
        {
            istr.skipSize();
            return java.util.Optional.of(Position.ice_read(istr));
        }
        else
        {
            return java.util.Optional.empty();
        }
    }

    private static final Position _nullMarshalValue = new Position();

    public static final long serialVersionUID = 570840570936475152L;
}
