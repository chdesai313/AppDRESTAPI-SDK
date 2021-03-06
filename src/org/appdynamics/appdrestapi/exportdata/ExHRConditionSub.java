/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.exportdata;

import org.appdynamics.appdrestapi.resources.AppExportS;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
/**
 *
 * @author gilbert.solorzano
 * L3
 * 
 */

@XmlSeeAlso(ExHRMetricExpression.class)
public class ExHRConditionSub {
    private String type;
    private String displayName;
    private String conditionValueType;
    private String conditionValue;
    private String operator;
    private boolean useActiveBaseline;
    private ExHRMetricExpression metricExpression;
    private int level=5;
    
    
    public ExHRConditionSub(){}

    @XmlTransient
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @XmlElement(name=AppExportS.TYPE)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name=AppExportS.DISPLAY_NAME)
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @XmlElement(name=AppExportS.CONDITION_VALUE_TYPE)
    public String getConditionValueType() {
        return conditionValueType;
    }

    public void setConditionValueType(String conditionValueType) {
        this.conditionValueType = conditionValueType;
    }

    @XmlElement(name=AppExportS.CONDITION_VALUE)
    public String getConditionValue() {
        return conditionValue;
    }

    public void setConditionValue(String conditionValue) {
        this.conditionValue = conditionValue;
    }

    @XmlElement(name=AppExportS.OPERATOR)
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @XmlElement(name=AppExportS.USE_ACTIVE_BASELINE)
    public boolean isUseActiveBaseline() {
        return useActiveBaseline;
    }

    public void setUseActiveBaseline(boolean useActiveBaseline) {
        this.useActiveBaseline = useActiveBaseline;
    }

    @XmlElement(name=AppExportS.METRIC_EXPRESSION)
    public ExHRMetricExpression getMetricExpression() {
        return metricExpression;
    }

    public void setMetricExpression(ExHRMetricExpression metricExpression) {
        this.metricExpression = metricExpression;
    }
    
    //NEES WORK
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.I[level]).append(AppExportS.TYPE).append(AppExportS.VE).append(type);
        level++;
        bud.append(AppExportS.I[level]).append(AppExportS.DISPLAY_NAME).append(AppExportS.VE).append(displayName);
        bud.append(AppExportS.I[level]).append(AppExportS.CONDITION_VALUE_TYPE).append(AppExportS.VE).append(conditionValueType);
        bud.append(AppExportS.I[level]).append(AppExportS.CONDITION_VALUE).append(AppExportS.VE).append(conditionValue);
        bud.append(AppExportS.I[level]).append(AppExportS.OPERATOR).append(AppExportS.VE).append(operator);
        bud.append(AppExportS.I[level]).append(AppExportS.USE_ACTIVE_BASELINE).append(AppExportS.VE).append(useActiveBaseline);
        if(metricExpression != null) {metricExpression.setLevel(level);bud.append(metricExpression);}
        level--;
        return bud.toString();
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + (this.type != null ? this.type.hashCode() : 0);
        hash = 83 * hash + (this.displayName != null ? this.displayName.hashCode() : 0);
        hash = 83 * hash + (this.conditionValueType != null ? this.conditionValueType.hashCode() : 0);
        hash = 83 * hash + (this.conditionValue != null ? this.conditionValue.hashCode() : 0);
        hash = 83 * hash + (this.operator != null ? this.operator.hashCode() : 0);
        hash = 83 * hash + (this.useActiveBaseline ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ExHRConditionSub other = (ExHRConditionSub) obj;
        if ((this.type == null) ? (other.type != null) : !this.type.equals(other.type)) {
            return false;
        }
        if ((this.displayName == null) ? (other.displayName != null) : !this.displayName.equals(other.displayName)) {
            return false;
        }
        if ((this.conditionValueType == null) ? (other.conditionValueType != null) : !this.conditionValueType.equals(other.conditionValueType)) {
            return false;
        }
        if ((this.conditionValue == null) ? (other.conditionValue != null) : !this.conditionValue.equals(other.conditionValue)) {
            return false;
        }
        if ((this.operator == null) ? (other.operator != null) : !this.operator.equals(other.operator)) {
            return false;
        }
        if (this.useActiveBaseline != other.useActiveBaseline) {
            return false;
        }
        if (this.metricExpression != other.metricExpression && (this.metricExpression == null || !this.metricExpression.equals(other.metricExpression))) {
            return false;
        }
        return true;
    }
    
    
}

/*
 * <condition1>
                        <type>leaf</type>
                        <display-name>Average Response Time (ms) Baseline Condition</display-name>
                        <condition-value-type>BASELINE_STANDARD_DEVIATION</condition-value-type>
                        <condition-value>3</condition-value>
                        <operator>GREATER_THAN</operator>
                        <condition-expression/>
                        <use-active-baseline>true</use-active-baseline>
                        <metric-expression>
                            <type>leaf</type>
                            <function-type>VALUE</function-type>
                            <value>0</value>
                            <is-literal-expression>false</is-literal-expression>
                            <display-name>null</display-name>
                            <metric-definition>
                                <type>LOGICAL_METRIC</type>
                                <logical-metric-name>Average Response Time (ms)</logical-metric-name>
                            </metric-definition>
                        </metric-expression>
                    </condition1>
                    * 
 */