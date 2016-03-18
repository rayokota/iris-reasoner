/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.deri.iris.parser.node;

import org.deri.iris.parser.analysis.*;

@SuppressWarnings("nls")
public final class AHexbinaryTerm extends PTerm
{
    private TTPreHex _tPreHex_;
    private TTLpar _tLpar_;
    private TTStr _tStr_;
    private TTRpar _tRpar_;

    public AHexbinaryTerm()
    {
        // Constructor
    }

    public AHexbinaryTerm(
        @SuppressWarnings("hiding") TTPreHex _tPreHex_,
        @SuppressWarnings("hiding") TTLpar _tLpar_,
        @SuppressWarnings("hiding") TTStr _tStr_,
        @SuppressWarnings("hiding") TTRpar _tRpar_)
    {
        // Constructor
        setTPreHex(_tPreHex_);

        setTLpar(_tLpar_);

        setTStr(_tStr_);

        setTRpar(_tRpar_);

    }

    @Override
    public Object clone()
    {
        return new AHexbinaryTerm(
            cloneNode(this._tPreHex_),
            cloneNode(this._tLpar_),
            cloneNode(this._tStr_),
            cloneNode(this._tRpar_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAHexbinaryTerm(this);
    }

    public TTPreHex getTPreHex()
    {
        return this._tPreHex_;
    }

    public void setTPreHex(TTPreHex node)
    {
        if(this._tPreHex_ != null)
        {
            this._tPreHex_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tPreHex_ = node;
    }

    public TTLpar getTLpar()
    {
        return this._tLpar_;
    }

    public void setTLpar(TTLpar node)
    {
        if(this._tLpar_ != null)
        {
            this._tLpar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tLpar_ = node;
    }

    public TTStr getTStr()
    {
        return this._tStr_;
    }

    public void setTStr(TTStr node)
    {
        if(this._tStr_ != null)
        {
            this._tStr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tStr_ = node;
    }

    public TTRpar getTRpar()
    {
        return this._tRpar_;
    }

    public void setTRpar(TTRpar node)
    {
        if(this._tRpar_ != null)
        {
            this._tRpar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tRpar_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tPreHex_)
            + toString(this._tLpar_)
            + toString(this._tStr_)
            + toString(this._tRpar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tPreHex_ == child)
        {
            this._tPreHex_ = null;
            return;
        }

        if(this._tLpar_ == child)
        {
            this._tLpar_ = null;
            return;
        }

        if(this._tStr_ == child)
        {
            this._tStr_ = null;
            return;
        }

        if(this._tRpar_ == child)
        {
            this._tRpar_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tPreHex_ == oldChild)
        {
            setTPreHex((TTPreHex) newChild);
            return;
        }

        if(this._tLpar_ == oldChild)
        {
            setTLpar((TTLpar) newChild);
            return;
        }

        if(this._tStr_ == oldChild)
        {
            setTStr((TTStr) newChild);
            return;
        }

        if(this._tRpar_ == oldChild)
        {
            setTRpar((TTRpar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
