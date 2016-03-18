/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.deri.iris.parser.node;

import org.deri.iris.parser.analysis.*;

@SuppressWarnings("nls")
public final class ATernaryBuiltin extends PBuiltin
{
    private PTerm _first_;
    private TTTerOp _tTerOp_;
    private PTerm _second_;
    private TTEq _tEq_;
    private PTerm _third_;

    public ATernaryBuiltin()
    {
        // Constructor
    }

    public ATernaryBuiltin(
        @SuppressWarnings("hiding") PTerm _first_,
        @SuppressWarnings("hiding") TTTerOp _tTerOp_,
        @SuppressWarnings("hiding") PTerm _second_,
        @SuppressWarnings("hiding") TTEq _tEq_,
        @SuppressWarnings("hiding") PTerm _third_)
    {
        // Constructor
        setFirst(_first_);

        setTTerOp(_tTerOp_);

        setSecond(_second_);

        setTEq(_tEq_);

        setThird(_third_);

    }

    @Override
    public Object clone()
    {
        return new ATernaryBuiltin(
            cloneNode(this._first_),
            cloneNode(this._tTerOp_),
            cloneNode(this._second_),
            cloneNode(this._tEq_),
            cloneNode(this._third_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATernaryBuiltin(this);
    }

    public PTerm getFirst()
    {
        return this._first_;
    }

    public void setFirst(PTerm node)
    {
        if(this._first_ != null)
        {
            this._first_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._first_ = node;
    }

    public TTTerOp getTTerOp()
    {
        return this._tTerOp_;
    }

    public void setTTerOp(TTTerOp node)
    {
        if(this._tTerOp_ != null)
        {
            this._tTerOp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tTerOp_ = node;
    }

    public PTerm getSecond()
    {
        return this._second_;
    }

    public void setSecond(PTerm node)
    {
        if(this._second_ != null)
        {
            this._second_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._second_ = node;
    }

    public TTEq getTEq()
    {
        return this._tEq_;
    }

    public void setTEq(TTEq node)
    {
        if(this._tEq_ != null)
        {
            this._tEq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tEq_ = node;
    }

    public PTerm getThird()
    {
        return this._third_;
    }

    public void setThird(PTerm node)
    {
        if(this._third_ != null)
        {
            this._third_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._third_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._first_)
            + toString(this._tTerOp_)
            + toString(this._second_)
            + toString(this._tEq_)
            + toString(this._third_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._first_ == child)
        {
            this._first_ = null;
            return;
        }

        if(this._tTerOp_ == child)
        {
            this._tTerOp_ = null;
            return;
        }

        if(this._second_ == child)
        {
            this._second_ = null;
            return;
        }

        if(this._tEq_ == child)
        {
            this._tEq_ = null;
            return;
        }

        if(this._third_ == child)
        {
            this._third_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._first_ == oldChild)
        {
            setFirst((PTerm) newChild);
            return;
        }

        if(this._tTerOp_ == oldChild)
        {
            setTTerOp((TTTerOp) newChild);
            return;
        }

        if(this._second_ == oldChild)
        {
            setSecond((PTerm) newChild);
            return;
        }

        if(this._tEq_ == oldChild)
        {
            setTEq((TTEq) newChild);
            return;
        }

        if(this._third_ == oldChild)
        {
            setThird((PTerm) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
