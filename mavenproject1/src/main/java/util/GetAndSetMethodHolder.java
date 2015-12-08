/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.lang.reflect.Method;

/**
 *
 * @author nyffeldd
 */
public class GetAndSetMethodHolder {
    String instanceVar;
    String type;
    Method getMethod;
    Method setMethod;
    Object o;
    
    public GetAndSetMethodHolder(Object o, String variableName, String className, Method getMethod, Method setMethod) {
        instanceVar = variableName;
        type = className;
        this.getMethod = getMethod;
        this.setMethod = setMethod;
        this.o = o;
    }
    
    public String toString()
    {
        return instanceVar;
    }
    
    public String getType()
    {
        return type;
    }
    
    public Object get()
    {
        try {
            Object [] args = {};
            return getMethod.invoke(o, args);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public void set(Object arg)
    {
        try {
            Object [] args = {arg};
            setMethod.invoke(o, args);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if(o instanceof draw.Panel)
        {
            ((draw.Panel)o).rePrime();
        }
    }
}
